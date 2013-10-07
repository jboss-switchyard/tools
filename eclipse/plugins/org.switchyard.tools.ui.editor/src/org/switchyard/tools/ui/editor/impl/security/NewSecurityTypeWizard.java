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
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.impl.security;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.jface.wizard.Wizard;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;

/**
 * @author bfitzpat
 *
 */
public class NewSecurityTypeWizard extends Wizard {
    
    private SecurityType _securityType;
    private SecuritiesType _securitiesType;
    private NewSecurityTypeWizardPage _page;
    private boolean _editing = false;

    /**
     * Constructor.
     */
    public NewSecurityTypeWizard() {
        super();
        setWindowTitle(Messages.title_securityConfiguration);
    }
    
    /**
     * Constructor.
     * @param isEditing Are we editing>?
     */
    public NewSecurityTypeWizard(boolean isEditing) {
        this();
        _editing = isEditing;
    }

    @Override
    public void addPages() {
        _page = new NewSecurityTypeWizardPage("wizpage"); //$NON-NLS-1$
        if (_securityType == null) {
            _securityType = SwitchyardFactory.eINSTANCE.createSecurityType();
        }
        if (!_editing) {
            _page.setTitle(Messages.title_newSecurityConfiguration);
            _page.setDescription(Messages.description_newSecurityConfiguration);
        } else {
            _page.setTitle(Messages.title_editSecurityConfiguration);
            _page.setDescription(Messages.description_editoSecurityConfiguration);
            _page.setEditing(_editing);
        }
        _page.setSecurityType(_securityType);
        _page.setSecuritiesType(_securitiesType);
        addPage(_page);
    }

    @Override
    public boolean performFinish() {
        updateFeatures(_securityType);
        return true;
    }

    /**
     * @param security incoming Security Type
     */
    public void setSecurityType(SecurityType security) {
        this._securityType = security;
    }

    /**
     * @return the updated security type
     */
    public SecurityType getSecurityType() {
        return this._securityType;
    }

    /**
     * @param securities incoming Securities Type
     */
    public void setSecuritiesType(SecuritiesType securities) {
        this._securitiesType = securities;
    }

    /**
     * @return the updated Securities type
     */
    public SecuritiesType getSecuritiesType() {
        return this._securitiesType;
    }

    private void updateFeatures(final EObject object) {
        TransactionalEditingDomain editDomain =
                (TransactionalEditingDomainImpl) SwitchyardSCAEditor.getActiveEditor().getEditingDomain();        
        if (_securityType != null) {
            editDomain.getCommandStack().execute(new RecordingCommand(editDomain) {
                
                private void setIt(String value, String feature) throws Exception {
                    if ((value != null && value.trim().length() > 0) || value == null) {
                        setFeatureValue(object, feature, value);
                    }
                }
                
                @Override
                protected void doExecute() {
                    try {
                        setIt(_page.getModuleName(), "name"); //$NON-NLS-1$
                        setIt(_page.getCallbackHandler(), "callbackHandler"); //$NON-NLS-1$
                        setIt(_page.getRolesAllowed(), "rolesAllowed"); //$NON-NLS-1$
                        setIt(_page.getRunAs(), "runAs"); //$NON-NLS-1$
                        setIt(_page.getSecurityDomain(), "securityDomain"); //$NON-NLS-1$
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
    
    /**
     * @param eObject incoming object to update
     * @param featureId feature to update
     * @param value value for feature
     * @throws Exception in case something can't be found
     */
    public void setFeatureValue(EObject eObject, String featureId, Object value) throws Exception {
        EClass eClass = eObject.eClass();
        for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
            EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
            if (eStructuralFeature.isChangeable()) {
                if (eStructuralFeature.getName().equalsIgnoreCase(featureId)) {
                    eObject.eSet(eStructuralFeature, value);
                    return;
                }
            }
        }
        throw new Exception("AbstractSwitchyardComposite:Feature ID (" + featureId + ") not found."); //$NON-NLS-1$ //$NON-NLS-2$
    }
}
