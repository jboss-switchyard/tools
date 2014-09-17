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
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * AbstractTabbedPropertySection
 * 
 * <p/>
 * Property section that delegates to an AbstractModelComposite.
 * 
 * @param <T> the type of the object being edited, should match
 *            AbstractModelComposite.
 */
public abstract class AbstractTabbedPropertySection<T extends EObject> extends GFPropertySection implements
        ITabbedPropertyConstants, ICompositeContainer, ResourceSetListener {

    private TransactionalEditingDomain _domain = null;
    private TabbedPropertySheetPage _page;
    private AbstractModelComposite<T> _composite;
    private DataBindingContext _context;
    private ObservablesManager _observablesManager;

    protected AbstractTabbedPropertySection() {
        _context = new EMFDataBindingContext();
        _observablesManager = new ObservablesManager();
        _observablesManager.addObservablesFromContext(_context, true, true);
    }

    @Override
    public FormToolkit getToolkit() {
        return _page.getWidgetFactory();
    }

    @Override
    public void validated(IStatus status) {
        // nothing to do
    }

    @Override
    public void layout() {
        if (_page == null) {
            return;
        }
        Display.getCurrent().syncExec(new Runnable(){

            @Override
            public void run() {
                if (!_page.getControl().isDisposed()) {
                    _page.resizeScrolledComposite();
                }
            }
        });
   }

    @Override
    public void createControls(final Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);
        _page = aTabbedPropertySheetPage;
        _observablesManager.runAndCollect(new Runnable() {
            @Override
            public void run() {
                _composite = createComposite(parent, SWT.NONE);
            }
        });
        getToolkit().adapt(_composite);
    }

    /**
     * @param parent the parent composite.
     * @param style the style bits.
     * 
     * @return the new composite.
     */
    protected abstract AbstractModelComposite<T> createComposite(Composite parent, int style);

    @Override
    public EObject getSelectedBusinessObject() {
        final PictogramElement pe = getSelectedPictogramElement();
        if (pe == null) {
            return null;
        }
        return Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
    }

    @Override
    public void refresh() {
        super.refresh();
        if (_composite == null || _composite.isDisposed()) {
            return;
        }
        _composite.refresh();
    }

    @Override
    public void aboutToBeShown() {
        addDomainListener();
        super.aboutToBeShown();
    }

    @Override
    public void aboutToBeHidden() {
        removeDomainListener();
        super.aboutToBeHidden();
    }

    private void addDomainListener() {
        if (_domain == null) {
            _domain = (TransactionalEditingDomainImpl) SwitchyardSCAEditor.getEditor(getSelectedBusinessObject())
                    .getEditingDomain();
            _domain.addResourceSetListener(this);
        }
    }

    private void removeDomainListener() {
        if (_domain != null) {
            _domain.removeResourceSetListener(this);
            _domain = null;
        }
    }

    @Override
    public void dispose() {
        if (_observablesManager != null) {
            _observablesManager.dispose();
        }
        removeDomainListener();
        if (_composite != null) {
            _composite.dispose();
            _composite = null;
        }
        if (_context != null) {
            _context.dispose();
        }
        super.dispose();
    }

    @Override
    public NotificationFilter getFilter() {
        return null;
    }

    @Override
    public boolean isAggregatePrecommitListener() {
        return false;
    }

    @Override
    public boolean isPostcommitOnly() {
        return false;
    }

    @Override
    public boolean isPrecommitOnly() {
        return false;
    }

    @Override
    public void resourceSetChanged(ResourceSetChangeEvent arg0) {
        if (_page != null && _page.getControl() != null && !_page.getControl().isDisposed()) {
            _page.getControl().getDisplay().asyncExec(new Runnable() {
                @Override
                public void run() {
                    refresh();
                }
            });
        }
    }

    @Override
    public Command transactionAboutToCommit(ResourceSetChangeEvent arg0) throws RollbackException {
        return null;
    }

    @Override
    public DataBindingContext getDataBindingContext() {
        return _context;
    }

    @Override
    public ObservablesManager getObservablesManager() {
        return _observablesManager;
    }
}
