package org.switchyard.tools.ui.editor.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;

/**
 * Set of Graphiti helper utility functions.
 */
public final class GraphitiUtil {
    
    private GraphitiUtil(){
        // empty constructor
    }

    /**
     * @param parent Graphics Algorithm
     * @param gaSearchType Graphics Algorithm class to look for
     * @return found GA
     */
    public static GraphicsAlgorithm findChildGA(GraphicsAlgorithm parent, Class<?> gaSearchType) {
        EList<GraphicsAlgorithm> childGAs = parent.getGraphicsAlgorithmChildren();
        for (GraphicsAlgorithm graphicsAlgorithm : childGAs) {
            if (graphicsAlgorithm.getClass().getCanonicalName().contentEquals(gaSearchType.getCanonicalName())) {
                return graphicsAlgorithm;
            } else if (graphicsAlgorithm.getClass() != gaSearchType
                    && gaSearchType.isAssignableFrom(graphicsAlgorithm.getClass())) {
                return graphicsAlgorithm;
            }
            if (graphicsAlgorithm.getGraphicsAlgorithmChildren().size() > 0) {
                return findChildGA(graphicsAlgorithm, gaSearchType);
            }
        }
        return null;
    }
}
