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
package org.switchyard.tools.tests.wiring_validation_tests;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Transformers {
	@Transformer(from = "{urn:org.switchyard.tools.tests:wiring-validation-tests:0.0.1-SNAPSHOT}testInOutMethod")
	public static String transform(Element from) {
		NodeList strings = from.getElementsByTagName("string");
		if (strings == null || strings.getLength() == 0) {
			return null;
		}
		return ((Element) strings.item(0)).getTextContent();
	}

}
