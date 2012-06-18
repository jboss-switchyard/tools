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
package org.switchyard.tools.ui.editor.diagram.shared;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.switchyard.tools.models.switchyard1_0.jca.Connection;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection;
import org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;
import org.switchyard.tools.models.switchyard1_0.jca.Property;
import org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 * 
 */
public class JCABindingOutboundComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private Composite _panel;
    private JCABinding _binding = null;
    private Object _targetObj = null;
    private Text _resourceAdapterText;
    private Text _connectionJNDINameText;
    private Button _browseResourceAdapterButton;
    private JCAPropertyTable _propsList;
    private Combo _processorMappingTypeCombo;
    private enum ENDPOINT_MAPPING_TYPE {
        JMSPROCESSOR, CCIPROCESSOR
    }

    @Override
    public Binding getBinding() {
        return this._binding;
    }

    @Override
    public void setBinding(Binding impl) {
        if (impl instanceof JCABinding) {
            this._binding = (JCABinding) impl;
            setInUpdate(true);
            _propsList.setTargetObject(this._binding);
            if (this._binding.getOutboundConnection() != null) {
                JCAOutboundConnection outbound = this._binding.getOutboundConnection();
                if (outbound.getResourceAdapter() != null) {
                    this._resourceAdapterText.setText(outbound.getResourceAdapter().getName());
                }
                if (outbound.getConnection() != null) {
                    this._connectionJNDINameText.setText(outbound.getConnection().getJndiName());
                }

                if (_binding.getOutboundInteraction() != null) {
                    JCAOutboundInteraction interaction = _binding.getOutboundInteraction();
                    if (interaction.getProcessor() != null) {
                        String className = interaction.getProcessor().getType();
                        className = className.substring(className.lastIndexOf('.') + 1);
                        _processorMappingTypeCombo.setText(className);
                        
                        EList<Property> properties = interaction.getProcessor().getProperty();
                        _propsList.setSelection(properties);
                    }
                }
            }
            setInUpdate(false);
            validate();
        } else {
            this._binding = null;
        }
    }

    @Override
    protected boolean validate() {
        return true;
    }

    @Override
    public void createContents(Composite parent, int style) {
        _panel = new Composite(parent, style);
        _panel.setLayout(new FillLayout());
        if (getRootGridData() != null) {
            _panel.setLayoutData(getRootGridData());
        }
        TabFolder tabFolder = new TabFolder(_panel, SWT.NONE);

        TabItem one = new TabItem(tabFolder, SWT.NONE);
        one.setText("JCA Outbound Binding");
        one.setControl(getJCATabControl(tabFolder));
    }

    private Control getJCATabControl(TabFolder tabFolder) {
        Composite composite = new Composite(tabFolder, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        composite.setLayout(gl);

        Group outboundConnectionGroup = new Group(composite, SWT.NONE);
        outboundConnectionGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        outboundConnectionGroup.setLayout(new GridLayout(3, false));
        outboundConnectionGroup.setText("Outbound Connection Options");

        _resourceAdapterText = createLabelAndText(outboundConnectionGroup, "Resource Adapter Archive");
        _browseResourceAdapterButton = new Button(outboundConnectionGroup, SWT.PUSH);
        _browseResourceAdapterButton.setText("Browse...");
        _browseResourceAdapterButton.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                IJavaProject javaProject = null;
                if (modelFile != null) {
                    if (modelFile.getProject() != null) { //$NON-NLS-1$
                        javaProject = JavaCore.create(modelFile.getProject());
                    }
                }
                IResource result = browse(_panel.getShell(), javaProject);
                if (result != null) {
                    setHasChanged(true);
                    handleModify(_browseResourceAdapterButton);
                    fireChangedEvent(_browseResourceAdapterButton);
                }
            }
        });

        _connectionJNDINameText = createLabelAndText(outboundConnectionGroup, "JNDI Name");

        Group outboundInteractionGroup = new Group(composite, SWT.NONE);
        outboundInteractionGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        outboundInteractionGroup.setLayout(new GridLayout(2, false));
        outboundInteractionGroup.setText("Outbound Interaction Options");

        _processorMappingTypeCombo = createLabelAndCombo(outboundInteractionGroup, "Endpoint Mapping Type", true);
        _processorMappingTypeCombo.add("JMSProcessor", ENDPOINT_MAPPING_TYPE.JMSPROCESSOR.ordinal());
        _processorMappingTypeCombo.setData("JMSProcessor", ENDPOINT_MAPPING_TYPE.JMSPROCESSOR);
        _processorMappingTypeCombo.add("CCIProcessor", ENDPOINT_MAPPING_TYPE.CCIPROCESSOR.ordinal());
        _processorMappingTypeCombo.setData("CCIProcessor", ENDPOINT_MAPPING_TYPE.CCIPROCESSOR);

      Group activationPropsGroup = new Group(outboundInteractionGroup, SWT.NONE);
      activationPropsGroup.setText("Processor Properties");
      activationPropsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
      activationPropsGroup.setLayout(new GridLayout(1, false));

      _propsList = new JCAProcessorPropertyTable(activationPropsGroup, SWT.NONE);
      _propsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 4));
        _propsList.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if (_binding != null && !inUpdate() && hasChanged()) {
                    validate();
                    handleModify(_propsList);
                    fireChangedEvent(_propsList);
                }
            }
        });
        
        return composite;
    }

    @Override
    public Composite getPanel() {
        return this._panel;
    }

    private void setFeatureValue(EObject eObject, String featureId, Object value) {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    break;
                }
            }
        }
    }

    @SuppressWarnings("restriction")
    protected void handleModify(final Control control) {
        TransactionalEditingDomain domain = null;
        if (_binding.eContainer() != null) {
            domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
        }
        if (control.equals(_resourceAdapterText) || control.equals(_browseResourceAdapterButton)) {
            if (_binding.eContainer() != null && domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getOutboundConnection() == null) {
                            JCAOutboundConnection outbound = JcaFactory.eINSTANCE.createJCAOutboundConnection();
                            setFeatureValue(_binding, "outboundConnection", outbound);
                        }
                        if (_binding.getOutboundConnection().getResourceAdapter() == null) {
                            ResourceAdapter resAdapter = JcaFactory.eINSTANCE.createResourceAdapter();
                            resAdapter.setType("javax.resource.spi.ResourceAdapter");
                            setFeatureValue(_binding.getOutboundConnection(), "resourceAdapter", resAdapter);
                        }
                        setFeatureValue(_binding.getOutboundConnection().getResourceAdapter(), "name", _resourceAdapterText.getText().trim());
                    }
                });
            } else {
                if (_binding.getOutboundConnection() == null) {
                    JCAOutboundConnection outbound = JcaFactory.eINSTANCE.createJCAOutboundConnection();
                    setFeatureValue(_binding, "outboundConnection", outbound);
                }
                if (_binding.getOutboundConnection().getResourceAdapter() == null) {
                    ResourceAdapter resAdapter = JcaFactory.eINSTANCE.createResourceAdapter();
                    resAdapter.setType("javax.resource.spi.ResourceAdapter");
                    setFeatureValue(_binding.getOutboundConnection(), "resourceAdapter", resAdapter);
                }
                setFeatureValue(_binding.getOutboundConnection().getResourceAdapter(), "name", _resourceAdapterText.getText().trim());
            }
        } else if (control.equals(_connectionJNDINameText)) {
            if (_binding.eContainer() != null && domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getOutboundConnection() == null) {
                            JCAOutboundConnection outbound = JcaFactory.eINSTANCE.createJCAOutboundConnection();
                            setFeatureValue(_binding, "outboundConnection", outbound);
                        }
                        if (_binding.getOutboundConnection().getConnection() == null) {
                            Connection outConnection = JcaFactory.eINSTANCE.createConnection();
                            setFeatureValue(_binding.getOutboundConnection(), "connection", outConnection);
                        }
                        setFeatureValue(_binding.getOutboundConnection().getConnection(), "jndiName", _connectionJNDINameText.getText().trim());
                    }
                });
            } else {
                if (_binding.getOutboundConnection() == null) {
                    JCAOutboundConnection outbound = JcaFactory.eINSTANCE.createJCAOutboundConnection();
                    setFeatureValue(_binding, "outboundConnection", outbound);
                }
                if (_binding.getOutboundConnection().getConnection() == null) {
                    Connection outConnection = JcaFactory.eINSTANCE.createConnection();
                    setFeatureValue(_binding.getOutboundConnection(), "connection", outConnection);
                }
                setFeatureValue(_binding.getOutboundConnection().getConnection(), "jndiName", _connectionJNDINameText.getText().trim());
            }
        } else if (control.equals(_propsList)) {
            final EList<Property> properties = _propsList.getSelection();
            if (_binding.eContainer() != null && domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        if (_binding.getOutboundInteraction() == null) {
                            JCAOutboundInteraction outbound = JcaFactory.eINSTANCE.createJCAOutboundInteraction();
                            setFeatureValue(_binding, "outboundInteraction", outbound);
                        }
                        if (_binding.getOutboundInteraction().getProcessor() == null) {
                            Processor processor = JcaFactory.eINSTANCE.createProcessor();
                            setFeatureValue(_binding.getOutboundInteraction(), "processor", processor);
                        }
                        _binding.getOutboundInteraction().getProcessor().getProperty().clear();
                        _binding.getOutboundInteraction().getProcessor().getProperty().addAll(properties);
                    }
                });
            } else {
                if (_binding.getOutboundInteraction() == null) {
                    JCAOutboundInteraction outbound = JcaFactory.eINSTANCE.createJCAOutboundInteraction();
                    setFeatureValue(_binding, "outboundInteraction", outbound);
                }
                if (_binding.getOutboundInteraction().getProcessor() == null) {
                    Processor processor = JcaFactory.eINSTANCE.createProcessor();
                    setFeatureValue(_binding.getOutboundInteraction(), "processor", processor);
                }
                _binding.getOutboundInteraction().getProcessor().getProperty().clear();
                _binding.getOutboundInteraction().getProcessor().getProperty().addAll(properties);
            }
        } else if (control.equals(_processorMappingTypeCombo)) {
            if (_binding.eContainer() != null && domain != null) {
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        handleUpdateProcessor();
                    }
                });
            } else {
                handleUpdateProcessor();
            }
        }
        setHasChanged(false);
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(Object target) {
        this._targetObj = target;
    }

    private void handleUpdateProcessor() {
        if (_binding.getOutboundInteraction() == null) {
            JCAOutboundInteraction interaction = JcaFactory.eINSTANCE.createJCAOutboundInteraction();
            setFeatureValue(_binding, "outboundInteraction", interaction);
        }
        JCAOutboundInteraction interaction = _binding.getOutboundInteraction();
        ENDPOINT_MAPPING_TYPE type = (ENDPOINT_MAPPING_TYPE) _processorMappingTypeCombo.getData(_processorMappingTypeCombo.getText());
        String destination = null;
        String processorClass = null;
        boolean foundProcessor = true;
        switch (type) {
            case JMSPROCESSOR:
                destination = "TestQueue";
                processorClass = "org.switchyard.component.jca.processor.JMSProcessor";
                break;
            case CCIPROCESSOR:
                processorClass = "org.switchyard.component.jca.processor.CCIProcessor";
                break;
            default:
                foundProcessor = false;
                break;
        }
        
        if (foundProcessor) {
            
            if (interaction.getProcessor() == null) {
                Processor processor = JcaFactory.eINSTANCE.createProcessor();
                interaction.setProcessor(processor);
            }
            setFeatureValue(interaction.getProcessor(), "type", processorClass);
            
            if (!interaction.getProcessor().getProperty().isEmpty()) {
                interaction.getProcessor().getProperty().clear();
            }
            if (destination != null) {
                Property prop = JcaFactory.eINSTANCE.createProperty();
                prop.setName("destination");
                prop.setValue("queue");
                interaction.getProcessor().getProperty().add(prop);
            }
            
            EList<Property> properties = interaction.getProcessor().getProperty();
            _propsList.setSelection(properties);
        }
    }


    @Override
    public void focusLost(FocusEvent e) {
        if (_binding != null && !inUpdate() && hasChanged()) {
            validate();
            handleModify((Control) e.getSource());
            fireChangedEvent((Control) e.getSource());
        } else {
            validate();
            fireChangedEvent((Control) e.getSource());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.keyCode == SWT.ESC) {
            // cancel out and return to original value
            setInUpdate(true);
            if (_binding != null) {
                Control control = (Control) e.getSource();
                 if (control.equals(_resourceAdapterText)) {
                     _resourceAdapterText.setText(_binding.getInboundConnection().getResourceAdapter().getName());
                }
            }
            setInUpdate(false);
        } else if (e.keyCode == SWT.CR) {
            // accept change
            if (_binding != null && !inUpdate() && hasChanged()) {
                validate();
                handleModify((Control) e.getSource());
                fireChangedEvent((Control) e.getSource());
            }
        } else if (e.keyCode == SWT.TAB) {
            if (_binding != null && !inUpdate() && hasChanged()) {
                boolean flag = validate();
                if (flag) {
                    handleModify((Control) e.getSource());
                }
                fireChangedEvent((Control) e.getSource());
            }
        }
    }

    /**
     * @param shell Shell for dialog
     * @param project java project to use for resolving classpaths
     * @return PortType result
     */
    public IResource browse(Shell shell, IJavaProject project) {
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(shell, project == null ? ResourcesPlugin
                .getWorkspace().getRoot() : project.getProject());
        dialog.setInitialPattern("*.jar,*.rar");
        if (dialog.open() == ClasspathResourceSelectionDialog.OK) {
            IResource result = (IResource) dialog.getFirstResult();
            if (result != null) {
                _resourceAdapterText.setText(result.getName());
                return result;
            }
        }
        return null;
    }
}
