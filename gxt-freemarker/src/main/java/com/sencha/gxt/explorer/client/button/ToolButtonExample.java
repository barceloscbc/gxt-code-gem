/**
 * Sencha GXT 4.0.1 - Sencha for GWT
 * Copyright (c) 2006-2016, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Evaluation/Trial License
 * ================================================================================
 * This version of Sencha GXT is licensed commercially for a limited period for
 * evaluation purposes only. Production use or use beyond the applicable evaluation
 * period is prohibited under this license.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 *
 *
 *
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.sencha.gxt.explorer.client.button;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Padding;
import com.sencha.gxt.explorer.client.app.ui.ExampleContainer;
import com.sencha.gxt.explorer.client.app.ui.ExplorerShell;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.ToolButton;
import com.sencha.gxt.widget.core.client.container.MarginData;

@Detail(
    name = "Tool Buttons",
    category = "Button",
    icon = "toolbuttons",
    minHeight = ToolButtonExample.MIN_HEIGHT,
    minWidth = ToolButtonExample.MIN_WIDTH
)
public class ToolButtonExample implements IsWidget, EntryPoint {

  protected static final int MIN_HEIGHT = 100;
  protected static final int MIN_WIDTH = 510;

  private ContentPanel panel;

  public Widget asWidget() {
    if (panel == null) {
      ToolButton[] buttons = new ToolButton[] {
        new ToolButton(ToolButton.CLOSE),
        new ToolButton(ToolButton.MINIMIZE),
        new ToolButton(ToolButton.MAXIMIZE),
        new ToolButton(ToolButton.RESTORE),
        new ToolButton(ToolButton.GEAR),
        new ToolButton(ToolButton.PIN),
        new ToolButton(ToolButton.UNPIN),
        new ToolButton(ToolButton.RIGHT),
        new ToolButton(ToolButton.LEFT),
        new ToolButton(ToolButton.DOWN),
        new ToolButton(ToolButton.REFRESH),
        new ToolButton(ToolButton.MINUS),
        new ToolButton(ToolButton.PLUS),
        new ToolButton(ToolButton.QUESTION),
        new ToolButton(ToolButton.SEARCH),
        new ToolButton(ToolButton.SAVE),
        new ToolButton(ToolButton.PRINT)
      };

      panel = new ContentPanel();
      panel.setHeading("Tool Buttons");
      for (ToolButton toolButton : buttons) {
        panel.getHeader().addTool(toolButton);
        // space out the tool buttons for Triton theme
        if (ExplorerShell.Theme.TRITON.isActive()) {
          toolButton.getElement().setPadding(new Padding(0, 0, 0, 4));
        }
      }

      HTML text = new HTML("Tool Buttons are predefined icons normally added to Headers or Buttons.");
      text.getElement().getStyle().setOverflowY(Style.Overflow.AUTO);
      text.getElement().getStyle().setFontSize(13, Style.Unit.PX);
      panel.add(text, new MarginData(20));
    }

    return panel;
  }

  @Override
  public void onModuleLoad() {
    new ExampleContainer(this)
        .setMinHeight(MIN_HEIGHT)
        .setMinWidth(MIN_WIDTH)
        .doStandalone();
  }

}
