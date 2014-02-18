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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.ObservablesManager;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.wizard.WizardPageSupport;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
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
    private final FormToolkit _toolkit;

    /**
     * Create a new AbstractBindingWizard.
     */
    public AbstractBindingWizard() {
        FormColors colors = new FormColors(Display.getCurrent());
        colors.setBackground(null);
        colors.setForeground(null);
        _toolkit = new FormToolkit(colors);
    }

    @Override
    public void dispose() {
        _toolkit.dispose();
        super.dispose();
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
     * @param toolkit the toolkit for creating controls
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

    protected FormToolkit getToolkit() {
        return _toolkit;
    }

    /**
     * Basic WizardPage wrapping a IBindingComposite.
     */
    protected class BindingCompositeWizardPage extends WizardPage {
        private final IBindingComposite _composite;
        private final DataBindingContext _context = new EMFDataBindingContext(SWTObservables.getRealm(Display
                .getCurrent()));
        private final ObservablesManager _observablesManager = new ObservablesManager();
        private WizardPageSupport _support;

        /**
         * Create a new BindingCompositeWizardPage.
         * 
         * @param composite the controls for the page.
         */
        protected BindingCompositeWizardPage(IBindingComposite composite) {
            super("BindingWizard.page." + AbstractBindingWizard.this.getPageCount()); //$NON-NLS-1$
            setTitle(composite.getTitle());
            setDescription(composite.getDescription());
            _composite = composite;
            _observablesManager.addObservablesFromContext(_context, true, true);
        }

        @Override
        public void createControl(final Composite parent) {
            _composite.setTargetObject(_container);
            _observablesManager.runAndCollect(new Runnable() {
                public void run() {
                    _composite.createContents(parent, SWT.NONE, _context);
                };
            });
            _composite.setBinding(_newBinding);
            _composite.setTargetObject(_container);

            setControl(_composite.getPanel());
            setPageComplete(_composite.getErrorMessage() == null);
            _support = WizardPageSupport.create(this, _context);

            setErrorMessage(null);
        }

        @Override
        public void dispose() {
            if (_support != null) {
                _support.dispose();
                _support = null;
            }
            _observablesManager.dispose();
            _context.dispose();
            super.dispose();
        }
    }
}
