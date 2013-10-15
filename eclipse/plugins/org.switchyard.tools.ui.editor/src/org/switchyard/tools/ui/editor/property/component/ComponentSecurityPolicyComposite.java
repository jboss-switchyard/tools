/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property.component;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.property.AbstractModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class ComponentSecurityPolicyComposite extends AbstractModelComposite<Component> {

    private static final String AUTHORIZATION = "authorization"; //$NON-NLS-1$
    private boolean _inUpdate = false;
    private Button _authorizationCheckbox;
    private ArrayList<String> _supportedSecurityPolicies;
    private CheckboxSelectionListener _listener = null;
    
    /**
     * Create a new SecurityPolicyComposite.
     * 
     * @param container the container
     * @param parent the parent composite
     * @param style style bits
     */
    public ComponentSecurityPolicyComposite(ICompositeContainer container, Composite parent, int style) {
        super(Component.class, container, parent, style);

        _supportedSecurityPolicies = new ArrayList<String>();
        _supportedSecurityPolicies.add(AUTHORIZATION);

        FormLayout layout = new FormLayout();
        layout.marginBottom = ITabbedPropertyConstants.VMARGIN;
        layout.marginTop = ITabbedPropertyConstants.VMARGIN;
        layout.marginLeft = ITabbedPropertyConstants.HMARGIN;
        layout.marginRight = ITabbedPropertyConstants.HMARGIN;
        setLayout(layout);

        FormToolkit factory = getWidgetFactory();

        _authorizationCheckbox = factory.createButton(this, Messages.label_authorization, SWT.CHECK);
        FormData data = new FormData();
        data.left = new FormAttachment(1, 0);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, 0);
        _authorizationCheckbox.setLayoutData(data);
        _listener = new CheckboxSelectionListener();
        _authorizationCheckbox.addSelectionListener(_listener);
        _authorizationCheckbox.setData(AUTHORIZATION);
    }

    private void updatePolicy(final EObject target, final Button control) {
        final String securityPolicy = (String) control.getData();
        wrapOperation(new Runnable() {
            @Override
            public void run() {
                if (target instanceof Implementation) {
                    final Implementation impl = (Implementation) target;
                    if (impl != null) {
                        List<QName> requires = impl.getRequires();
                        ArrayList<String> existing = new ArrayList<String>();
                        
                        if (requires != null) {
                            for (QName requiresItem : requires) {
                                String localPart = requiresItem.getLocalPart();
                                existing.add(localPart);
                            }
                            if (existing.contains(securityPolicy)) {
                                existing.remove(securityPolicy);
                            }
                        }
                        impl.setRequires(null);
                        requires = new ArrayList<QName>();
                        for (String existingItem : existing) {
                            QName newQName = new QName(existingItem);
                            requires.add(newQName);
                        }
                        if (control.getSelection()) {
                            QName newQName = new QName(securityPolicy);
                            requires.add(newQName);
                        }
                        if (!requires.isEmpty()) {
                            impl.setRequires(requires);
                        }
                    }
                }
            }
        });
    }

    @Override
    public void refresh() {
        _inUpdate = true;
        try {
            boolean authorization = false;
            boolean showAuthorizationCheckbox = true;
            _authorizationCheckbox.setSelection(false);
            Component component = getTargetObject();
            if (component != null) {
                if (component.getImplementation() != null) {
                    final Implementation impl = (Implementation) component.getImplementation();
                    if (impl != null) {
                        List<QName> implrequires = impl.getRequires();
                        if (implrequires != null) {
                            for (QName requiresItem : implrequires) {
                                String localPart = requiresItem.getLocalPart();
                                if (AUTHORIZATION.contentEquals(localPart)) {
                                    authorization = true;
                                }
                            }
                        }
                    }
                }
                if (component.eContainer() instanceof Component && component instanceof ComponentReference) {
                    showAuthorizationCheckbox = false;
                }
            }

            if (!_authorizationCheckbox.isDisposed()) {
                _authorizationCheckbox.setEnabled(showAuthorizationCheckbox);
            }

            if (authorization && _authorizationCheckbox != null && !_authorizationCheckbox.isDisposed()) {
                _authorizationCheckbox.setSelection(authorization);
            }
            
        } finally {
            _inUpdate = false;
        }
    }

    private class CheckboxSelectionListener implements SelectionListener {
        @Override
        public void widgetSelected(SelectionEvent e) {
            widgetDefaultSelected(e);
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            if (e.widget.equals(_authorizationCheckbox)) {
                final Component component = getTargetObject();
                if (component.getImplementation() != null) {
                    final Implementation impl = (Implementation) component.getImplementation();
                    if (impl != null && !_inUpdate) {
                        Button button = (Button) e.widget;
                        updatePolicy(impl, button);
                    }
                }
            }
        }
    }

    /* (non-Javadoc)
     * @see org.eclipse.swt.widgets.Widget#dispose()
     */
    @Override
    public void dispose() {
        _authorizationCheckbox.removeSelectionListener(_listener);
        super.dispose();
    }
}
