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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.ObservablesManager;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * ICompositeContainer
 * 
 * <p/>
 * Provides an integration point for AbstractModelComposite objects to
 * communicate with their containers.
 */
public interface ICompositeContainer {

    /**
     * TODO: this may need to change to TabbedPropertySheetWidgetFactory.
     * 
     * @return the toolkit provided by the container.
     */
    FormToolkit getToolkit();

    /**
     * Notify container that the composite's validation state has changed.
     * 
     * @param status the current status
     */
    void validated(IStatus status);

    /**
     * Notify the container that its control may need to be layed out (or
     * resized) based on changes to the composite (e.g. section expanded).
     */
    void layout();

    /**
     * @return the selected object.
     */
    EObject getSelectedBusinessObject();
    
    /**
     * @return the data binding context managed by this container
     */
    DataBindingContext getDataBindingContext();
    
    /**
     * @return the observables manager used by this container
     */
    ObservablesManager getObservablesManager();
}
