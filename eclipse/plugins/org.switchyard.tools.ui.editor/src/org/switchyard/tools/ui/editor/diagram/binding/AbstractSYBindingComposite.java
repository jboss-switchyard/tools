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
package org.switchyard.tools.ui.editor.diagram.binding;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.diagram.shared.AbstractSwitchyardComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * Adds standard binding tabs.
 * 
 * @author bfitzpat
 * 
 */
public abstract class AbstractSYBindingComposite extends AbstractSwitchyardComposite implements IBindingComposite {

    private Binding _binding;
    private EObject _targetObj = null;
    private boolean _didSomething = false;
    private static int DELAY_DEFAULT = 500;

    protected AbstractSYBindingComposite(FormToolkit toolkit) {
        super(toolkit);
    }

    /**
     * Hack to get around triggering an unwanted button push on a property page.
     * 
     * @param flag true/false
     */
    public void setDidSomething(boolean flag) {
        this._didSomething = flag;
    }

    /**
     * Hack to get around triggering an unwanted button push on a property page.
     * 
     * @return true/false
     */
    public boolean getDidSomething() {
        return this._didSomething;
    }

    @Override
    public void setBinding(Binding binding) {
        _binding = binding;
    }

    @Override
    public Binding getBinding() {
        return _binding;
    }

    /**
     * @param control Control to modify value for
     */
    protected void handleModify(Control control) {
    }

    protected void wrapOperation(final List<ModelOperation> ops) {
        wrapOperation(getBinding(), ops);
    }

    /**
     * @author bfitzpat
     */
    public class BasicOperation extends ModelOperation {

        private String _localObjectPath;
        private String _localFeature;
        private Object _localValue;

        /**
         * @param objectpath incoming path to the object with the feature
         * @param featureId feature id
         * @param value incoming value
         */
        public BasicOperation(String objectpath, String featureId, Object value) {
            _localObjectPath = objectpath;
            _localFeature = featureId;
            _localValue = value;
        }

        @Override
        public void run() throws Exception {
            String[] path = parseString(_localObjectPath, "/"); //$NON-NLS-1$
            EObject object = getBinding();
            for (int i = 0; i < path.length; i++) {
                object = (EObject) getFeatureValue(object, path[i]);
            }
            if (object != null) {
                if (_localValue instanceof String && ((String) _localValue).length() == 0) {
                    setFeatureValue(object, _localFeature, null);
                } else {
                    setFeatureValue(object, _localFeature, _localValue);
                }
            } else {
                throw new Exception();
            }
        }
    }

    protected boolean validChange(String objectpath, String featureId, Object value) {
        String[] path = parseString(objectpath, "/"); //$NON-NLS-1$
        EObject object = _binding;
        for (int i = 0; i < path.length; i++) {
            object = (EObject) getFeatureValue(object, path[i]);
        }
        if (object == null) {
            return false;
        }
        Object oldvalue = getFeatureValue(object, featureId);
        if (oldvalue == value) {
            return false;
        }
        return true;
    }

    protected void updateControlEditable(Control control) {
        if (control != null && !control.isDisposed()) {
            control.setEnabled(canEdit());
        }
    }

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(EObject target) {
        this._targetObj = target;
    }

    /**
     * @return object stashed
     */
    public EObject getTargetObject() {
        return this._targetObj;
    }

    protected void updateFeature(EObject eObject, String[] featureId, Object[] value) {
        ArrayList<ModelOperation> ops = new ArrayList<ModelOperation>();

        if (featureId != null && featureId.length > 0 && value != null && value.length > 0
                && featureId.length == value.length) {
            for (int i = 0; i < featureId.length; i++) {
                ops.add(new BasicEObjectOperation(eObject, featureId[i], value[i]));
            }
        }

        wrapOperation(ops);
    }

    protected TransactionalEditingDomain getDomain(EObject object) {
        final TransactionalEditingDomain domain = super.getDomain(object);
        if (domain == null) {
            return super.getDomain(_targetObj);
        }
        return domain;
    }

    protected boolean validate() {
        return (getErrorMessage() == null);
    }

    protected void setTextValueAndNotify(Text control, String value, boolean setFocus) {
        control.setText(value);
        // make sure a notify event gets sent, to update the binding
        control.notifyListeners(SWT.Modify, null);
        // simulate "ENTER" to commit the change
        control.notifyListeners(SWT.DefaultSelection, null);
        if (setFocus) {
            control.setFocus();
        }
    }

    protected void setComboValueAndNotify(Combo control, String value, boolean setFocus) {
        control.setText(value);
        // make sure a notify event gets sent, to update the binding
        control.notifyListeners(SWT.Modify, null);
        // simulate "ENTER" to commit the change
        control.notifyListeners(SWT.DefaultSelection, null);
        if (setFocus) {
            control.setFocus();
        }
    }
    
    protected ISWTObservableValue createDelayedObservableText(int delay, Text control, int events) {
        ISWTObservableValue delayed = 
                SWTObservables.observeDelayedValue(delay, SWTObservables.observeText(control, events));
        return delayed;
    }

    protected ISWTObservableValue createDelayedObservableText(Text control) {
        return createDelayedObservableText(DELAY_DEFAULT, control, SWT.Modify);
    }

    /**
     * Wraps a model update operation in a RecordingCommand, if required.
     * 
     * @param runner the model update operation.
     */
    protected void wrapOperation(final Runnable runner) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getTargetObject());
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    try {
                        runner.run();
                    } catch (Exception e) {
                        Activator.logError(e);
                    }
                }
            });
        } else {
            try {
                runner.run();
            } catch (Exception e) {
                Activator.logError(e);
            }
        }
    }

}
