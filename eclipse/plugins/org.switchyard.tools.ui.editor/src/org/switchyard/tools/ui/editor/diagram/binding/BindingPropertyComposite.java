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
package org.switchyard.tools.ui.editor.diagram.binding;

import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.TabFolderLayout;

/**
 * BindingPropertyComposite
 * <p/>
 * Base binding composite for use in properties dialog/view.
 */
public class BindingPropertyComposite implements IBindingComposite, ChangeListener {

    private Binding _binding;
    private EObject _targetObject;
    private Composite _panel;
    private List<IBindingComposite> _composites;
    private ListenerList _listeners = new ListenerList();
    
    /**
     * Create a new BindingPropertyComposite.
     * 
     * @param composites the composites to display as tabs.
     */
    public BindingPropertyComposite(List<IBindingComposite> composites) {
        _composites = composites;
    }

    @Override
    public Binding getBinding() {
        return _binding;
    }

    @Override
    public void setBinding(Binding binding) {
        _binding = binding;
        for (IBindingComposite composite : _composites) {
            composite.setBinding(binding);
        }
    }

    @Override
    public void createContents(Composite parent, int style, DataBindingContext context) {
        _panel = new Composite(parent, style);
        GridLayout gl = new GridLayout();
        gl.numColumns = 1;
        _panel.setLayout(gl);

        TabFolder tabFolder = new TabFolder(_panel, SWT.NONE);
        tabFolder.setLayout(new TabFolderLayout(tabFolder));
        tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        for (IBindingComposite composite : _composites) {
            final TabItem tab = new TabItem(tabFolder, SWT.NONE);
            tab.setText(composite.getTitle());
            tab.setToolTipText(composite.getDescription());
            composite.createContents(tabFolder, SWT.NONE, context);
            tab.setControl(composite.getPanel());
            composite.addChangeListener(this);
        }
    }

    @Override
    public Composite getPanel() {
        return _panel;
    }

    @Override
    public void setErrorMessage(String msg) {
    }

    @Override
    public String getErrorMessage() {
        for (IBindingComposite composite : _composites) {
            String errorMessage = composite.getErrorMessage();
            if (errorMessage != null && errorMessage.length() > 0) {
                return errorMessage;
            }
        }
        return null;
    }

    @Override
    public void setTargetObject(EObject target) {
        _targetObject = target;
        for (IBindingComposite composite : _composites) {
            composite.setTargetObject(target);
        }
    }

    @Override
    public EObject getTargetObject() {
        return _targetObject;
    }

    @Override
    public void setOpenOnCreate(boolean flag) {
    }

    @Override
    public boolean openOnCreate() {
        return false;
    }

    @Override
    public void addChangeListener(ChangeListener listener) {
        _listeners.add(listener);
    }

    @Override
    public void removeChangeListener(ChangeListener listener) {
        _listeners.remove(listener);
    }

    @Override
    public void setDidSomething(boolean flag) {
    }

    @Override
    public boolean getDidSomething() {
        return false;
    }

    @Override
    public void stateChanged(ChangeEvent event) {
        for (Object listener : _listeners.getListeners()) {
            try {
                ((ChangeListener)listener).stateChanged(event);
            } catch (Exception e) {
                Activator.logError(e);
            }
        }
    }

    @Override
    public String getTitle() {
        return _composites.get(0).getTitle();
    }

    @Override
    public String getDescription() {
        return _composites.get(0).getDescription();
    }

    @Override
    public void dispose() {
        for (IBindingComposite composite: _composites) {
            composite.dispose();
        }
    }
}
