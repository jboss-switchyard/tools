package org.switchyard.tools.ui.editor.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.OpenFileAction;

/**
 * @author bfitzpat
 * 
 */
public final class OpenFileUtil {
    
    private OpenFileUtil(){
        // empty
    }

    /**
     * opens the file.
     * @param resource Resource to open
     */
    public static void openFile(final IResource resource) {
        IWorkbench wb = PlatformUI.getWorkbench();
        IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
        IWorkbenchPage page = win.getActivePage();
        OpenFileAction openFileAction = new OpenFileAction(page) {
            @SuppressWarnings("rawtypes")
            @Override
            protected List getSelectedResources() {
                ArrayList<IResource> list = new ArrayList<IResource>();
                list.add(resource);
                return list;
            }
        };
        openFileAction.run();
    }
}
