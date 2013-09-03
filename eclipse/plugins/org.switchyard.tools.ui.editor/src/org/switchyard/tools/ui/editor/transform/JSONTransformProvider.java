/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.editor.transform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.transform.JsonTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformFactory;
import org.switchyard.tools.ui.editor.Activator;
import org.switchyard.tools.ui.editor.Messages;

/**
 * JSONTransformProvider
 * 
 * <p/>
 * Provides UI and factory for creating JSON transformer objects.
 */
public class JSONTransformProvider implements ITransformProvider {

    private Collection<TransformType> _transforms;

    @Override
    public boolean providesWizard() {
        return false;
    }

    @Override
    public INewTransformWizard createWizard() {
        return null;
    }

    @Override
    public ITransformControl createTransformControl(Composite parent, IContainer container) {
        return new ITransformControl() {

            @Override
            public IStatus validate() {
                if (_transforms != null) {
                    for (TransformType transformer : _transforms) {
                        if (NewTransformWizard.isJavaType(transformer.getFrom())) {
                            if (NewTransformWizard.isJavaType(transformer.getTo())) {
                                return new Status(Status.ERROR, Activator.PLUGIN_ID,
                                        Messages.error_jsonTransformerOnlySupportsJsonToFromJava);
                            }
                        } else if (!NewTransformWizard.isJavaType(transformer.getTo())) {
                            return new Status(Status.ERROR, Activator.PLUGIN_ID,
                                    Messages.error_jsonTransformerOnlySupportsJsonToFromJava);
                        }
                    }
                }
                return Status.OK_STATUS;
            }

            @Override
            public void dispose() {
            }

            @Override
            public void setVisible(boolean visible) {
            }

            @Override
            public void setSelectedTransforms(Collection<TransformType> transforms) {
                _transforms = transforms;
            }

            @Override
            public void setLayoutData(Object data) {
            }

            @Override
            public Collection<TransformType> createTransforms() {
                if (_transforms == null) {
                    return Collections.emptyList();
                }
                final List<TransformType> jsonTransforms = new ArrayList<TransformType>(_transforms.size());
                for (TransformType transform : _transforms) {
                    JsonTransformType jsonTransform = TransformFactory.eINSTANCE.createJsonTransformType();
                    jsonTransform.setFrom(transform.getFrom());
                    jsonTransform.setTo(transform.getTo());
                    jsonTransforms.add(jsonTransform);
                }
                return jsonTransforms;
            }
        };
    }

    @Override
    public String getName() {
        return Messages.label_jsonTransformer;
    }

}
