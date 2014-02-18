/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.sql;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlPackage;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.Messages;
import org.switchyard.tools.ui.editor.diagram.binding.AdvancedCamelBindingDetailsComposite;
import org.switchyard.tools.ui.editor.diagram.binding.CreateBindingFeature;
import org.switchyard.tools.ui.editor.diagram.binding.MessageComposerComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * CamelSQLBindingTypeExtension
 * 
 * <p/>
 * Editor extension support Camel SQL bindings.
 */
public class CamelSQLBindingTypeExtension implements IBindingTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CreateBindingFeature(fp, new CamelSqlBindingFactory(), Messages.label_sql,
                Messages.description_tool_sql, ImageProvider.IMG_16_SQL) };
    }

    @Override
    public IImageDecorator getImageDecorator(Binding binding) {
        return new ImageDecorator(ImageProvider.IMG_16_SQL);
    }

    @Override
    public boolean supports(Class<? extends Binding> type) {
        return CamelSqlBindingType.class.isAssignableFrom(type);
    }

    @Override
    public List<IBindingComposite> createComposites(FormToolkit toolkit, Binding binding) {
        return createComposites(toolkit);
    }

    @Override
    public List<String> getRequiredCapabilities(Binding object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-camel-sql"); //$NON-NLS-1$
    }

    @Override
    public String getTypeName(Binding object) {
        return Messages.label_sql;
    }

    protected static List<IBindingComposite> createComposites(FormToolkit toolkit) {
        final List<IBindingComposite> composites = new ArrayList<IBindingComposite>(4);
        composites.add(new CamelSQLComposite(toolkit));
        composites.add(new MessageComposerComposite(toolkit,
                SqlPackage.Literals.BASE_CAMEL_BINDING__MESSAGE_COMPOSER,
                SqlPackage.Literals.BASE_CAMEL_BINDING__CONTEXT_MAPPER));
        composites.add(new AdvancedCamelBindingDetailsComposite(toolkit, ADVANCED_PROPS,
                SqlPackage.eINSTANCE.getBaseCamelBinding_AdditionalUriParameters(), 
                SqlPackage.eINSTANCE.getAdditionalUriParametersType_Parameter(), 
                SqlPackage.eINSTANCE.getParameterType()));
        return composites;
    }

    private static final List<String> ADVANCED_PROPS;
    
    static {
        ADVANCED_PROPS = new ArrayList<String>();
        ADVANCED_PROPS.add("batch"); //$NON-NLS-1$
    }
}
