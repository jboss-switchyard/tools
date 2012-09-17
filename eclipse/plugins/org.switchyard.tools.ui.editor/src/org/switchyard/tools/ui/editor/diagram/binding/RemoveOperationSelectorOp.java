package org.switchyard.tools.ui.editor.diagram.binding;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 *
 */
public class RemoveOperationSelectorOp extends ModelOperation {

    private Binding _binding = null;
    
    /**
     * @param binding incoming
     */
    public RemoveOperationSelectorOp(Binding binding) {
        this._binding = binding;
    }
    
    @Override
    public void run() throws Exception {
        if (_binding.getOperationSelectorGroup() != null) {
            FeatureMap operationGroup = (FeatureMap) _binding.getOperationSelectorGroup();
            while (!operationGroup.isEmpty()) {
                operationGroup.remove(0);
            }
        }
    }

}
