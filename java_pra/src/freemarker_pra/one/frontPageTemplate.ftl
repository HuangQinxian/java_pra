<html>
	<head>
		<style>
			div{
				margin-top:20px;
			}
			
			td{
				border:1px solid blue;
			}		
		</style>	
	</head>
	<body>
		1. 普通字符串
		<div>
			${name}
		</div>
		
		2. pojo对象解析
		<div>
			${student.id} - ${student.name} - ${student.address}
		</div>
		
		3. list集合遍历
		<div>
			<table>
				<tr>
					<td>编号</td>
					<td>姓名</td>
					<td>地址</td>
				</tr>
				<#list studentList as stu>
					<tr>
						<td>${stu.id}</td>
						<td>${stu.name}</td>
						<td>${stu.address}</td>
					</tr>
				</#list>
			</table>
		</div>
		
		4. Date数据类型
		<div>
			<p>
				date: ${myDate?date}
			</p>
			<p>
				time: ${myDate?time}
			</p>
			<p>
				datetime: ${myDate?datetime}
			</p>
			<p>
				自定义格式：${myDate?string("yyyy/MM/dd")}
			</p>
		</div>
		
		5. null值的处理
		<div>
			<p>值： ${myNull!} 等价于： ${myNull!""}</p>
			<p>${myNull!"myNull值为空"}</p>
		</div>
		
		6. 引入外部模板
		<#include "footer.ftl">
	</body>
</html>

