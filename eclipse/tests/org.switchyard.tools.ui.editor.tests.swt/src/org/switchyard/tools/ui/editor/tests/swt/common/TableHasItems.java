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

import java.text.MessageFormat;

import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;

/**
 * Condition to test to see if a table has items (=> the item count)
 * @author bfitzpat
 *
 */
public class TableHasItems extends DefaultCondition {

    /** The list under testing */
    private SWTBotTable list;

    /** The number of rows to test for */
    private int itemCt;

    /**
     * Create a condition: test() returns true if the list contains itemCt
     * items.
     * 
     * @param list the list to check
     * @param itemCt how many items should be in the list
     */
    public TableHasItems(SWTBotTable list, int itemCt) {
        this.list = list;
        this.itemCt = itemCt;
    }

    /*
     * @see org.eclipse.swtbot.swt.finder.waits.ICondition#test()
     */
    @Override
    public boolean test() throws Exception {
        return this.itemCt <= list.rowCount();
    }

    /*
     * @see
     * org.eclipse.swtbot.swt.finder.waits.ICondition#getFailureMessage()
     */
    @Override
    public String getFailureMessage() {
        String listMsg = "The table {0} contained {1} items.";
        String listId = list.getId();
        int itemCt = list.rowCount();
        return MessageFormat.format(listMsg, listId, itemCt);
    }
}