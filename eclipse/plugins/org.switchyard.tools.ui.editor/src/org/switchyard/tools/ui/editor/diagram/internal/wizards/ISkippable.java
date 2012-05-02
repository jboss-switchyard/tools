/*******************************************************************************
 * Copyright (c) 2005 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: shongxum - initial API and implementation
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.internal.wizards;

/**
 * Specifies behavior of a wizard page that allows it to decide whether it
 * belongs to the sequence of wizard pages in the wizard dialog or is skipped.
 * 
 * @author shongxum
 */
public interface ISkippable {

    /**
     * Returns the visibility status of the page.
     * 
     * @return True if a page should be skipped in a sequence of a wizard
     *         dialog.
     */
    public boolean getSkippable();

    /**
     * Marks the wizard page as hidden or visible depending on a parameter
     * value.
     * 
     * @param b A value that specifies whether the page should be skipped ina a
     *            sequence of a wizard dialog.
     */
    public void setSkippable(boolean b);
}
