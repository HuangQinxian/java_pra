package io_printwriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream(new File("src/io_printwriter/3_bak.jpg"));
		byte[] b = new byte[1024];
		FileInputStream fis = new FileInputStream("src/io_printwriter/3.jpg");
		int length = -1;
		while((length = fis.read(b))>0) {
			ps.write(b,0,length);
		}
		fis.close();
		ps.close();
	}
}
