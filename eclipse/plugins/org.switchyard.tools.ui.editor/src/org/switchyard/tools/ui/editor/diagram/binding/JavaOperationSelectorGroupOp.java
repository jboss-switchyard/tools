package org.switchyard.tools.ui.editor.diagram.binding;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 *
 */
public class JavaOperationSelectorGroupOp extends ModelOperation {
    
    private Binding _binding = null;
    private String _value = null;
    
    /**
     * @param binding incoming binding
     */
    public JavaOperationSelectorGroupOp(Binding binding) {
        this._binding = binding;
    }
    
    /**
     * @param binding incoming binding
     * @param value incoming value
     */
    public JavaOperationSelectorGroupOp(Binding binding, String value) {
        this(binding);
        _value = value;
    }

    @Override
    public void run() throws Exception {
        JavaOperationSelectorType javaOp = SwitchyardFactory.eINSTANCE.createJavaOperationSelectorType();
        if (_value != null) {
            javaOp.setClass(_value);
        }
        _binding.setOperationSelector(javaOp);
    }
}
