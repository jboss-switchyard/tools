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
package org.switchyard.tools.ui.editor.diagram;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.StyleContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

/**
 * @author bfitzpat
 * 
 */
public final class StyleUtil {

    /**
     * COLOR - Black.
     */
    public static final IColorConstant BLACK = new ColorConstant("000000");

    /**
     * Color - Bright Orange.
     */
    public static final IColorConstant BRIGHT_ORANGE = new ColorConstant("FF6600");

    /**
     * Color - light blue.
     */
    public static final IColorConstant LIGHT_BLUE = new ColorConstant("c7eafb");

    /**
     * Color - Orange.
     */
    public static final IColorConstant ORANGE = new ColorConstant("f69679"); // orange

    /**
     * Color - Green.
     */
    public static final IColorConstant GREEN = new ColorConstant("99cc99"); // green

    /**
     * Color - Periwinkle Blue.
     */
    public static final IColorConstant PERIWINKLE_BLUE = new ColorConstant("6699ff"); // periwinkle

    /**
     * Points for the small right arrow.
     */
    public static final int[] SMALL_RIGHT_ARROW = new int[] {0, 0, 15, 0, 20, 5, 15, 10, 0, 10, 3, 5, 0, 0 };

    /**
     * Small right arrow width.
     */
    public static final int SMALL_RIGHT_ARROW_WIDTH = 20;

    /**
     * Small right arrow height.
     */
    public static final int SMALL_RIGHT_ARROW_HEIGHT = 15;

    /**
     * Points for the medium sized right arrow.
     */
    public static final int[] MEDIUM_RIGHT_ARROW = new int[] {0, 0, 45, 0, 50, 15, 45, 30, 0, 30, 33, 15, 0, 0 };

    /**
     * Medium right arrow width.
     */
    public static final int MEDIUM_RIGHT_ARROW_WIDTH = 50;

    /**
     * Medium right arrow height.
     */
    public static final int MEDIUM_RIGHT_ARROW_HEIGHT = 30;

    /**
     * Points for the large right arrow.
     */
    public static final int[] LARGE_RIGHT_ARROW = new int[] {0, 0, 75, 0, 100, 25, 75, 50, 0, 50, 15, 25, 0, 0 };

    /**
     * Large right arrow width.
     */
    public static final int LARGE_RIGHT_ARROW_WIDTH = 100;

    /**
     * Large right arrow height.
     */
    public static final int LARGE_RIGHT_ARROW_HEIGHT = 75;

    /**
     * Composite rectangle width.
     */
    public static final int COMPOSITE_WIDTH = 500;

    /**
     * Composite rectangle width.
     */
    public static final int COMPOSITE_HEIGHT = 300;

    /**
     * Composite edge for the invisible rectangle.
     */
    public static final int COMPOSITE_OUTER_EDGE = 30;

    /**
     * Distance that services and reference protrude out from the composite.
     */
    public static final int COMPOSITE_PROTRUSION_WIDTH = 20;

    /**
     * Composite edge spacing for shapes within the visible rectangle.
     */
    public static final int COMPOSITE_INNER_EDGE = 15;

    /** Spacing between composite children. */
    public static final int COMPOSITE_CHILD_V_SPACING = 10;

    /**
     * Component rectangle width.
     */
    public static final int COMPONENT_WIDTH = 100;

    /**
     * Component rectangle height.
     */
    public static final int COMPONENT_HEIGHT = 50;

    /**
     * Component edge for the invisible rectangle.
     */
    public static final int COMPONENT_EDGE = 10;

    /** Spacing between ComponentService and ComponentReference nubs. */
    public static final int COMPONENT_CHILD_V_SPACING = 20;

    /**
     * Base service size width.
     */
    public static final int SERVICE_WIDTH = 100;

    /**
     * Base service size height.
     */
    public static final int SERVICE_HEIGHT = 50;

    /**
     * Base service lip for the invisible rectangle.
     */
    public static final int SERVICE_INVISIBLE_RECT_RIGHT = 10;

    /**
     * Base composite reference size width.
     */
    public static final int COMPOSITE_REFERENCE_WIDTH = 100;

    /**
     * Base composite reference size height.
     */
    public static final int COMPOSITE_REFERENCE_HEIGHT = 50;

    /**
     * Base composite reference lip for the invisible rectangle.
     */
    public static final int COMPOSITE_REFERENCE_INVISIBLE_RECT_RIGHT = 10;

    private StyleUtil() {
        // empty
    }

    /**
     * @param diagram diagram to get style from
     * @return Style
     */
    public static Style getStyleForComposite(Diagram diagram) {
        final String styleId = "Composite";
        Style style = findStyle(diagram, styleId);
        if (style == null) {
            // style not found - create new style
            IGaService gaService = Graphiti.getGaService();
            style = gaService.createStyle(diagram, styleId);
            style.setForeground(gaService.manageColor(diagram, ORANGE));
            gaService.setRenderingStyle(style, SCADiagramColoredAreas.getCompositeAdaptions());
            style.setLineWidth(2);
        }

        return style;
    }

    /**
     * @param diagram diagram to get style from
     * @return Style
     */
    public static Style getStyleForComponent(Diagram diagram) {
        final String styleId = "Component";
        Style style = findStyle(diagram, styleId);
        if (style == null) {
            // style not found - create new style
            IGaService gaService = Graphiti.getGaService();
            style = gaService.createStyle(diagram, styleId);
            style.setForeground(gaService.manageColor(diagram, BRIGHT_ORANGE));
            gaService.setRenderingStyle(style, SCADiagramColoredAreas.getComponentAdaptions());
            style.setLineWidth(2);
        }

        return style;
    }

    /**
     * @param diagram diagram to get style from
     * @return Style
     */
    public static Style getStyleForService(Diagram diagram) {
        final String styleId = "Service";
        Style style = findStyle(diagram, styleId);
        if (style == null) {
            // style not found - create new style
            IGaService gaService = Graphiti.getGaService();
            style = gaService.createStyle(diagram, styleId);
            style.setForeground(gaService.manageColor(diagram, BRIGHT_ORANGE));
            gaService.setRenderingStyle(style, SCADiagramColoredAreas.getServiceAdaptions());
            style.setLineWidth(2);
        }

        return style;
    }

    /**
     * @param diagram diagram to get style from
     * @return Style
     */
    public static Style getStyleForCompositeReference(Diagram diagram) {
        final String styleId = "CompositeReference";
        Style style = findStyle(diagram, styleId);
        if (style == null) {
            // style not found - create new style
            IGaService gaService = Graphiti.getGaService();
            style = gaService.createStyle(diagram, styleId);
            style.setForeground(gaService.manageColor(diagram, BLACK));
            gaService.setRenderingStyle(style, SCADiagramColoredAreas.getReferenceAdaptions());
            style.setLineWidth(2);
        }

        return style;
    }

    // find the style with a given id in the style-container, can return null
    private static Style findStyle(StyleContainer styleContainer, String id) {
        // find and return style
        Collection<Style> styles = styleContainer.getStyles();
        if (styles != null) {
            for (Style style : styles) {
                if (id.equals(style.getId())) {
                    return style;
                }
            }
        }
        return null;
    }

    /**
     * @param parent parent GA
     * @param gaSearchType GA type to search for
     * @return GA or null if not found
     */
    public static GraphicsAlgorithm findChildGA(final GraphicsAlgorithm parent, final Class<?> gaSearchType) {
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
