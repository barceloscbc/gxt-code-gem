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
package com.sencha.gxt.explorer.client.layout;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.explorer.client.app.ui.ExampleContainer;
import com.sencha.gxt.explorer.client.app.ui.ExplorerShell.Theme;
import com.sencha.gxt.explorer.client.model.Example.Detail;

@Detail(
    name = "Horizontal Layout (UiBinder)",
    category = "Layouts",
    icon = "horizontallayoutuibinder",
    files = "HorizontalLayoutUiBinderExample.ui.xml",
    minHeight = HorizontalLayoutUiBinderExample.MIN_HEIGHT,
    minWidth = HorizontalLayoutUiBinderExample.MIN_WIDTH
)
public class HorizontalLayoutUiBinderExample implements IsWidget, EntryPoint {

  protected static final int MIN_HEIGHT = 150;
  protected static final int MIN_WIDTH = 480;

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  interface MyUiBinder extends UiBinder<Widget, HorizontalLayoutUiBinderExample> {
  }

  @UiField(provided = true)
  String borderStyle =  Theme.BLUE.isActive() || Theme.GRAY.isActive() ? ThemeStyles.get().style().border() : "noop";

  private Widget widget;

  @Override
  public Widget asWidget() {
    if (widget == null) {
      widget = uiBinder.createAndBindUi(this);
    }

    return widget;
  }

  @Override
  public void onModuleLoad() {
    new ExampleContainer(this)
        .setMinHeight(MIN_HEIGHT)
        .setMinWidth(MIN_WIDTH)
        .doStandalone();
  }

}
