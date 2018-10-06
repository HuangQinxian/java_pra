1. 引入freemarker-2.3.28.jar

2. 语法
	单个字符串
		${field}
	
	list集合
		<#list fieldList as fi>
			${fi_index}    --	序号，从0开始
			${fi.id}
			${fi.name}
		</#list
	
	if...else
		<#if>
			情况1	
		<#else>
			情况2
		</#if>
	
	Date数据类型
		默认提供的解析方式：
			${myDate?date}		//2018年10月6日
			${myDate?time}		//下午2:18:45
			${myDate?datetime}	//2018年10月6日 下午2:18:45
		自定义解析格式：
			${myDate?string("yyyy/MM/dd")}
	
	null值得处理
		1. 给一个默认值：
			${myNul!} 等价于  ${myNull!""}
		2. 
	
	引入其他模板
		<#include "footer.ftl">