package 正则表达式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {
	public static void main(String[] args) throws IOException{
		String myurl = "https://www.baidu.com/s?wd=taylor%20swift%20mp3&pn=10&oq=taylor%20swift%20mp3&ie=utf-8&usm=2&rsv_pq=ff8b39520001286a&rsv_t=f7c7DNfpm61ToQk%2Bw4RXxlLaFp2pPMwXtamUyuPKaINlKAKc2PLnnctnQXk";
		URL url = new URL(myurl);
		URLConnection conn = url.openConnection();
		String userAgent = "Mozilla/5.0 (Windows NT 5.1; rv:13.0) Gecko/20100101 Firefox/13.0";
		conn.addRequestProperty("User-Agent", userAgent);
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String str = null;
		StringBuffer sb = new StringBuffer();
		while((str = br.readLine())!=null){
			sb.append(str);
		}
		String fetchResult = sb.toString();
		br.close();
		
		String[] split = fetchResult.split("<div\\sclass=\"result\\sc-container\\s\"");
		if(split.length > 0){
			//匹配每个搜索结果的标题
			Pattern h3Complie = Pattern.compile("<a.*?</a>");
			//匹配每个搜索结果的概述
			Pattern divCompile = Pattern.compile("<div\\sclass=\"c-abstract\">.*?</div>");
			for(int i = 1; i < split.length; i++){
				Matcher matcher = h3Complie.matcher(split[i]);
				if(matcher.find())
					System.out.println(matcher.group());
				
				Matcher matcher2 = divCompile.matcher(split[i]);
				if(matcher2.find())
					System.out.println(matcher2.group());
			}
		}
	}
}
