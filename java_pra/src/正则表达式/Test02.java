package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
	public static void main(String[] args) {
		Pattern compile = Pattern.compile("\\w{3}");
		Matcher matcher = compile.matcher("aaa222");
		boolean matches = matcher.matches();
		System.out.println(matches);
		while(matcher.find())
			System.out.println(matcher.group());
	}
}
