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
package org.switchyard.tools.ui.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.ui.editor.diagram.binding.AbstractSYBindingComposite;
import org.switchyard.tools.ui.editor.diagram.shared.IBindingComposite;

/**
 * BindingTypeExtensionManager
 * 
 * <p/>
 * Manages the set of contributed component type extensions, i.e. loads the
 * extensions and provides access to them.
 */
public final class BindingTypeExtensionManager {

    private static final BindingTypeExtensionManager INSTANCE = new BindingTypeExtensionManager();

    /**
     * @return the sole instance of the component type extension manager.
     */
    public static BindingTypeExtensionManager instance() {
        return INSTANCE;
    }

    private Map<Class<? extends Binding>, IBindingTypeExtension> _cache = new HashMap<Class<? extends Binding>, IBindingTypeExtension>();
    private List<IBindingTypeExtension> _extensions = new ArrayList<IBindingTypeExtension>();
    private IBindingTypeExtension _defaultExtension = new DefaultBindingTypeExtension();

    /**
     * Create a new BindingTypeExtensionManager.
     */
    private BindingTypeExtensionManager() {
        loadExtensions();
    }

    /**
     * @param type the binding type
     * @return the extension supporting this type.
     */
    public IBindingTypeExtension getExtensionFor(Class<? extends Binding> type) {
        if (_cache.containsKey(type)) {
            return _cache.get(type);
        }
        for (IBindingTypeExtension extension : _extensions) {
            if (extension.supports(type)) {
                _cache.put(type, extension);
                return extension;
            }
        }
        _cache.put(type, _defaultExtension);
        return _defaultExtension;
    }

    /**
     * @return all the registered extensions.
     */
    public Collection<IBindingTypeExtension> getExtensions() {
        return Collections.unmodifiableCollection(_extensions);
    }

    private void loadExtensions() {
        IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(Activator.PLUGIN_ID,
                "editorExtension"); //$NON-NLS-1$
        for (IExtension pluginExtension : extensionPoint.getExtensions()) {
            for (IConfigurationElement element : pluginExtension.getConfigurationElements()) {
                if (!"bindingExtension".equals(element.getName())) { //$NON-NLS-1$
                    continue;
                }
                try {
                    _extensions.add((IBindingTypeExtension) element.createExecutableExtension("class")); //$NON-NLS-1$
                } catch (CoreException e) {
                    Activator.getDefault().getLog().log(e.getStatus());
                }
            }
        }
    }

    private static final class DefaultBindingTypeExtension implements IBindingTypeExtension {
        @Override
        public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
            return new ICreateFeature[0];
        }

        @Override
        public ImageDecorator getImageDecorator(Binding binding) {
            return new ImageDecorator(ImageProvider.IMG_16_UNKNOWN_IMPL);
        }

        @Override
        public boolean supports(Class<? extends Binding> type) {
            return false;
        }

        @Override
        public List<IBindingComposite> createComposites(FormToolkit toolkit, Binding binding) {
            return Collections.<IBindingComposite> singletonList(new DefaultBindingComposite(toolkit));
        }

        @Override
        public List<String> getRequiredCapabilities(Binding object) {
            return Collections.emptyList();
        }

        @Override
        public String getTypeName(Binding object) {
            return Messages.constant_unknown;
        }
    }

    private static final class DefaultBindingComposite extends AbstractSYBindingComposite {
        private Composite _composite;

        private DefaultBindingComposite(FormToolkit toolkit) {
            super(toolkit);
        }

        @Override
        public String getTitle() {
            return Messages.constant_unknownBindingType;
        }

        @Override
        public String getDescription() {
            return Messages.constant_description_unknownBindingType;
        }

        @Override
        protected boolean validate() {
            return true;
        }

        @Override
        protected void handleModify(Control control) {
        }

        @Override
        public Composite getPanel() {
            return _composite;
        }

        @Override
        public void createContents(Composite parent, int style, DataBindingContext context) {
            _composite = getToolkit().createComposite(parent, style);
        }
    }

}
