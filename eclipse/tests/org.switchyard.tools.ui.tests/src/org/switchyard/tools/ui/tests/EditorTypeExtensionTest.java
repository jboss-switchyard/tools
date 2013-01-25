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
package org.switchyard.tools.ui.tests;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.junit.Assert;
import org.junit.Test;
import org.switchyard.tools.models.switchyard1_0.bean.BeanImplementationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType;
import org.switchyard.tools.models.switchyard1_0.camel.file.CamelFileBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.ftp.CamelFtpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jms.CamelJmsBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.jpa.CamelJPABindingType;
import org.switchyard.tools.models.switchyard1_0.camel.mail.CamelMailBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyTcpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.netty.CamelNettyUdpBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpBindingType;
import org.switchyard.tools.models.switchyard1_0.jca.JCABinding;
import org.switchyard.tools.models.switchyard1_0.resteasy.RESTBindingType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension;
import org.switchyard.tools.ui.common.SwitchYardComponentExtensionManager;
import org.switchyard.tools.ui.editor.BindingTypeExtensionManager;
import org.switchyard.tools.ui.editor.ComponentTypeExtensionManager;
import org.switchyard.tools.ui.editor.IBindingTypeExtension;
import org.switchyard.tools.ui.editor.IComponentTypeExtension;

/**
 * EditorTypeExtensionTest
 * 
 * <p/>
 * Unit tests for editor extensions.
 */
public class EditorTypeExtensionTest extends TestCase {

    /**
     * Validates that each type returns at least one required capability and
     * that all the capabilities can be resolved (i.e. that the id's returned by
     * the extensions match a component extension).
     */
    @Test
    public void testBindingTypeCapabilities() {
        Assert.assertTrue(getRequiredBindingCapabilities(CamelFileBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(CamelFtpBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(CamelJmsBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(CamelJPABindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(CamelMailBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(CamelNettyTcpBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(CamelNettyUdpBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(CamelQuartzBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(CamelSqlBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(HttpBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(JCABinding.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(RESTBindingType.class).size() > 0);
        Assert.assertTrue(getRequiredBindingCapabilities(SOAPBindingType.class).size() > 0);
    }

    /**
     * Validates that each type returns at least one required capability and
     * that all the capabilities can be resolved (i.e. that the id's returned by
     * the extensions match a component extension).
     */
    @Test
    public void testImplementationTypeCapabilities() {
        Assert.assertTrue(getRequiredImplementationCapabilities(BeanImplementationType.class).size() > 0);
        Assert.assertTrue(getRequiredImplementationCapabilities(BPMImplementationType.class).size() > 0);
        Assert.assertTrue(getRequiredImplementationCapabilities(CamelImplementationType.class).size() > 0);
        Assert.assertTrue(getRequiredImplementationCapabilities(RulesImplementationType.class).size() > 0);
    }

    private Collection<ISwitchYardComponentExtension> getRequiredBindingCapabilities(Class<? extends Binding> type) {
        IBindingTypeExtension extension = BindingTypeExtensionManager.instance().getExtensionFor(type);
        List<String> ids = extension.getRequiredCapabilities((Binding) createProxy(type));
        Collection<ISwitchYardComponentExtension> components = getComponents(ids);
        Assert.assertTrue(ids.size() == components.size());
        return components;
    }

    private Collection<ISwitchYardComponentExtension> getRequiredImplementationCapabilities(
            Class<? extends Implementation> type) {
        IComponentTypeExtension extension = ComponentTypeExtensionManager.instance().getExtensionFor(type);
        List<String> ids = extension.getRequiredCapabilities((Implementation) createProxy(type));
        Collection<ISwitchYardComponentExtension> components = getComponents(ids);
        Assert.assertTrue(ids.size() == components.size());
        return components;
    }

    private Collection<ISwitchYardComponentExtension> getComponents(Collection<String> ids) {
        Set<ISwitchYardComponentExtension> components = new HashSet<ISwitchYardComponentExtension>();
        for (String id : ids) {
            ISwitchYardComponentExtension component = SwitchYardComponentExtensionManager.instance()
                    .getComponentExtension(id);
            if (component != null) {
                components.add(component);
            }
        }
        return components;
    }

    private Object createProxy(Class<?> type) {
        return Proxy.newProxyInstance(getClass().getClassLoader(), new Class<?>[] {type }, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });
    }
}
