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
package org.switchyard.tools.ui.editor.diagram.component.wizards;

import java.io.IOException;
import java.net.URI;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringFactory;
import org.switchyard.tools.models.switchyard1_0.spring.ToDefinition;
import org.switchyard.tools.ui.editor.core.ModelHandler;
import org.switchyard.tools.ui.editor.core.ModelHandlerLocator;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddComponentImplementationCamelPage extends BaseWizardPage implements IRefreshablePage {

    private Text _camelRouteToText;
    private String _camelRouteTo = null;
    private IWizardPage _startPage = null;

    /**
     * @param start Start page
     * @param pageName Page name
     */
    public SCADiagramAddComponentImplementationCamelPage(IWizardPage start, String pageName) {
        this(pageName);
        this._startPage = start;

    }

    protected SCADiagramAddComponentImplementationCamelPage(String pageName) {
        super(pageName);
        setTitle("Specify Camel Implementation Details");
        setDescription("Specify the details for the Camel route.");
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        composite.setLayout(gl);
        // Component service name
        new Label(composite, SWT.NONE).setText("To:");
        _camelRouteToText = new Text(composite, SWT.BORDER);
        _camelRouteToText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                handleModify();
            }
        });
        _camelRouteToText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        setControl(composite);

        validate();
        setErrorMessage(null);
    }

    /**
     * @return String for camel route
     */
    public String getCamelRouteString() {
        return this._camelRouteTo;
    }

    private Implementation getImplementationFromStartPage() {
        if (_startPage != null) {
            if (_startPage instanceof SCADiagramAddComponentStartPage) {
                SCADiagramAddComponentStartPage componentStart = (SCADiagramAddComponentStartPage) _startPage;
                return componentStart.getImplementation();
            } else if (_startPage instanceof SCADiagramAddImplementationStartPage) {
                SCADiagramAddImplementationStartPage implementationStart = (SCADiagramAddImplementationStartPage) _startPage;
                return implementationStart.getImplementation();
            }
        }
        return null;
    }

    private void handleModify() {
        _camelRouteTo = _camelRouteToText.getText().trim();
        validate();
        if (_startPage != null) {
            Diagram diagram = null;
            if (getWizard() instanceof SCADiagramAddImplementationWizard) {
                diagram = ((SCADiagramAddImplementationWizard) getWizard()).getDiagram();
            } else if (getWizard() instanceof SCADiagramAddComponentWizard) {
                diagram = ((SCADiagramAddComponentWizard) getWizard()).getDiagram();
            }
            if (diagram != null) {
                ModelHandler mh;
                try {
                    mh = ModelHandlerLocator.getModelHandler(diagram.eResource());
                    Implementation impl = getImplementationFromStartPage();
                    if (impl instanceof CamelImplementationType) {
                        CamelImplementationType camelImpl = (CamelImplementationType) impl;
                        RouteDefinition defn = camelImpl.getRoute();
                        boolean alreadyExists = false;
                        if (defn != null) {
                            EList<ToDefinition> toDefs = defn.getTo();
                            for (ToDefinition toDefinition : toDefs) {
                                if (toDefinition.getUri().contentEquals(_camelRouteTo)) {
                                    alreadyExists = true;
                                    break;
                                }
                            }
                        }
                        EList<ToDefinition> toDefs = null;
                        if (!alreadyExists) {
                            defn = mh.createRouteDefinition(camelImpl);
                            toDefs = defn.getTo();
                        } else {
                            toDefs = defn.getTo();
                        }
                        if (defn != null && toDefs != null) {
                            ToDefinition todef = SpringFactory.eINSTANCE.createToDefinition();
                            todef.setUri(_camelRouteTo);
                            toDefs.add(todef);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void validate() {
        String errorMessage = null;
        String cpName = _camelRouteToText.getText();

        if (cpName == null || cpName.trim().length() == 0) {
            errorMessage = "No URI specified";
        } else if (cpName.trim().length() < cpName.length()) {
            errorMessage = "No spaces allowed in To URI";
        } else {
            try {
                URI.create(cpName);
            } catch (IllegalArgumentException e) {
                errorMessage = "Invalid URI for To";
            }
        }
        setErrorMessage(errorMessage);
        setPageComplete(errorMessage == null);
    }

    @Override
    public boolean getSkippable() {
        if (_startPage != null) {
            Implementation impl = getImplementationFromStartPage();
            if (impl != null) {
                return true;
            }
//            if (impl instanceof CamelImplementationType) {
//                return false;
//            } else {
//                return true;
//            }
        }
        return super.getSkippable();
    }

    @Override
    public void refresh() {
        if (_startPage != null) {
            Implementation impl = getImplementationFromStartPage();
            if (impl instanceof CamelImplementationType) {
                CamelImplementationType camelImpl = (CamelImplementationType) impl;
                if (camelImpl.getRoute() != null) {
                    RouteDefinition defn = camelImpl.getRoute();
                    if (!defn.getTo().isEmpty()) {
                        _camelRouteToText.setText(defn.getTo().get(0).getUri());
                    }
                }
            }
        }
    }
}
