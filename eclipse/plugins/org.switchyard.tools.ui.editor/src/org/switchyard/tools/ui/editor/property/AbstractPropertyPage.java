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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;

/**
 * AbstractPropertyPage
 * 
 * <p/>
 * Abstract implementation for a property page wrapping a model composite.
 * 
 * @param <T> the model type.
 */
public abstract class AbstractPropertyPage<T extends EObject> extends PropertyPage implements ICompositeContainer {

    private static final String TRANSACTION_KEY = "switchyard.property.transaction"; //$NON-NLS-1$

    private FormToolkit _toolkit;
    private AbstractModelComposite<T> _composite;

    /**
     * Create a new AbstractPropertyPage.
     */
    public AbstractPropertyPage() {
        super();
        noDefaultAndApplyButton();
    }

    @Override
    public FormToolkit getToolkit() {
        return _toolkit;
    }

    @Override
    public void validated(IStatus status) {
        switch (status.getSeverity()) {
        case IStatus.OK:
            setErrorMessage(null);
            setMessage(_composite == null ? null : _composite.getDescription(), NONE);
            break;
        case IStatus.INFO:
            setErrorMessage(null);
            setMessage(status.getMessage(), INFORMATION);
            break;
        case IStatus.WARNING:
            setErrorMessage(null);
            setMessage(status.getMessage(), WARNING);
            break;
        case IStatus.ERROR:
            setErrorMessage(status.getMessage());
            break;
        }
        setValid(getErrorMessage() == null);
    }

    @Override
    public void layout() {
        if (!_composite.isDisposed()) {
            _composite.layout(true);
        }
    }

    @Override
    public boolean performCancel() {
        Transaction transaction = (Transaction) getShell().getData(TRANSACTION_KEY);
        if (transaction != null) {
            transaction.rollback();
        }
        getShell().setData(TRANSACTION_KEY, null);
        return true;
    }

    @Override
    public boolean performOk() {
        Transaction transaction = (Transaction) getShell().getData(TRANSACTION_KEY);
        if (transaction != null) {
            try {
                transaction.commit();
            } catch (RollbackException e) {
                ErrorDialog.openError(getShell(), Messages.title_errorCommittingModelChanges,
                        Messages.description_errorCommittingModelChanges, new Status(IStatus.ERROR,
                                Activator.PLUGIN_ID, e.getMessage(), e));
            }
        }
        getShell().setData(TRANSACTION_KEY, null);
        return true;
    }

    @Override
    public EObject getSelectedBusinessObject() {
        return (EObject) getElement().getAdapter(EObject.class);
    }

    @Override
    protected Control createContents(Composite parent) {
        final FormColors colors = new FormColors(Display.getCurrent());
        colors.setBackground(null);
        colors.setForeground(null);
        _toolkit = new FormToolkit(colors);

        _composite = createComposite(parent, SWT.NONE);

        _composite.refresh();
        _composite.validate();
        setErrorMessage(null);

        initializeTransaction();

        return _composite;
    }

    /**
     * @param parent the parent composite.
     * @param style the style bits.
     * 
     * @return the new composite.
     */
    protected abstract AbstractModelComposite<T> createComposite(Composite parent, int style);

    private void initializeTransaction() {
        final Transaction transaction = (Transaction) getShell().getData(TRANSACTION_KEY);
        if (transaction != null) {
            return;
        }
        try {
            final InternalTransactionalEditingDomain transactionalDomain = (InternalTransactionalEditingDomain) TransactionUtil
                    .getEditingDomain(getSelectedBusinessObject());
            final Transaction newTransaction = transactionalDomain.startTransaction(false, null);
            getShell().setData(TRANSACTION_KEY, newTransaction);
            getShell().addDisposeListener(new DisposeListener() {
                public void widgetDisposed(DisposeEvent event) {
                    if (newTransaction.isActive()) {
                        newTransaction.rollback();
                    }
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
