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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.switchyard.tools.ui.Activator;

/**
 * ValidationStatusAdapter
 * 
 * <p/>
 * An adapter for holding validation status associated with an EObject.
 */
public class ValidationStatusAdapter extends AdapterImpl {

    private List<IStatus> _validationStatus = new ArrayList<IStatus>();
    private Map<EObject, List<IStatus>> _connectionStatus = new HashMap<EObject, List<IStatus>>();

    @Override
    public boolean isAdapterForType(Object type) {
        return type instanceof Class && ((Class<?>) type).isAssignableFrom(getClass());
    }

    /**
     * @return the validation status for the target object.
     */
    public IStatus getValidationStatus() {
        return createStatus(_validationStatus);
    }

    /**
     * @param target the target of the connection from this object.
     * 
     * @return the validation status for the connection.
     */
    public IStatus getConnectionStatus(EObject target) {
        return createStatus(_connectionStatus.get(target));
    }

    /**
     * Clears the status associated with the target.
     */
    public void clearValidationStatus() {
        _validationStatus.clear();
        _connectionStatus.clear();
    }

    /**
     * @param status the status to add/associate with the target.
     */
    public void addValidationStatus(IStatus status) {
        if (ValidationProblem.isConnectionProblem(status.getCode())) {
            if (status instanceof IConstraintStatus) {
                for (EObject other : ((IConstraintStatus) status).getResultLocus()) {
                    if (other != getTarget()) {
                        addConnectionStatus(other, status);
                        return;
                    }
                }
            }
        }
        _validationStatus.add(status);
    }

    private void addConnectionStatus(EObject target, IStatus status) {
        List<IStatus> statuses = _connectionStatus.get(target);
        if (statuses == null) {
            statuses = new ArrayList<IStatus>();
            _connectionStatus.put(target, statuses);
        }
        statuses.add(status);
    }

    private IStatus createStatus(List<? extends IStatus> statuses) {
        if (statuses == null) {
            return Status.OK_STATUS;
        }
        switch (statuses.size()) {
        case 0:
            return Status.OK_STATUS;
        case 1:
            return statuses.get(0);
        }
        return new MultiStatusWithMessage(statuses.toArray(new IStatus[statuses.size()]));
    }

    private static class MultiStatusWithMessage extends MultiStatus {

        private String _message;

        public MultiStatusWithMessage(IStatus[] newChildren) {
            super(Activator.PLUGIN_ID, 0, newChildren, "", null); //$NON-NLS-1$
        }

        @Override
        public String getMessage() {
            if (_message != null) {
                return _message;
            }
            if (getChildren().length == 0) {
                return super.getMessage();
            }
            StringBuffer sb = new StringBuffer();
            for (IStatus status : getChildren()) {
                if (status.isOK()) {
                    continue;
                }
                sb.append(" - ").append(status.getMessage()).append('\n'); //$NON-NLS-1$
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            _message = sb.toString();
            return _message;
        }

    }
}
