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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.LinkedWizardBase;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * AbstractBindingWizard
 * <p/>
 * Base wizard for creating new bindings.
 */
public abstract class AbstractBindingWizard extends LinkedWizardBase implements IBindingWizard {

    private List<IBindingComposite> _composites;
    private Contract _container;
    private Binding _newBinding;

    /**
     * Create a new AbstractBindingWizard.
     */
    public AbstractBindingWizard() {
    }

    @Override
    public void addPages() {
        for (IBindingComposite composite : _composites) {
            addPage(new BindingCompositeWizardPage(composite));
        }
    }

    @Override
    public Binding getCreatedObject() {
        return _newBinding;
    }

    @Override
    public void init(Contract container) {
        _container = container;
        _newBinding = createBinding();
        _composites = createComposites();
    }

    /**
     * @return the target container.
     */
    protected Contract getTargetContainer() {
        return _container;
    }

    /**
     * @return a newly created (and defaulted) binding.
     */
    protected abstract Binding createBinding();

    /**
     * @return the composites for the pages.
     */
    protected abstract List<IBindingComposite> createComposites();
    
    /**
     * @param baseName the base name
     * @return a unique name, e.g. baseName1
     */
    protected String makeUniqueName(final String baseName) {
        int index = 1;
        String name = baseName + index++;
        OUTER: while (true) {
            for (Binding test : getTargetContainer().getBinding()) {
                if (name.equals(test.getName())) {
                    name = baseName + index++;
                    continue OUTER;
                }
            }
            return name;
        }
    }

    @Override
    public boolean doFinish() {
        return true;
    }

    /**
     * Basic WizardPage wrapping a IBindingComposite.
     */
    protected class BindingCompositeWizardPage extends WizardPage {
        private final IBindingComposite _composite;

        /**
         * Create a new BindingCompositeWizardPage.
         * 
         * @param composite the controls for the page.
         */
        protected BindingCompositeWizardPage(IBindingComposite composite) {
            super("BindingWizard.page."+AbstractBindingWizard.this.getPageCount()); //$NON-NLS-1$
            setTitle(composite.getTitle());
            setDescription(composite.getDescription());
            _composite = composite;
        }

        @Override
        public void createControl(Composite parent) {
            _composite.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent arg0) {
                    setErrorMessage(_composite.getErrorMessage());
                    setPageComplete(_composite.getErrorMessage() == null);
                }
            });
            _composite.setTargetObject(_container);
            _composite.createContents(parent, SWT.NONE);
            _composite.setBinding(_newBinding);
            _composite.setTargetObject(_container);

            setControl(_composite.getPanel());
            setPageComplete(_composite.getErrorMessage() == null);

            setErrorMessage(null);
        }
    }
}
