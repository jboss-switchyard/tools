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

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.matchers.WidgetMatcherFactory;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotStyledText;

/**
 *  Find the Console view and wait for Maven to finish building/testing.
 */
public class MavenConsoleBot {

    public static final String CONSOLE_VIEW_ID = "org.eclipse.ui.console.ConsoleView";
    private final String FINISH_MARKER = "[INFO] Finished at:";
    private final String BUILD_FAILURE_MARKER = "[INFO] BUILD FAILURE";

    private SWTWorkbenchBot bot= new SWTWorkbenchBot();
    private SWTBotView console_view = null;

    public MavenConsoleBot() {
        while (console_view == null) {
            try {
                console_view = bot.viewById(CONSOLE_VIEW_ID);
                console_view.setFocus();
                boolean flag = consoleContainsText(FINISH_MARKER);
                while (!flag) {
                    flag = consoleContainsText(FINISH_MARKER);
                }
            } catch (WidgetNotFoundException e) {
                // wait
            }
        }
    }

    public boolean consoleContainsText ( String text ) {
        Widget consoleViewComposite = console_view.getWidget();
        StyledText console = bot.widget(WidgetMatcherFactory.widgetOfType(StyledText.class), consoleViewComposite);
        SWTBotStyledText styledText = new SWTBotStyledText(console);
        return styledText.getText().contains(text);
    }

    public String getConsoleText () {
        Widget consoleViewComposite = console_view.getWidget();
        StyledText console = bot.widget(WidgetMatcherFactory.widgetOfType(StyledText.class), consoleViewComposite);
        SWTBotStyledText styledText = new SWTBotStyledText(console);
        return styledText.getText();
    }
    
    public boolean isFinished() {
        return consoleContainsText(FINISH_MARKER);
    }

    public boolean isBuildFailed() {
        return consoleContainsText(BUILD_FAILURE_MARKER);
    }
}
