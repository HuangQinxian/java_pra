package jdk7自动关闭流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/jdk7自动关闭流/a.txt")));BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("b.txt")))){
			String str = null;
			while((str=br.readLine())!=null){
				bw.write(str);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
