/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
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
package org.switchyard.tools.ui.editor.diagram.binding;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 *
 */
public class RegexOperationSelectorGroupOp extends ModelOperation {
    
    private Binding _binding = null;
    private String _value = null;
    
    /**
     * @param binding incoming binding
     */
    public RegexOperationSelectorGroupOp(Binding binding) {
        this._binding = binding;
    }
    
    /**
     * @param binding incoming binding
     * @param value incoming value
     */
    public RegexOperationSelectorGroupOp(Binding binding, String value) {
        this(binding);
        _value = value;
    }

    @Override
    public void run() throws Exception {
        RegexOperationSelectorType regexOp = SwitchyardFactory.eINSTANCE.createRegexOperationSelectorType();
        if (_value != null) {
            regexOp.setExpression(_value);
        }
        _binding.setOperationSelector(regexOp);
    }
}
