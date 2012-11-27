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
import org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 *
 */
public class StaticOperationSelectorGroupOp extends ModelOperation {
    
    private Binding _binding = null;
    private String _value = null;
    
    /**
     * @param binding incoming binding
     */
    public StaticOperationSelectorGroupOp(Binding binding) {
        this._binding = binding;
    }
    
    /**
     * @param binding incoming binding
     * @param value incoming value
     */
    public StaticOperationSelectorGroupOp(Binding binding, String value) {
        this(binding);
        _value = value;
    }
    
    @Override
    public void run() throws Exception {
        StaticOperationSelectorType staticOp = SwitchyardFactory.eINSTANCE.createStaticOperationSelectorType();
        if (_value != null) {
            staticOp.setOperationName(_value);
        }
        this._binding.setOperationSelector(staticOp);
    }
}
