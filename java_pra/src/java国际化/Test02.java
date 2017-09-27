package java国际化;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test02 {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault(Locale.Category.FORMAT);  //直接获取系统默认语言环境
		System.out.println(locale);  //zh_CN
		
		Locale locale2 = new Locale("en_US");
		
		//语言文件放在src根目录下
		ResourceBundle bundle = ResourceBundle.getBundle("language",locale2);
		
		System.out.println(bundle.getString("hello"));
	}
}
