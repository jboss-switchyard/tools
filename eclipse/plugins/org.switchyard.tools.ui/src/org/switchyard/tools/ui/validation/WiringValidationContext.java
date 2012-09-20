/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.switchyard.metadata.ServiceInterface;
import org.switchyard.metadata.ServiceOperation;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.JavaUtil;
import org.switchyard.tools.ui.SwitchYardModelUtils;

/**
 * WiringValidationContext
 * 
 * <p/>
 * Contains contextual information used when validating services.
 * 
 * @see ServiceWiringConstraints
 */
final class WiringValidationContext {
    private Map<QName, Set<QName>> _transformers = new HashMap<QName, Set<QName>>();
    private Map<String, Set<Contract>> _names = new HashMap<String, Set<Contract>>();
    private Map<Contract, ServiceInterface> _serviceInterfaces = new HashMap<Contract, ServiceInterface>();
    private Map<Contract, Set<Contract>> _wires = new HashMap<Contract, Set<Contract>>();
    private IStatus _contextStatus;
    private List<IStatus> _problems = new ArrayList<IStatus>();

    WiringValidationContext(IValidationContext ctx, SwitchYardType switchyard) {
        collectNamesAndWires(switchyard);
        collectServiceInterfaces(switchyard);
        collectTransformers(switchyard);
        if (!_problems.isEmpty()) {
            _contextStatus = ConstraintStatus.createMultiStatus(ctx, _problems);
        }
        _problems.clear();
        _problems = null;
    }

    /**
     * Map of names to services and references. Only includes component services
     * if they are not promoted.
     */
    Map<String, Set<Contract>> getNames() {
        return _names;
    }

    /**
     * Service interfaces for each Contract.
     */
    Map<Contract, ServiceInterface> getServiceInterfaces() {
        return _serviceInterfaces;
    }

    /**
     * Wires for promoted services/references and wires for resolved component
     * references.
     */
    Map<Contract, Set<Contract>> getWires() {
        return _wires;
    }

    /**
     * Transformers declared in the configuration.
     */
    Map<QName, Set<QName>> getTranformers() {
        return _transformers;
    }

    /**
     * @return any problems during context loading.
     */
    IStatus getContextStatus() {
        return _contextStatus;
    }

    private void collectTransformers(SwitchYardType switchyard) {
        for (Iterator<EObject> it = EcoreUtil.getAllContents(switchyard.eResource(), false); it.hasNext();) {
            EObject nextObject = it.next();
            if (SwitchyardPackage.eINSTANCE.getTransformType().isInstance(nextObject)) {
                addTransformer((TransformType) nextObject);

            }
        }
    }

    private void addTransformer(TransformType transformer) {
        if (transformer.getFrom() == null || transformer.getTo() == null) {
            return;
        }
        QName from = QName.valueOf(transformer.getFrom());
        QName to = QName.valueOf(transformer.getTo());
        Set<QName> tos = _transformers.get(from);
        if (tos == null) {
            tos = new HashSet<QName>();
            _transformers.put(from, tos);
        }
        tos.add(to);
    }

    private void collectNamesAndWires(SwitchYardType switchyard) {
        if (switchyard == null || switchyard.getComposite() == null) {
            return;
        }
        Composite composite = switchyard.getComposite();
        for (Service service : composite.getService()) {
            addWires(service);
            if (service.getName() == null) {
                continue;
            }
            Set<Contract> contracts = new LinkedHashSet<Contract>();
            contracts.add(service);
            _names.put(service.getName(), contracts);
        }
        for (Reference reference : composite.getReference()) {
            addWires(reference);
            if (reference.getName() == null) {
                continue;
            }
            Set<Contract> contracts = _names.get(reference.getName());
            if (contracts == null) {
                contracts = new LinkedHashSet<Contract>();
                _names.put(reference.getName(), contracts);
            }
            contracts.add(reference);
        }
        for (Component component : composite.getComponent()) {
            for (ComponentService service : component.getService()) {
                if (service.getName() == null) {
                    break;
                }
                Set<Contract> contracts = _names.get(service.getName());
                if (contracts == null) {
                    contracts = new LinkedHashSet<Contract>();
                    _names.put(service.getName(), contracts);
                }
                contracts.add(service);
                break;
            }
        }
        for (Component component : composite.getComponent()) {
            for (ComponentReference reference : component.getReference()) {
                if (reference.getName() == null || !_names.containsKey(reference.getName())) {
                    continue;
                }
                addWiresForReference(reference, _names.get(reference.getName()));
            }
        }
    }

    private void addWires(Service service) {
        if (service.getPromote() == null) {
            return;
        }
        addWires(service, Collections.singleton(service.getPromote()));
        addWires(service.getPromote(), Collections.singleton(service));
    }

    private void addWires(Reference reference) {
        if (reference.getPromote().isEmpty()) {
            return;
        }
        addWires(reference, reference.getPromote());
        for (ComponentReference promotedReference : reference.getPromote()) {
            addWires(promotedReference, Collections.singleton(reference));
        }
    }

    private void addWiresForReference(ComponentReference reference, Collection<Contract> contracts) {
        addWires(reference, contracts);
        for (Contract contract : contracts) {
            addWires(contract, Collections.singleton(reference));
        }
    }

    private void addWires(Contract source, Collection<? extends Contract> targets) {
        Set<Contract> contracts = _wires.get(source);
        if (contracts == null) {
            contracts = new HashSet<Contract>(targets);
            _wires.put(source, contracts);
            return;
        }
        contracts.addAll(targets);
    }

    private void collectServiceInterfaces(SwitchYardType switchyard) {
        if (switchyard == null) {
            return;
        }
        ClassLoader oldTCCL = Thread.currentThread().getContextClassLoader();
        try {
            Thread.currentThread().setContextClassLoader(
                    JavaUtil.getProjectClassLoader(
                            JavaCore.create(WorkspaceSynchronizer.getFile(switchyard.eResource()).getProject()), null));
            for (Iterator<EObject> it = EcoreUtil.getAllContents(switchyard, true); it.hasNext();) {
                EObject eobject = it.next();
                if (eobject instanceof Contract) {
                    Interface intf = ((Contract) eobject).getInterface();
                    if (intf == null) {
                        continue;
                    }
                    try {
                        ServiceInterface si = SwitchYardModelUtils.getServiceInterface(intf);
                        if (si != null) {
                            _serviceInterfaces.put((Contract) eobject, si);
                        }
                    } catch (Exception e) {
                        _serviceInterfaces.put((Contract) eobject, URESOLVABLE_SERVICE_INTERFACE);
                    }
                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
            _problems.add(new Status(Status.WARNING, Activator.PLUGIN_ID,
                    "Error loading service interface meta-data.  Interface compatibility cannot be verified."));
        } finally {
            Thread.currentThread().setContextClassLoader(oldTCCL);
        }
    }

    static final ServiceInterface URESOLVABLE_SERVICE_INTERFACE = new ServiceInterface() {
        @Override
        public String getType() {
            return null;
        }

        @Override
        public Set<ServiceOperation> getOperations() {
            return Collections.emptySet();
        }

        @Override
        public ServiceOperation getOperation(String name) {
            return null;
        }
    };
}
