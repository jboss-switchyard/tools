/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.jca;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.emf.databinding.edit.IEMFEditObservable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec;
import org.switchyard.tools.models.switchyard1_0.jca.Endpoint;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Processor;
import org.switchyard.tools.models.switchyard1_0.jca.Property;

/**
 * Provides access to a named Property in a List<Property>.
 */
public class JCANamedPropertyObservableValue extends AbstractObservableValue {

    private final IObservableList _list;
    private final String _name;
    private Property _property;
    private final Object _type;
    private final boolean _removeNullProperties;
    private final IChangeListener _listener = new IChangeListener() {
        @Override
        public void handleChange(ChangeEvent event) {
            handleListChange();
        }
    };

    /**
     * Create a new JCANamedPropertyObservableValue.
     * 
     * @param realm the realm
     * @param list the property list
     * @param name the name of the property
     * @param type the value type
     */
    public JCANamedPropertyObservableValue(Realm realm, IObservableList list, String name, Object type) {
        super(realm);
        _list = list;
        _name = name;
        _property = findProperty();
        _type = type;
        _removeNullProperties = false;
        _list.addChangeListener(_listener);
    }

    /**
     * Create a new JCANamedPropertyObservableValue.
     * 
     * @param realm the realm
     * @param list the property list
     * @param name the name of the property
     * @param type the value type
     * @param removeNullProps true/false to remove properties with a null value
     */
    public JCANamedPropertyObservableValue(Realm realm, IObservableList list, String name, Object type, boolean removeNullProps) {
        super(realm);
        _list = list;
        _name = name;
        _property = findProperty();
        _type = type;
        _removeNullProperties = removeNullProps;
        _list.addChangeListener(_listener);
    }

    /**
     * Create a new JCANamedPropertyObservableValue.
     * 
     * @param realm the realm
     * @param list the property list
     * @param name the name of the property
     */
    public JCANamedPropertyObservableValue(Realm realm, IObservableList list, String name) {
        super(realm);
        _list = list;
        _name = name;
        _property = findProperty();
        _type = String.class;
        _removeNullProperties = false;
        
        _list.addChangeListener(_listener);
    }

    /**
     * Create a new JCANamedPropertyObservableValue.
     * 
     * @param realm the realm
     * @param list the property list
     * @param name the name of the property
     * @param removeNullProps true/false to remove properties with a null value
     */
    public JCANamedPropertyObservableValue(Realm realm, IObservableList list, String name, boolean removeNullProps) {
        super(realm);
        _list = list;
        _name = name;
        _property = findProperty();
        _type = String.class;
        _removeNullProperties = removeNullProps;
        
        _list.addChangeListener(_listener);
    }

    @Override
    public Object getValueType() {
        return _type;
    }

    @Override
    public synchronized void dispose() {
        if (!_list.isDisposed()) {
            _list.removeChangeListener(_listener);
        }
        super.dispose();
    }

    @Override
    protected Object doGetValue() {
        if (_property == null) {
            return null;
        }
        return _property.getValue();
    }
    
    private Property createProperty(String name, Object value) {
        Property newProperty = JcaFactory.eINSTANCE.createProperty();
        newProperty.setName(name);
        newProperty.setValue(value);
        return newProperty;
    }

