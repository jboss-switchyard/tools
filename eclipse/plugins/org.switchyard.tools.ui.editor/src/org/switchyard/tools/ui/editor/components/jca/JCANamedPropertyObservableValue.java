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
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Property;

/**
 * Provides access to a named Property in a List<Property>.
 */
public class JCANamedPropertyObservableValue extends AbstractObservableValue {

    private final IObservableList _list;
    private final String _name;
    private Property _property;
    private final Object _type;
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

    @Override
    protected void doSetValue(Object value) {
        final Object original;
        if (_property == null) {
            original = null;

            if (value == null) {
                return;
            }

            _property = JcaFactory.eINSTANCE.createProperty();
            _property.setName(_name);
            _property.setValue(value);
            _list.add(_property);
        } else {
            original = _property.getValue();
            if ((value == null && original == null) || (value != null && value.equals(original))) {
                return;
            }
            if (_list instanceof IEMFEditObservable) {
                final EditingDomain domain = ((IEMFEditObservable) _list).getEditingDomain();
                domain.getCommandStack().execute(
                        SetCommand.create(domain, _property, JcaPackage.Literals.PROPERTY__VALUE, value));
            } else {
                _property.setValue(value);
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
