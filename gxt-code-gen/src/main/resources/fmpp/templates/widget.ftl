<#list forms as form>
<#assign pathClass = "."+form.package+"."+form.name?lower_case>
<@pp.changeOutputFile name=pathClass?replace(".","/")+"/Form"+form.name+"Widget.java" />
package ${form.package}.${form.name?lower_case};

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutData;
import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer.VBoxLayoutAlign;

public class Form${form.name}Widget implements IsWidget{
	private VBoxLayoutContainer widget;
	@Override
	public Widget asWidget() {
		if (widget == null) {
			BoxLayoutData flex = new BoxLayoutData(new Margins(0, 0, 20, 0));
			flex.setFlex(1);
			widget = new VBoxLayoutContainer(VBoxLayoutAlign.STRETCH);
			widget.add(new Form${form.name}());
		}
		return widget;
	}
}
</#list>