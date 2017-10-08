package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("((\\(\\d{3}\\))|(\\d{3}))\\-\\d{3}\\-\\d{6}");
		Matcher matcher = p.matcher("(020)-522-106053");
		boolean matches = matcher.matches();
		System.out.println(matches);
	}
}
