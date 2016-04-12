package nucci;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import hsa_new.Console;

public class Testing {

	public static BufferedImage pic = null;

	public static void main(String[] args) {
		
		Console log = new Console(50, 150);

		try {
			pic = ImageIO.read(Testing.class.getResourceAsStream("/Wii U.jpg"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		log.drawImage(pic, 0, 0, 200, 200, null);
		
	}

}
