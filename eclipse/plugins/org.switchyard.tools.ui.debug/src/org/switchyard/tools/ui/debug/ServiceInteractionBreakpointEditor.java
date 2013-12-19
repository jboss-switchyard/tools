/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.debug;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.internal.debug.ui.breakpoints.AbstractJavaBreakpointEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.AspectType;
import org.switchyard.tools.ui.debug.IInteractionConfiguration.TriggerType;

/**
 * ServiceInteractionBreakpointEditor
 * <p/>
 * Editor for Service Interaction breakpoints.
 */
@SuppressWarnings("restriction")
public class ServiceInteractionBreakpointEditor extends AbstractJavaBreakpointEditor {

    /** The property ID for triggers. */
    public static final int TRIGGER_PROP = 1;
    /** The property ID for aspects. */
    public static final int ASPECT_PROP = 2;

    private DelegatingJavaBreakpoint<?> _breakpoint;
    private Button _inButton;
    private Button _outButton;
    private Button _faultButton;
    private List<Button> _aspectButtons;
    private Set<AspectType> _aspects;
    private Set<TriggerType> _triggers;
    private boolean _updating;

    @Override
    public Control createControl(Composite parent) {
        final ScrolledComposite scrollable = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
        scrollable.setLayout(new GridLayout());
        scrollable.setLayoutData(new GridData(GridData.FILL_BOTH));

        final Composite content = new Composite(scrollable, SWT.NONE);
        content.setLayout(new GridLayout());
        content.setLayoutData(new GridData(GridData.FILL_BOTH));
        content.setBackground(parent.getBackground());
        content.setBackgroundMode(SWT.INHERIT_DEFAULT);

        final Group phaseGroup = new Group(content, SWT.NONE);
        phaseGroup.setLayout(new GridLayout(3, false));
        phaseGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        phaseGroup.setText("Triggering phase");

        _inButton = new Button(phaseGroup, SWT.CHECK);
        _inButton.setText("IN");
        _inButton.addSelectionListener(new TriggerSelectionListener(TriggerType.IN));

        _outButton = new Button(phaseGroup, SWT.CHECK);
        _outButton.setText("OUT");
        _outButton.addSelectionListener(new TriggerSelectionListener(TriggerType.OUT));

        _faultButton = new Button(phaseGroup, SWT.CHECK);
        _faultButton.setText("FAULT");
        _faultButton.addSelectionListener(new TriggerSelectionListener(TriggerType.FAULT));

        final Group aspectsGroup = new Group(content, SWT.NONE);
        aspectsGroup.setLayout(new GridLayout(3, false));
        aspectsGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        aspectsGroup.setText("Trigger on");

        final SelectionListener aspectSelectionListener = new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                if (_updating) {
                    return;
                }

                final AspectType aspect = (AspectType) event.widget.getData(AspectType.class.getCanonicalName());
                if (((Button) event.widget).getSelection()) {
                    _aspects.add(aspect);
                } else {
                    _aspects.remove(aspect);
                }
                setDirty(ASPECT_PROP);
            }
        };

        _aspectButtons = new ArrayList<Button>(AspectType.values().length);
        for (AspectType aspect : AspectType.values()) {
            final Button button = new Button(aspectsGroup, SWT.CHECK);
            button.setData(AspectType.class.getCanonicalName(), aspect);
            button.setText(aspect.toString());
            button.addSelectionListener(aspectSelectionListener);
            _aspectButtons.add(button);
        }

        scrollable.setContent(content);
        content.setSize(content.computeSize(SWT.DEFAULT, SWT.DEFAULT));

        return scrollable;
    }

    @Override
    public void setFocus() {
    }

    @Override
    public IStatus getStatus() {
        if (_inButton.getSelection() || _outButton.getSelection() || _faultButton.getSelection()) {
            return Status.OK_STATUS;
        }
        return new Status(Status.ERROR, Activator.PLUGIN_ID, "Must select at least one trigger (IN, OUT or FAULT).");
    }

    @Override
    public Object getInput() {
        return _breakpoint;
    }

    @Override
    public void setInput(Object breakpoint) throws CoreException {
        _updating = true;
        try {
            if (breakpoint instanceof DelegatingJavaBreakpoint) {
                _breakpoint = (DelegatingJavaBreakpoint<?>) breakpoint;
            } else {
                breakpoint = null;
            }
            initialize();
        } finally {
            _updating = false;
        }
    }

    @Override
    public void doSave() throws CoreException {
        if (_breakpoint != null) {
            InteractionConfigurationBuilder builder = InteractionConfigurationBuilder.createFrom(_breakpoint
                    .getInteractionConfiguration());
            builder.triggers(_triggers.isEmpty() ? null : EnumSet.copyOf(_triggers));
            builder.aspects(_aspects.isEmpty() ? null : EnumSet.copyOf(_aspects));
            _breakpoint.setInteractionConfiguration(builder.build());
        }
        setDirty(false);
    }

    private void initialize() {
        if (_breakpoint == null) {
            _inButton.setEnabled(false);
            _inButton.setSelection(false);

            _outButton.setEnabled(false);
            _outButton.setSelection(false);

            _faultButton.setEnabled(false);
            _faultButton.setSelection(false);
        } else {
            final IInteractionConfiguration config = _breakpoint.getInteractionConfiguration();

            _triggers = config == null ? EnumSet.allOf(TriggerType.class) : config.getTriggers();
            if (_triggers == null || _triggers.isEmpty()) {
                _triggers = EnumSet.allOf(TriggerType.class);
            } else {
                _triggers = EnumSet.copyOf(_triggers);
            }

            _aspects = config == null ? EnumSet.allOf(AspectType.class) : config.getAspects();
            if (_aspects == null || _aspects.isEmpty()) {
                _aspects = EnumSet.allOf(AspectType.class);
            } else {
                _aspects = EnumSet.copyOf(_aspects);
            }

            _inButton.setEnabled(true);
            _inButton.setSelection(_triggers.contains(TriggerType.IN));

            _outButton.setEnabled(true);
            _outButton.setSelection(_triggers.contains(TriggerType.OUT));

            _faultButton.setSelection(_triggers.contains(TriggerType.FAULT));

            for (Button button : _aspectButtons) {
                final AspectType aspect = (AspectType) button.getData(AspectType.class.getCanonicalName());
                button.setSelection(_aspects.contains(aspect));
            }

            updateEnablement();
        }
        setDirty(false);
    }

    private void updateEnablement() {
        _faultButton.setEnabled(!_outButton.getSelection());
        for (Button button : _aspectButtons) {
            final AspectType aspect = (AspectType) button.getData(AspectType.class.getCanonicalName());
            button.setEnabled(aspect.shouldEnable(_triggers));
        }
    }

    private final class TriggerSelectionListener extends SelectionAdapter {
        private final TriggerType _trigger;

        private TriggerSelectionListener(final TriggerType trigger) {
            _trigger = trigger;
        }

        @Override
        public void widgetSelected(SelectionEvent event) {
            if (_updating) {
                return;
            }

            if (((Button) event.widget).getSelection()) {
                _triggers.add(_trigger);
            } else {
                _triggers.remove(_trigger);
            }
            updateEnablement();
            setDirty(TRIGGER_PROP);
        }
    }
}
