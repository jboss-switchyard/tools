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
package org.switchyard.tools.ui.editor.tests.swt.common;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

/**
 *  Find and operate on the Project Explorer view.
 */
public class ProjectExplorerBot {
    
    public static final String LINK_WITH_EDITOR = "Link with Editor";
    public static final String RESOURCE_PERSPECTIVE_ID = "org.eclipse.ui.resourcePerspective";
    public static final String PROJECT_EXPLORER_ID = "org.eclipse.ui.navigator.ProjectExplorer";

    private static SWTWorkbenchBot bot= new SWTWorkbenchBot();
    private SWTBotView project_view;
    
    public ProjectExplorerBot() {
        bot.perspectiveById(RESOURCE_PERSPECTIVE_ID).activate();
        project_view = bot.viewById(PROJECT_EXPLORER_ID);
        project_view.setFocus();
    }
    
    public SWTBotTreeItem findTreeItemWithLabel(SWTBotTreeItem root, String label) {
        if (root.getText().contentEquals(label)) {
            return root;
        }
        if (!root.isExpanded()) {
            root.expand();
        }
        if (root.getItems() != null && root.getItems().length > 0) {
            SWTBotTreeItem[] rootItems = root.getItems();
            for (SWTBotTreeItem item : rootItems) {
                SWTBotTreeItem result = findTreeItemWithLabel(item, label);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
    
    public SWTBotTree getTree() {
        project_view.setFocus();
        SWTBotTree viewTree = project_view.bot().tree();
        return viewTree;
    }
    
    public SWTBotTreeItem canFindItemInTree ( String fileName ) {
        project_view.setFocus();
        SWTBotTree viewTree = project_view.bot().tree();
        SWTBotTreeItem[] rootItems = viewTree.getAllItems();
        SWTBotTreeItem output = null;
        for (SWTBotTreeItem rootItem : rootItems) {
            output = findTreeItemWithLabel(rootItem, fileName);
            if (output != null) {
                return output;
            }
        }
        return null;
    }
    
    public void setLinkWithEditor() {
        project_view.menu(LINK_WITH_EDITOR).click();
    }
    
    public boolean getLinkWithEditor() {
        return project_view.menu(LINK_WITH_EDITOR).isChecked();
    }
    
    public void doubleClickProject ( String projectName ) {
        SWTBotTreeItem item = canFindItemInTree(projectName);
        item.doubleClick();
    }
    
    public boolean isProjectSelected ( String projectName) {
        if (project_view.bot().tree().selectionCount() != 1) {
            return false;
        }
        return true;
    }
    
}
