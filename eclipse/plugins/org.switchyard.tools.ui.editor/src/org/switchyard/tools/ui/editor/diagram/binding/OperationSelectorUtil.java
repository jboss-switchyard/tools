package org.switchyard.tools.ui.editor.diagram.binding;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType;

/**
 * @author bfitzpat
 * 
 */
public final class OperationSelectorUtil {

    private OperationSelectorUtil() {
        // private constructor
    }

    /**
     * @param binding to check
     * @return first OperationSelector object
     */
    public static OperationSelectorType getFirstOperationSelector(Binding binding) {
        if (binding.getOperationSelector() != null) {
            return binding.getOperationSelector();
        }
        return null;
    }
    
    /**
     * @param binding binding to check
     * @return null if not applicable or name if applicable
     */
    public static String getOperationNameForStaticOperationSelector(Binding binding) {
        OperationSelectorType opSelect = getFirstOperationSelector(binding);
        if (opSelect != null && opSelect instanceof StaticOperationSelectorType) {
            StaticOperationSelectorType staticOpSelect = (StaticOperationSelectorType) opSelect;
            return staticOpSelect.getOperationName();
        }
        return null;
    }

    /**
     * @param binding binding to check
     * @return null if not applicable or expression if applicable
     */
    public static String getExpressionForRegexOperationSelector(Binding binding) {
        OperationSelectorType opSelect = getFirstOperationSelector(binding);
        if (opSelect != null && opSelect instanceof RegexOperationSelectorType) {
            RegexOperationSelectorType opSelector = (RegexOperationSelectorType) opSelect;
            return opSelector.getExpression();
        }
        return null;
    }

}
