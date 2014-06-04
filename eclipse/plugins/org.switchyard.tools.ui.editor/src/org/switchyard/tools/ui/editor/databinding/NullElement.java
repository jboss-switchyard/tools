/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 *     Henno Vermeulen - http://www.eclipse.org/forums/index.php/t/171826/
 ******************************************************************************/
package org.switchyard.tools.ui.editor.databinding;

/**
 * An element which can be used in JFace {@link Viewer}s to represent a
 * <code>null</code> value in the model.
 */
public final class NullElement {
    private static final NullElement INSTANCE = new NullElement();
    private final String _name;

    private NullElement() {
        this("");
    }

    /**
     * @param name Name of element (default empty string)
     */
    public NullElement(String name) {
        this._name = name;
    }

    /**
     * @return instance of the null element
     */
    public static NullElement getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return _name;
    }

}
