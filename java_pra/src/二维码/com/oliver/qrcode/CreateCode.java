package 二维码.com.oliver.qrcode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;


public class CreateCode {
	public static void main(String[] args) throws IOException {
		Qrcode x = new Qrcode();
		x.setQrcodeErrorCorrect('M'); //纠错等级
		x.setQrcodeEncodeMode('B');	//N代表数字，A代表a-Z,B代表其它字符
		
		int version = 7;
		
		x.setQrcodeVersion(version);//版本
		String qrData = "https://huangqinxian.github.io/search/";
		
		//宽高有固定的公式
		int width = 67+12*(version - 1);
		int height = 67+12*(version - 1);
		
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		Graphics2D graphics = bufferedImage.createGraphics();
		graphics.setBackground(Color.WHITE);
		graphics.setColor(Color.BLACK);

		graphics.clearRect(0, 0, width, height);
		
		int pixoff = 2; //偏移量
		
		byte[] d = qrData.getBytes("gb2312");
		if(d.length > 0 && d.length < 120){
			boolean[][] s = x.calQrcode(d);
			for(int i = 0 ; i < s.length; i++){
				for(int j = 0; j < s.length; j++){
					if(s[j][i]){
						graphics.fillRect(j*3+pixoff,i*3+pixoff,3,3);
					}
				}
			}
		}
		
		graphics.dispose();
		bufferedImage.flush();
		
		ImageIO.write(bufferedImage,"png", new File("F:/code/img2.png"));
		
		System.out.println("success");
	}
}

