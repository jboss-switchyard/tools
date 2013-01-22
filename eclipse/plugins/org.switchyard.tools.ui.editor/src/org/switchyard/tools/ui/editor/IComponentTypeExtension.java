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
package org.switchyard.tools.ui.editor;

import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;

/**
 * IComponentTypeExtension
 * 
 * <p/>
 * Describes a component type that can be used within a SwitchYard application.
 * The SwitchYard editor will use the information to expose the component type
 * within the editor. The extension provider should also provide a
 * propertySections extension for editing properties specific to the component
 * type. Note, the SwitchYard editor provides support for common component
 * properties (e.g. requires policy). An adapterFactory should also be provided
 * to facilitate "opening" any associated resource used to implement the
 * component.
 */
public interface IComponentTypeExtension extends IEditorTypeExtension<Implementation> {

}
