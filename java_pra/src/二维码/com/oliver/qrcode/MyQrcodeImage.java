package 二维码.com.oliver.qrcode;

import java.awt.image.BufferedImage;

import jp.sourceforge.qrcode.data.QRCodeImage;

public class MyQrcodeImage implements QRCodeImage{

	BufferedImage bufferedImage;
	
	public MyQrcodeImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}
	
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return bufferedImage.getHeight();
	}

	@Override
	public int getPixel(int arg0, int arg1) {
		return bufferedImage.getRGB(arg0, arg1);
	}

	@Override
	public int getWidth() {
		return bufferedImage.getWidth();
	}

}
