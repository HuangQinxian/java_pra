package 二维码.com.oliver.zxing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadCode {
	public static void main(String[] args) {
		try {
			MultiFormatReader reader = new MultiFormatReader();
			File file = new File("F:/code/img.png");
			BufferedImage bufferedImage = ImageIO.read(file);
			BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(bufferedImage)));
			
			//定义二维码的参数
			HashMap hints = new HashMap<>();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			
			Result result = reader.decode(binaryBitmap, hints);
			
			System.out.println("二维码的格式类型"+result.getBarcodeFormat());
			System.out.println("二维码的文本内容"+result.getText());
			System.out.println("二维码的解析结果"+result.toString());
		} catch (NotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
