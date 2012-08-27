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

public interface BaseService {
	
	int testInOutMethod(String input);
	
	void testInOnlyMethod(String input);

	int testFaultMethod(String input) throws Exception;
}
