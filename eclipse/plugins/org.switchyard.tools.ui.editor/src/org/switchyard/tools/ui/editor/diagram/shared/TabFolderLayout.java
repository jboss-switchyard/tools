/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

/**
 * @author rcernich
 *
 */
public class TabFolderLayout extends Layout {
    
    private TabFolder _tabFolder;
    
    /**
     * @param folder Folder to lay out
     */
    public TabFolderLayout(TabFolder folder) {
        super();
        this._tabFolder = folder;
    }

    @Override
    protected void layout(Composite composite, boolean flushCache) {
        Rectangle rect = composite.getClientArea();

        TabItem[] selected = _tabFolder.getSelection();
        if (selected == null || selected.length == 0) {
            return;
        }
        selected[0].getControl().setBounds(rect);
    }

    @Override
    protected Point computeSize(Composite composite, int wHint, int hHint, boolean flushCache) {
        if (wHint != SWT.DEFAULT && hHint != SWT.DEFAULT) {
            return new Point(wHint, hHint);
        }

        int maxWidth = 0;
        int maxHeight = 0;
        TabItem[] selected = _tabFolder.getSelection();
        if (selected != null && selected.length > 0) {
            Point pt = selected[0].getControl().computeSize(wHint, hHint, flushCache);
            maxWidth = Math.max(0, pt.x);
            maxHeight = Math.max(0, pt.y);
        }

        if (wHint != SWT.DEFAULT) {
            maxWidth = Math.max(wHint, maxWidth);
        }
        if (hHint != SWT.DEFAULT) {
            maxWidth = Math.max(hHint, maxHeight);
        }

        return new Point(maxWidth, maxHeight);
    }

}
