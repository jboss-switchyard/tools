/******************************************************************************* 
 * Copyright (c) 2012-2013 Red Hat, Inc. 
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

import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.widgets.Composite;

/**
 * Base interface for composites used for editing a binding.
 * 
 * @author bfitzpat
 */
public interface IBindingComposite {

    /**
     * @return an identifier for this composite. This may be used as a wizard
     *         page title or text for a tab.
     */
    public String getTitle();
    
    /**
     * @return description text for this composite. This may be used as the
     *         description for a wizard page or tool tip for a tab.
     */
    public String getDescription();
    
    /**
     * @return the binding
     */
    public Binding getBinding();

    /**
     * @param binding binding coming in
     */
    public void setBinding(Binding binding);

    /**
     * @param parent Composite parent
     * @param style any style bits
     * @param dataBindingContext the context to be used for binding controls
     */
    public void createContents(Composite parent, int style, DataBindingContext dataBindingContext);

    /**
     * @return panel
     */
    public Composite getPanel();

    /**
     * @param msg string to set
     */
    public void setErrorMessage(String msg);

    /**
     * @return string error message
     */
    public String getErrorMessage();

    /**
     * @param target Passed in what we're dropping on
     */
    public void setTargetObject(EObject target);

    /**
     * @return object stashed
     */
    public EObject getTargetObject();

    /**
     * @param flag open on create? true/false
     */
    public void setOpenOnCreate(boolean flag);

    /**
     * @return true/false
     */
    public boolean openOnCreate();

    /**
     * Add a change listener.
     * 
     * @param listener new listener
     */
    public void addChangeListener(ChangeListener listener);

    /**
     * Remove a change listener.
     * 
     * @param listener to remove
     */
    public void removeChangeListener(ChangeListener listener);

    /**
     * Hack to get around triggering an unwanted button push on a property page.
     * @param flag true/false
     */
    public void setDidSomething(boolean flag);
    
    /**
     * Hack to get around triggering an unwanted button push on a property page.
     * @return true/false
     */
    public boolean getDidSomething();
    
    /**
     * Dispose of any resources allocated for this object.
     */
    public void dispose();
    
}
