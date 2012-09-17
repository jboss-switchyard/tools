package org.switchyard.tools.ui.editor.diagram.binding;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorFactory;
import org.switchyard.tools.models.switchyard1_0.commonselector.CommonselectorPackage;
import org.switchyard.tools.models.switchyard1_0.commonselector.StaticOperationSelectorType;
import org.switchyard.tools.ui.editor.diagram.shared.ModelOperation;

/**
 * @author bfitzpat
 *
 */
public class CamelOperationSelectorGroupOp extends ModelOperation {
    
    private Binding _binding = null;
    
    /**
     * @param binding incoming binding
     */
    public CamelOperationSelectorGroupOp(Binding binding) {
        this._binding = binding;
    }
    
    @Override
    public void run() throws Exception {
        if (_binding.getOperationSelector() == null && _binding.getOperationSelectorGroup() != null) {
            FeatureMap operationGroup = (FeatureMap) _binding.getOperationSelectorGroup();
            StaticOperationSelectorType staticOp = CommonselectorFactory.eINSTANCE.createStaticOperationSelectorType();
            operationGroup.add(CommonselectorPackage.eINSTANCE.getDocumentRoot_StaticOperationSelector(), staticOp);
        }
    }
}
