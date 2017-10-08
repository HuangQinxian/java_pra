package 二维码.com.oliver.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import jp.sourceforge.qrcode.QRCodeDecoder;

public class ReadCode {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/code/img2.png");
		
		BufferedImage bufferedImage = ImageIO.read(file);
		
		QRCodeDecoder codeDecoder = new QRCodeDecoder();
		
		String result = new String(codeDecoder.decode(new MyQrcodeImage(bufferedImage)),"gb2312");
		
		System.out.println(result);
	}
}
