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
package org.switchyard.tools.ui.editor.util;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NormalAnnotation;

/**
 * AST visitor to handle annotation tests.
 * @author bfitzpat
 *
 */
public class AnnotationVisitor extends ASTVisitor {

    private boolean _foundOne = false;
    private String _annotation = null;
    
    /**
     * @param annotation Name of annotation to search for
     */
    public AnnotationVisitor(String annotation) {
        _annotation = annotation;
    }

    @Override
    public boolean visit(NormalAnnotation annotation) {
        // Walk up AST until MethDecl or ClassDecl
        ASTNode parent = annotation.getParent();
        while (parent.getNodeType() != ASTNode.METHOD_DECLARATION && parent != null) {
            parent = parent.getParent();
        }
        if (parent != null) {
            Name typeName = annotation.getTypeName();
            if (parent != null) {
                if (typeName.isSimpleName() && typeName.toString().contentEquals(_annotation)) {
                    _foundOne = true;
                }
            }
        }
        return true;
    }

    /**
     * @return boolean flag - true if we found it
     */
    public boolean didFindOne() {
        return _foundOne;
    }
}
