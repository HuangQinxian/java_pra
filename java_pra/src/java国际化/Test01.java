package java国际化;

import java.util.Locale;

//获取   国家的代号   和     相应的语言代号 
public class Test01 {
	public static void main(String[] args) {
		Locale[] availableLocales = Locale.getAvailableLocales();
		for(int i = 0; i < availableLocales.length; i++){
			System.out.println(availableLocales[i].getDisplayCountry()+"="+availableLocales[i].getCountry()+"   "+availableLocales[i].getDisplayLanguage()+"="+availableLocales[i].getLanguage());
		}
	}
}