    @Override
    protected void doSetValue(Object value) {
        final Object original;
        if (_property == null) {
            original = null;

            if (value == null) {
                return;
            }

            _property = createProperty(_name, value);
            _list.add(_property);
        } else {
            original = _property.getValue();
            if ((value == null && original == null) || (value != null && value.equals(original))) {
                return;
            }
            final EditingDomain domain = ((IEMFEditObservable) _list).getEditingDomain();
            final EObject container = _property.eContainer();
            final TransactionalEditingDomain ted = (TransactionalEditingDomain) domain;
            if (findProperty() != null && !_removeNullProperties && value != null) {
                if (container instanceof ActivationSpec) {
                    ted.getCommandStack().execute(new RecordingCommand(ted) {
                        @Override
                        protected void doExecute() {
                            ActivationSpec activationSpec = (ActivationSpec) container;
                            boolean flag = activationSpec.getProperty().remove(_property);
                            System.out.println("Property was removed: " + flag);
                        }
                    });
                } else if (container instanceof Processor) {
                    ted.getCommandStack().execute(new RecordingCommand(ted) {
                        @Override
                        protected void doExecute() {
                            Processor processor = (Processor) container;
                            boolean flag = processor.getProperty().remove(_property);
                            System.out.println("Property was removed: " + flag);
                        }
                    });
                }
                _property = createProperty(_name, value);
            }
            if (_list instanceof IEMFEditObservable) {
                System.out.println("Container = " + container);
                if (!_removeNullProperties) {
                    if (container instanceof ActivationSpec) {
                        ted.getCommandStack().execute(new RecordingCommand(ted) {
                            @Override
                            protected void doExecute() {
                                ActivationSpec activationSpec = (ActivationSpec) container;
                                boolean flag = activationSpec.getProperty().add(_property);
                                System.out.println("Property was added: " + flag);
                            }
                        });
                    } else if (container instanceof Processor) {
                        ted.getCommandStack().execute(new RecordingCommand(ted) {
                            @Override
                            protected void doExecute() {
                                Processor processor = (Processor) container;
                                boolean flag = processor.getProperty().add(_property);
                                System.out.println("Property was added: " + flag);
                            }
                        });
                    }
//                    domain.getCommandStack().execute(
//                            SetCommand.create(domain, _property, JcaPackage.Literals.PROPERTY__VALUE, value));
                } else {
                    if (value == null) {
                        if (container instanceof Processor) {
                            if (domain instanceof TransactionalEditingDomain) {
                                ted.getCommandStack().execute(new RecordingCommand(ted) {
                                    @Override
                                    protected void doExecute() {
                                        Processor processor = (Processor) container;
                                        boolean flag = processor.getProperty().remove(_property);
                                        System.out.println("Property was removed: " + flag);
                                    }
                                });
                            }
                        } else if (container instanceof Endpoint) {
                            if (domain instanceof TransactionalEditingDomain) {
                                ted.getCommandStack().execute(new RecordingCommand(ted) {
                                    @Override
                                    protected void doExecute() {
                                        Endpoint endpoint = (Endpoint) container;
                                        boolean flag = endpoint.getProperty().remove(_property);
                                        System.out.println("Property was removed: " + flag);
                                    }
                                });
                            }
                        }
                    } else {
                        domain.getCommandStack().execute(
                                SetCommand.create(domain, _property, JcaPackage.Literals.PROPERTY__VALUE, value));
                    }
                }
            } else {
                if (!_removeNullProperties) {
                    _property.setValue(value);
                } else {
                    if (value == null) {
                        if (container instanceof Processor) {
                            Processor processor = (Processor) container;
                            boolean flag = processor.getProperty().remove(_property);
                            System.out.println("Property was removed: " + flag);
                        } else if (container instanceof Endpoint) {
                            Endpoint endpoint = (Endpoint) container;
                            boolean flag = endpoint.getProperty().remove(_property);
                            System.out.println("Property was removed: " + flag);
                        }
                    } else {
                        _property.setValue(value);
                    }
                }
            }
        }
        fireValueChange(Diffs.createValueDiff(original, value));
    }

    private void handleListChange() {
        if (_property != null && _list.contains(_property)) {
            return;
        }
        final Object oldValue = _property == null ? null : _property.getValue();
        _property = findProperty();
        if (_property == null) {
            if (oldValue == null) {
                return;
            }
        } else if (oldValue == null) {
            if (_property.getValue() == null) {
                return;
            }
        } else if (oldValue.equals(_property.getValue())) {
            return;
        }
        fireValueChange(Diffs.createValueDiff(oldValue, _property == null ? null : _property.getValue()));
    }

    private Property findProperty() {
        for (Object entry : _list) {
            final Property property = (Property) entry;
            if (property != null && _name.equals(property.getName())) {
                return property;
            }
        }
        return null;
    }
}
