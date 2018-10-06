package freemarker_pra.one;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerTest1 {
	
	@Test
	public void test1() throws Exception {
		//1、创建一个模板文件
		//2、创建一个Configuration对象
		Configuration configuration = new Configuration(Configuration.getVersion());
		//3、设置模板文件保存的目录
		configuration.setDirectoryForTemplateLoading(new File("/java_pra/java_pra/src/freemarker_pra/one/"));
		//4、模板文件的编码格式，一般就是utf-8
		configuration.setDefaultEncoding("utf-8");
		//5、加载一个模板文件，创建一个模板对象。
		Template template = configuration.getTemplate("frontPageTemplate.ftl");
		//6、创建一个数据集。可以是pojo也可以是map。推荐使用map
		Map data = new HashMap<>();
		//==  普通字符串
		data.put("name", "KimHiang");
		
		//==  pojo对象
		data.put("student", new Student(1,"one","广东"));
		
		//== List集合
		List<Student> list = new ArrayList();
		list.add( new Student(1,"one","广东"));
		list.add( new Student(2,"two","广东"));
		list.add( new Student(3,"three","广东"));
		data.put("studentList", list);
		
		//== Date集合
		data.put("myDate", new Date());
		
		//== null值得处理
		data.put("myNull", null);
		
		//== 引入其他得模板
		data.put("author","oliver");
		
		//7、创建一个Writer对象，指定输出文件的路径及文件名。
		Writer out = new FileWriter(new File("/java_pra/java_pra/src/freemarker_pra/one/frontPage.html"));
		//8、生成静态页面
		template.process(data, out);
		//9、关闭流
		out.close();
	}
}
