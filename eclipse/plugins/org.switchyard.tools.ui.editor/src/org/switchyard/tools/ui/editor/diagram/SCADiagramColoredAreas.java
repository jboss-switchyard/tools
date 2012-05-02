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

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.util.IGradientType;
import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
import org.eclipse.graphiti.util.PredefinedColoredAreas;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramColoredAreas extends PredefinedColoredAreas implements ISCADiagramRenderingStyle {

    /**
     * @return the list of areas for composites
     */
    public static AdaptedGradientColoredAreas getCompositeAdaptions() {
        final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
        agca.setDefinedStyleId(COMPOSITE_ID);
        agca.setGradientType(IGradientType.VERTICAL);
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
                getCompositeDefaultAreas());
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
                getCompositePrimarySelectedAreas());
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
                getCompositeSecondarySelectedAreas());
        return agca;
    }

    private static GradientColoredAreas getCompositeDefaultAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "FAFBFC", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "6670FF", 0, //"D4E7F8", 0, //$NON-NLS-2$
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    private static GradientColoredAreas getCompositePrimarySelectedAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "AAD0F2", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "81B9EA", 0, //$NON-NLS-1$ 
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    /**
     * The color-areas, which are used for secondary selected elements with the
     * ID {@link #BLUE_WHITE_ID}.
     */
    private static GradientColoredAreas getCompositeSecondarySelectedAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "C5E0F7", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "BBDAF7", 0, //$NON-NLS-1$ 
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    /**
     * @return list af areas for components
     */
    public static AdaptedGradientColoredAreas getComponentAdaptions() {
        final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
        agca.setDefinedStyleId(COMPONENT_ID);
        agca.setGradientType(IGradientType.VERTICAL);
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
                getComponentDefaultAreas());
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
                getComponentPrimarySelectedAreas());
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
                getComponentSecondarySelectedAreas());
        return agca;
    }

    private static GradientColoredAreas getComponentDefaultAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "FAFBFC", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "c7eafb", 0, //$NON-NLS-2$
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    private static GradientColoredAreas getComponentPrimarySelectedAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "AAD0F2", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "81B9EA", 0, //$NON-NLS-1$ 
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    /**
     * The color-areas, which are used for secondary selected elements with the
     * ID {@link #BLUE_WHITE_ID}.
     */
    private static GradientColoredAreas getComponentSecondarySelectedAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "C5E0F7", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "BBDAF7", 0, //$NON-NLS-1$ 
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    /**
     * @return list af areas for services
     */
    public static AdaptedGradientColoredAreas getServiceAdaptions() {
        final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
        agca.setDefinedStyleId(SERVICE_ID);
        agca.setGradientType(IGradientType.VERTICAL);
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
                getServiceDefaultAreas());
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
                getServicePrimarySelectedAreas());
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
                getServiceSecondarySelectedAreas());
        return agca;
    }

    private static GradientColoredAreas getServiceDefaultAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "FAFBFC", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "99cc99", 0, //$NON-NLS-2$
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    private static GradientColoredAreas getServicePrimarySelectedAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "99cc99", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "6E956E", 0, //$NON-NLS-1$ 
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    /**
     * The color-areas, which are used for secondary selected elements with the
     * ID {@link #BLUE_WHITE_ID}.
     */
    private static GradientColoredAreas getServiceSecondarySelectedAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "C5E0F7", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "BBDAF7", 0, //$NON-NLS-1$ 
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    /**
     * @return list af areas for references
     */
    public static AdaptedGradientColoredAreas getReferenceAdaptions() {
        final AdaptedGradientColoredAreas agca = StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();
        agca.setDefinedStyleId(REFERENCE_ID);
        agca.setGradientType(IGradientType.VERTICAL);
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT,
                getReferenceDefaultAreas());
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED,
                getReferencePrimarySelectedAreas());
        agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED,
                getReferenceSecondarySelectedAreas());
        return agca;
    }

    private static GradientColoredAreas getReferenceDefaultAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "F7EEEB", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "F69679", 0, //$NON-NLS-2$
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    private static GradientColoredAreas getReferencePrimarySelectedAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "99cc99", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "6E956E", 0, //$NON-NLS-1$ 
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }

    /**
     * The color-areas, which are used for secondary selected elements with the
     * ID {@link #BLUE_WHITE_ID}.
     */
    private static GradientColoredAreas getReferenceSecondarySelectedAreas() {
        final GradientColoredAreas gradientColoredAreas = StylesFactory.eINSTANCE.createGradientColoredAreas();
        gradientColoredAreas.setStyleAdaption(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED);
        final EList<GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();

        addGradientColoredArea(gcas, "C5E0F7", //$NON-NLS-1$
                0, LocationType.LOCATION_TYPE_ABSOLUTE_START, "BBDAF7", 0, //$NON-NLS-1$ 
                LocationType.LOCATION_TYPE_ABSOLUTE_END);
        return gradientColoredAreas;
    }
}
