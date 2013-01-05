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
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Scrollable;
import org.eclipse.swt.widgets.Widget;

/**
 * TableColumnLayout
 * 
 * <p/>
 * Addresses issues with the Eclipse supplied TableColumnLayout class,
 * specifically computeSize() and computeTrim().
 */
public class TableColumnLayout extends org.eclipse.jface.layout.TableColumnLayout {

    private boolean _inupdateMode = false;
    private boolean _relayout = true;

    private Listener _resizeListener = new Listener() {

        public void handleEvent(Event event) {
            if (!_inupdateMode) {
                updateColumnData(event.widget);
            }
        }

    };

    /**
     * XXX: need to hook the listener as we don't have access to
     * super.inupdateMode.
     * 
     * @param column the column
     * @param data the data
     */
    @Override
    public void setColumnData(Widget column, ColumnLayoutData data) {
        if (column.getData(LAYOUT_DATA) == null) {
            column.addListener(SWT.Resize, _resizeListener);
        }

        column.setData(LAYOUT_DATA, data);
    }

    /**
     * copied from super.
     */
    private void layoutTableTree(final Scrollable scrollable, final int width, final Rectangle area,
            final boolean increase) {
        final int numberOfColumns = getColumnCount(scrollable);
        final int[] widths = new int[numberOfColumns];

        final int[] weightColumnIndices = new int[numberOfColumns];
        int numberOfWeightColumns = 0;

        int fixedWidth = 0;
        int totalWeight = 0;

        // First calc space occupied by fixed columns
        for (int i = 0; i < numberOfColumns; i++) {
            ColumnLayoutData col = getLayoutData(scrollable, i);
            if (col instanceof ColumnPixelData) {
                ColumnPixelData cpd = (ColumnPixelData) col;
                int pixels = cpd.width;
                if (cpd.addTrim) {
                    pixels += getColumnTrim();
                }
                widths[i] = pixels;
                fixedWidth += pixels;
            } else if (col instanceof ColumnWeightData) {
                ColumnWeightData cw = (ColumnWeightData) col;
                weightColumnIndices[numberOfWeightColumns] = i;
                numberOfWeightColumns++;
                totalWeight += cw.weight;
            } else {
                Assert.isTrue(false, "Unknown column layout data"); //$NON-NLS-1$
            }
        }

        boolean recalculate;
        do {
            recalculate = false;
            for (int i = 0; i < numberOfWeightColumns; i++) {
                int colIndex = weightColumnIndices[i];
                ColumnWeightData cw = (ColumnWeightData) getLayoutData(scrollable, colIndex);
                final int minWidth = cw.minimumWidth;
                final int allowedWidth = totalWeight == 0 ? 0 : (width - fixedWidth) * cw.weight / totalWeight;
                if (allowedWidth < minWidth) {
                    /*
                     * if the width assigned by weight is less than the minimum,
                     * then treat this column as fixed, remove it from weight
                     * calculations, and recalculate other weights.
                     */
                    numberOfWeightColumns--;
                    totalWeight -= cw.weight;
                    fixedWidth += minWidth;
                    widths[colIndex] = minWidth;
                    System.arraycopy(weightColumnIndices, i + 1, weightColumnIndices, i, numberOfWeightColumns - i);
                    recalculate = true;
                    break;
                }
                widths[colIndex] = allowedWidth;
            }
        } while (recalculate);

        if (increase) {
            scrollable.setSize(area.width, area.height);
        }

        _inupdateMode = true;
        setColumnWidths(scrollable, widths);
        scrollable.update();
        _inupdateMode = false;

        if (!increase) {
            scrollable.setSize(area.width, area.height);
        }
    }

    /**
     * XXX: if wHint is specified, returns Math.max(wHint,
     * sum(minimumColumnWidth)), otherwise returns sum(minimumColumnWidth).
     */
    @Override
    protected Point computeSize(Composite composite, int wHint, int hHint, boolean flushCache) {
        Scrollable scrollable = getScrollable(composite);
        Point result = scrollable.computeSize(wHint, hHint);
        if (wHint != SWT.DEFAULT) {
            result.x = wHint;
        }
        if (hHint != SWT.DEFAULT) {
            result.y = hHint;
        }

        int width = 0;
        int size = getColumnCount(scrollable);
        for (int i = 0; i < size; ++i) {
            ColumnLayoutData layoutData = getLayoutData(scrollable, i);
            if (layoutData instanceof ColumnPixelData) {
                ColumnPixelData col = (ColumnPixelData) layoutData;
                width += col.width;
                if (col.addTrim) {
                    width += getColumnTrim();
                }
            } else if (layoutData instanceof ColumnWeightData) {
                ColumnWeightData col = (ColumnWeightData) layoutData;
                width += col.minimumWidth;
            } else {
                Assert.isTrue(false, "Unknown column layout data"); //$NON-NLS-1$
            }
        }
        if (width > result.x || wHint == SWT.DEFAULT) {
            result.x = width;
        }

        return result;
    }

    /**
     * copied from super.
     */
    @Override
    protected void layout(Composite composite, boolean flushCache) {
        Rectangle area = composite.getClientArea();
        Scrollable table = getScrollable(composite);
        int tableWidth = table.getSize().x;
        int trim = computeTrim(area, table, tableWidth);
        int width = Math.max(0, area.width - trim);

        if (width > 1) {
            layoutTableTree(table, width, area, tableWidth < area.width);
        }

        // For the first time we need to _relayout because Scrollbars are not
        // calculate appropriately
        if (_relayout) {
            _relayout = false;
            composite.layout();
        }
    }

    /**
     * XXX: return the trim width from the scrollable (table)
     */
    private int computeTrim(Rectangle area, Scrollable scrollable, int currentWidth) {
        return scrollable.computeTrim(0, 0, 0, 0).width;
    }

    /**
     * copied from super.getControl().
     */
    private Scrollable getScrollable(Composite composite) {
        return (Scrollable) composite.getChildren()[0];
    }

}
