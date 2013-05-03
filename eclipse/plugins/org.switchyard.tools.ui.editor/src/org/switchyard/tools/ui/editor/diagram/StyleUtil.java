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

/**
 * @author bfitzpat
 * 
 */
public final class StyleUtil {

    /*
     * The color palette is created by selecting a basic hue, then applying a
     * saturation of ~.5 and a brightness of .8-1. From there adjust the
     * saturation up (e.g. .8) for the dark gradient and down (e.g. .2) for the
     * light gradient. Use the dark gradient value, but reduce the brightness
     * to ~.2 for the text color. For the border color, use one of the
     * text, dark gradient or base color (from hardest to softest appearance).
     */
    /** The color palette for references. */
    public static final FigurePalette REFERENCE_PALETTE = new FigurePalette("291F33", "CA99FF", "A64DFF", "F2E6FF");
    /** The color palette for services. */
    public static final FigurePalette SERVICE_PALETTE = new FigurePalette("053305", "8AE68A", "45E645", "CFE6CF");
    /** The color palette for components. */
    public static final FigurePalette COMPONENT_PALETTE = new FigurePalette("1A1D33", "8C9CFF", "4D63FF", "CCD3FF");
    /** The color palette for composites. */
    public static final FigurePalette COMPOSITE_PALETTE = new FigurePalette("1F2933", "80C1FF", "4DA6FF", "B3DAFF");

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
     * Points and bezier offsets for the large right arrow.
     */
    public static final int[][] LARGE_RIGHT_ARROW = new int[][] {{0, 0, 75, 0, 100, 25, 75, 50, 0, 50, 15, 25, 0, 0 },
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 } };

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
    public static final int COMPONENT_EDGE = 15;

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
            style.setForeground(gaService.manageColor(diagram, new ColorConstant(COMPOSITE_PALETTE.getForeground())));
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
            style.setForeground(gaService.manageColor(diagram, new ColorConstant(COMPONENT_PALETTE.getForeground())));
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
            style.setForeground(gaService.manageColor(diagram, new ColorConstant(SERVICE_PALETTE.getForeground())));
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
            style.setForeground(gaService.manageColor(diagram, new ColorConstant(REFERENCE_PALETTE.getForeground())));
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
     * @param <T> the GA type
     * @return GA or null if not found
     */
    public static <T extends GraphicsAlgorithm> T findChildGA(final GraphicsAlgorithm parent, final Class<T> gaSearchType) {
        EList<GraphicsAlgorithm> childGAs = parent.getGraphicsAlgorithmChildren();
        for (GraphicsAlgorithm graphicsAlgorithm : childGAs) {
            if (graphicsAlgorithm.getClass().getCanonicalName().contentEquals(gaSearchType.getCanonicalName())) {
                return gaSearchType.cast(graphicsAlgorithm);
            } else if (graphicsAlgorithm.getClass() != gaSearchType
                    && gaSearchType.isAssignableFrom(graphicsAlgorithm.getClass())) {
                return gaSearchType.cast(graphicsAlgorithm);
            }
            if (graphicsAlgorithm.getGraphicsAlgorithmChildren().size() > 0) {
                return findChildGA(graphicsAlgorithm, gaSearchType);
            }
        }
        return null;
    }

    /**
     * Describes a palette colors used for representing a specific figure.
     */
    public static final class FigurePalette {
        private final String _textForeground;
        private final String _foreground;
        private final String _backgroundDark;
        private final String _backgroundLight;

        /**
         * Create a new FigurePalette.
         * 
         * @param textForeground text color
         * @param foreground border color
         * @param backgroundDark dark background color
         * @param backgroundLight light background color
         */
        public FigurePalette(String textForeground, String foreground, String backgroundDark, String backgroundLight) {
            super();
            _textForeground = textForeground;
            _foreground = foreground;
            _backgroundDark = backgroundDark;
            _backgroundLight = backgroundLight;
        }

        /**
         * Get the text foreground color.
         * 
         * @return the textForeground.
         */
        public String getTextForeground() {
            return _textForeground;
        }

        /**
         * Get the foreground (border) color.
         * 
         * @return the foreground.
         */
        public String getForeground() {
            return _foreground;
        }

        /**
         * Get the dark background color.
         * 
         * @return the backgroundDark.
         */
        public String getBackgroundDark() {
            return _backgroundDark;
        }

        /**
         * Get the light background color.
         * 
         * @return the backgroundLight.
         */
        public String getBackgroundLight() {
            return _backgroundLight;
        }

    }
}
