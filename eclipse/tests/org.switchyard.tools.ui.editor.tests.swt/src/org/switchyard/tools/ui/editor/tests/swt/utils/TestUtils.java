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
package org.switchyard.tools.ui.editor.tests.swt.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.results.WidgetResult;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;

/**
 *  Various helper utilities for the tests.
 */
public final class TestUtils {
    
    private static final String WELCOME_TITLE = "Welcome";

    public static void closeWelcomePage(SWTWorkbenchBot bot) {
        try {
            bot.viewByTitle(WELCOME_TITLE).close();
        } catch (WidgetNotFoundException e) {
            // do nothing
        }
    }

    public static SWTBotMenu getSubMenuItem(final SWTBotMenu parentMenu, 
            final String itemText)
                    throws WidgetNotFoundException {

        MenuItem menuItem = UIThreadRunnable.syncExec(new WidgetResult<MenuItem>() {
            public MenuItem run() {
                Menu bar = parentMenu.widget.getMenu();
                if (bar != null) {
                    for (MenuItem item : bar.getItems()) {
                        System.out.println("Menu: " + item.getText());
                        if (item.getText().contains(itemText)) {
                            return item;
                        }
                    }
                }
                return null;
            }
        });

        if (menuItem == null) {
            throw new WidgetNotFoundException("MenuItem \"" + itemText + "\" not found.");
        } else {
            return new SWTBotMenu(menuItem);
        }
    }    

    public static void loadJavaFile (final IProject project, String folderPath, 
            String packageName, String existFileName, 
            String testDataFileName) throws CoreException {
        // folderPath = "src/main/java"
        // existFileName = "TestService.java"
        // testDataFileName = "test-data/source/TestService.java"
        
        // get the file from the project
        IFile testFile = project.getFolder(folderPath)
                .getFolder(packageName.replace('.', '/'))
                .getFile(existFileName);
        
        if (testFile.exists()) {
            testFile.delete(true, new NullProgressMonitor());
        }
        // fill the file
        testFile.create(
                TestUtils.class.getClassLoader().getResourceAsStream(
                        testDataFileName), true, new NullProgressMonitor());
    }

    public static void loadResourceFile (final IProject project, String folderPath, 
            String existFileName, String testDataFileName) throws CoreException {
        // folderPath = "src/main/java"
        // existFileName = "TestService.java"
        // testDataFileName = "test-data/source/TestService.java"
        
        // get the file from the project
        IFile testFile = project.getFolder(folderPath)
                .getFile(existFileName);
        
        if (testFile.exists()) {
            testFile.delete(true, new NullProgressMonitor());
        }
        // fill the file
        testFile.create(
                TestUtils.class.getClassLoader().getResourceAsStream(
                        testDataFileName), true, new NullProgressMonitor());

    }
    
    public static void rebuildProject(final IProject project) throws CoreException {
        // the project needs to be built
        project.build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
    }
    
    public static void refreshProject(final IProject project) throws CoreException {
        project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
        waitForBuildsToFinish();
    }
    
    public static void waitForBuildsToFinish() {
        // wait until the build command has been finished.
        try {
            ResourcesPlugin.getWorkspace().run(new IWorkspaceRunnable() {
                public void run(IProgressMonitor monitor) throws CoreException {
                    // nothing to do!
                }
            }, new NullProgressMonitor());
        } catch (CoreException e) {
            e.printStackTrace();
        }  
    }
}
