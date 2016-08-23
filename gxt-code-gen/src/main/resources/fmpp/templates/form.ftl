<#list forms as form>
<#assign pathClass = "."+form.package+"."+form.name?lower_case>
<@pp.changeOutputFile name=pathClass?replace(".","/")+"/Form"+form.name+".java" />
package ${form.package}.${form.name?lower_case};
<#list form.imports as import>
import  ${import};
</#list>
	  
public class Form${form.name} {

}
</#list>