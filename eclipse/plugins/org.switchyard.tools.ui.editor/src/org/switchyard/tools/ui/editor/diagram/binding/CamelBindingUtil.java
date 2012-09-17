package org.switchyard.tools.ui.editor.diagram.binding;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.commonselector.StaticOperationSelectorType;

/**
 * @author bfitzpat
 * 
 */
public final class CamelBindingUtil {

    private CamelBindingUtil() {
        // private constructor
    }

    /**
     * @param binding to check
     * @return first OperationSelector object
     */
    public static OperationSelectorType getFirstOperationSelector(Binding binding) {
        if (!binding.getOperationSelectorGroup().isEmpty()) {
            Object object = binding.getOperationSelectorGroup().get(0).getValue();
            if (object instanceof OperationSelectorType) {
                OperationSelectorType opSelect = (OperationSelectorType) object;
                return opSelect;
            }
        }
        return null;
    }
    
    /**
     * @param binding binding to check
     * @return null if not applicable or name if applicable
     */
    public static String getOperationNameForStaticOperationSelector(Binding binding) {
        OperationSelectorType opSelect = getFirstOperationSelector(binding);
        if (opSelect != null) {
            if (opSelect instanceof StaticOperationSelectorType) {
                StaticOperationSelectorType staticOpSelect = (StaticOperationSelectorType) opSelect;
                return staticOpSelect.getOperationName();
            }
        }
        return null;
    }


}
