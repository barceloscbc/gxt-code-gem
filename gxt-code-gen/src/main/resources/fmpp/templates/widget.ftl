<#list forms as form>
<#assign pathClass = "."+form.package+"."+form.name?lower_case>
<@pp.changeOutputFile name=pathClass?replace(".","/")+"/Form"+form.name+"Widget.java" />
package ${form.package}.${form.name?lower_case};

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
	  
public class Form${form.name}Widget implements IsWidget{
	
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return null;
	}
}
</#list>