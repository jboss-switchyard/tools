/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;

/**
 * AbstractChangeAwareModelComposite
 * 
 * <p/>
 * Extends the base model adding change listeners.
 * 
 * @param <T> Model type.
 */
public abstract class AbstractChangeAwareModelComposite<T extends EObject> extends AbstractModelComposite<T> {

    private ListenerList _changeListeners;

    /**
     * Create a new AbstractModelComposite.
     * 
     * @param type the model type
     * @param container the container
     * @param parent parent composite
     * @param style style
     */
    public AbstractChangeAwareModelComposite(Class<T> type, ICompositeContainer container, Composite parent, int style) {
        super(type, container, parent, style);
    }

    /**
     * Add a change listener.
     * 
     * @param listener new listener
     */
    public void addChangeListener(ChangeListener listener) {
        if (this._changeListeners == null) {
            this._changeListeners = new ListenerList();
        }
        this._changeListeners.add(listener);
    }

    /**
     * Remove a change listener.
     * 
     * @param listener to remove
     */
    public void removeChangeListener(ChangeListener listener) {
        if (this._changeListeners != null && !this._changeListeners.isEmpty()) {
            this._changeListeners.remove(listener);
        }
    }

    /**
     * If we changed, fire a changed event.
     * 
     * @param source
     */
    protected void fireChangedEvent(Object source) {
        ChangeEvent e = new ChangeEvent(source);
        // inform any listeners of the change event
        if (this._changeListeners != null && !this._changeListeners.isEmpty()) {
            Object[] listeners = this._changeListeners.getListeners();
            for (int i = 0; i < listeners.length; ++i) {
                ((ChangeListener) listeners[i]).stateChanged(e);
            }
        }
    }
}
