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

import java.util.Collection;

import junit.framework.Assert;

import org.eclipse.core.resources.IProject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotMultiPageEditor;
import org.eclipse.swtbot.eclipse.gef.finder.SWTGefBot;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.results.Result;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotCTabItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

/**
 *  Find and operate on the SwitchYard editor.
 */
public class SYEditorBot {

    private static final int DELAY = 1000;
    private static SWTGefBot bot = new SWTGefBot();
    private SWTBotGefEditor editor;
    
    public SYEditorBot() {
        editor = bot.gefEditor("switchyard.xml");
        bot.activeEditor();
    }
    
    public void closeEditor() {
        if (editor != null) {
            editor.close();
        }
    }
    
    public void getToolComponent( String component ) {
        editor.activateTool(component);
        Assert.assertEquals(component, getActiveToolLabel());
    }
    
    public void autoLayoutDiagram() {
        findShapeWithClassAndClickMenu(Composite.class, "Auto-layout Diagram");
    }

    protected IPeService getPeService() {
        return Graphiti.getPeService();
    }

    public Shape findShapeForEClass(Class<?> clazz) {
        IPeService peService = getPeService();
        final DiagramEditor diagramEditorLocal = getDiagramEditor();
        final IDiagramTypeProvider diagramTypeProvider = diagramEditorLocal.getDiagramTypeProvider();
        final Diagram currentDiagram = diagramTypeProvider.getDiagram();
        Collection<Shape> allShapes = peService.getAllContainedShapes(currentDiagram);
        for (Shape shape : allShapes) {
            if (shape instanceof ContainerShape) {
                Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(shape);
                if (clazz.isInstance(bo)) {
                    return shape;
                }
            }
        }
        return null;
    }

    public void findShapeWithClassAndClickMenu(final Class<?> clazz, String menuLabel) {
        final DiagramEditor diagramEditorLocal = getDiagramEditor();
        UIThreadRunnable.syncExec(new VoidResult() {
            public void run() {
                Shape shape = findShapeForEClass(clazz);
                if (shape != null) {
                    diagramEditorLocal.selectPictogramElements(
                            new PictogramElement[] {shape.getLink().getPictogramElement()});
                }
            }
        });
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editor.clickContextMenu(menuLabel);
    }
    
    public Object getBOforPE( final PictogramElement pe) {
        final DiagramEditor diagramEditorLocal = getDiagramEditor();
        Object bo = UIThreadRunnable.syncExec(new Result<Object>() {
            public Object run() {
                IDiagramTypeProvider diagramTypeProvider = diagramEditorLocal.getDiagramTypeProvider();
                final IFeatureProvider fp = diagramTypeProvider.getFeatureProvider();
                return fp.getBusinessObjectForPictogramElement(pe);
            }
        });
        return bo;
    }
    
    public Diagram getDiagram() {
        UIThreadRunnable.syncExec(new Result<Diagram>() {

            @Override
            public Diagram run() {
                GraphicalViewer gv = getViewer(editor);
                RootEditPart root = gv.getRootEditPart().getRoot();
                if (root instanceof GraphicalEditPart) { 
                    EditPart part = editor.mainEditPart().part();                    
                    Object object = part.getModel();
                    if (object instanceof Diagram) {
                        final Diagram diagram = (Diagram) object;
                        return diagram;
                    }
                    return null;
                }
                else {
                    throw new WidgetNotFoundException("Can't get root diagram");
                }
            }
        });
        return null;
    }

    /**
     * Returns graphical viewer from editor
     */
    public GraphicalViewer getViewer(final SWTBotGefEditor editor) 
    {
        GraphicalViewer graphicalViewer = UIThreadRunnable.syncExec(new Result<GraphicalViewer>() {
            public GraphicalViewer run() {
                IEditorReference partReference = editor.getReference();
                final IEditorPart editor = partReference.getEditor(true);
                return (GraphicalViewer) editor.getAdapter(GraphicalViewer.class);
            }
        });
                
        return graphicalViewer;
    }

    public void saveCurrentEditor() throws Exception {
        bot.menu("File").menu("Save").click();
    }

    public DiagramEditor getDiagramEditor() {
        DiagramEditor ret = UIThreadRunnable.syncExec(new Result<DiagramEditor>() {
            @Override
            public DiagramEditor run() {
                SWTBotMultiPageEditor multi = new SWTBotMultiPageEditor(editor.getReference(), 
                        bot);
                SWTBotCTabItem designtab = multi.activatePage("Design");
                if (designtab != null) {
                    DiagramEditor dEditor = (DiagramEditor) designtab.widget.getData();
                    if (dEditor != null) {
                        return dEditor;
                    }
                }
                return null;
            }
        });
        return ret;
    }
    
    public String getActiveToolLabel() {
        return editor.getActiveTool().getLabel();
    }
    
    public SWTBotCTabItem getEditorPage ( String title) {
        SWTBotMultiPageEditor multi = new SWTBotMultiPageEditor(editor.getReference(), 
                bot);
        SWTBotCTabItem tab = multi.activatePage(title);
        Assert.assertNotNull("Can't find " + title + " tab", tab);
        return tab;
    }

    public IProject getProjectForOpenFile() {
        final SWTBotGefEditor diagramEditorLocal = editor;
        IProject project = UIThreadRunnable.syncExec(new Result<IProject>() {
            public IProject run() {
                Object editorInput;
                try {
                    editorInput = diagramEditorLocal.getReference().getEditorInput();
                    if (editorInput instanceof IFileEditorInput) {
                        IFileEditorInput input = (IFileEditorInput) editorInput;
                        return input.getFile().getProject();
                    }
                } catch (PartInitException e) {
                    e.printStackTrace();
                }
                return null;
            }
        });
        return project;
    }
}
