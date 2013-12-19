/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.debug.structure;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILogicalStructureType;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.jdt.debug.core.IJavaClassType;
import org.eclipse.jdt.debug.core.IJavaInterfaceType;
import org.eclipse.jdt.debug.core.IJavaObject;
import org.eclipse.jdt.debug.core.IJavaType;

/**
 * SwitchYardLogicalStructureTypeDelegate
 * <p/>
 * Provides logical structures for SwitchYard types.
 */
public class SwitchYardLogicalStructureTypeDelegate implements ILogicalStructureType {

    /**
     * Create a new SwitchYardLogicalStructureTypeDelegate.
     */
    public SwitchYardLogicalStructureTypeDelegate() {
    }

    @Override
    public String getDescription(IValue value) {
        try {
            if (value instanceof IJavaObject) {
                final IJavaType type = ((IJavaObject) value).getJavaType();
                if (type instanceof IJavaClassType) {
                    for (IJavaInterfaceType intf : ((IJavaClassType) type).getAllInterfaces()) {
                        final String name = intf.getName();
                        if (name.equals(SwitchYardPropertyVariable.TYPE)) {
                            return "SwitchYard Property";
                        } else if (name.equals(SwitchYardServiceOperationVariable.TYPE)) {
                            return "SwitchYard Service Operation";
                        } else if (name.equals(SwitchYardCamelExchangeVariable.TYPE)) {
                            return "SwitchYard Exchange";
                        } else if (name.equals(SwitchYardExchangeVariable.TYPE)) {
                            return "SwitchYard Exchange";
                        } else if (name.equals(SwitchYardMessageVariable.TYPE)) {
                            return "SwitchYard Message";
                        } else if (name.equals(SwitchYardExchangeContractVariable.TYPE)) {
                            return "SwitchYard Exchange Contract";
                        } else if (name.equals(SwitchYardServiceInterfaceVariable.TYPE)) {
                            return "SwitchYard Service Interface";
                        } else if (name.equals(SwitchYardServiceVariable.TYPE)) {
                            return "SwitchYard Service";
                        } else if (name.equals(SwitchYardServiceReferenceVariable.TYPE)) {
                            return "SwitchYard Reference";
                        } else if (name.equals(SwitchYardServiceMetadataVariable.TYPE)) {
                            return "SwitchYard Service Metadata";
                        } else if (name.equals(SwitchYardPolicyVariable.TYPE)) {
                            return "SwitchYard Policy Type";
                        } else if (name.equals(SwitchYardServiceSecurityVariable.TYPE)) {
                            return "SwitchYard Service Security";
                        } else if (name.equals(SwitchYardThrottlingVariable.TYPE)) {
                            return "SwitchYard Throttling Settings";
                        } else if (name.equals(SwitchYardServiceDomainVariable.TYPE)) {
                            return "SwitchYard Domain";
                        } else if (name.equals(SwitchYardSecurityContextVariable.TYPE)) {
                            return "SwitchYard Security Context";
                        }
                    }
                }
            }
        } catch (DebugException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getDescription() {
        return "SwitchYard Type";
    }

    @Override
    public String getId() {
        return "org.switchyard.tools.ui.debug.logicalStructureTypeDelegate";
    }

    @Override
    public boolean providesLogicalStructure(IValue value) {
        try {
            if (value instanceof IJavaObject) {
                final IJavaType type = ((IJavaObject) value).getJavaType();
                if (type instanceof IJavaClassType) {
                    for (IJavaInterfaceType intf : ((IJavaClassType) type).getAllInterfaces()) {
                        final String name = intf.getName();
                        if (name.equals(SwitchYardPropertyVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardServiceOperationVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardCamelExchangeVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardExchangeVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardMessageVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardExchangeContractVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardServiceInterfaceVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardServiceVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardServiceReferenceVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardServiceMetadataVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardPolicyVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardServiceSecurityVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardThrottlingVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardServiceDomainVariable.TYPE)) {
                            return true;
                        } else if (name.equals(SwitchYardSecurityContextVariable.TYPE)) {
                            return true;
                        }
                    }
                }
            }
        } catch (DebugException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public IValue getLogicalStructure(IValue value) throws CoreException {
        if (value instanceof IJavaObject) {
            final IJavaType type = ((IJavaObject) value).getJavaType();
            if (type instanceof IJavaClassType) {
                for (IJavaInterfaceType intf : ((IJavaClassType) type).getAllInterfaces()) {
                    final String name = intf.getName();
                    if (name.equals(SwitchYardPropertyVariable.TYPE)) {
                        return SwitchYardPropertyVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardServiceOperationVariable.TYPE)) {
                        return SwitchYardServiceOperationVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardCamelExchangeVariable.TYPE)) {
                        return SwitchYardCamelExchangeVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardExchangeVariable.TYPE)) {
                        return SwitchYardExchangeVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardMessageVariable.TYPE)) {
                        return SwitchYardMessageVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardExchangeContractVariable.TYPE)) {
                        return SwitchYardExchangeContractVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardServiceInterfaceVariable.TYPE)) {
                        return SwitchYardServiceInterfaceVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardServiceVariable.TYPE)) {
                        return SwitchYardServiceVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardServiceReferenceVariable.TYPE)) {
                        return SwitchYardServiceReferenceVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardServiceMetadataVariable.TYPE)) {
                        return SwitchYardServiceMetadataVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardPolicyVariable.TYPE)) {
                        return SwitchYardPolicyVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardServiceSecurityVariable.TYPE)) {
                        return SwitchYardServiceSecurityVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardThrottlingVariable.TYPE)) {
                        return SwitchYardThrottlingVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardServiceDomainVariable.TYPE)) {
                        return SwitchYardServiceDomainVariable.newValue((IJavaObject) value);
                    } else if (name.equals(SwitchYardServiceDomainVariable.TYPE)) {
                        return SwitchYardSecurityContextVariable.newValue((IJavaObject) value);
                    }
                }
            }
        }
        return null;
    }

}
