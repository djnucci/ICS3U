package nucci;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import hsa_new.Console;

public class Testing {

	//Make BufferedImage
	public static BufferedImage pic = null;

	public static void main(String[] args) {
		
		//make console
		Console log = new Console(50, 150);

		//try catch for errors
		try {
			//get photo
			pic = ImageIO.read(Testing.class.getResourceAsStream("/troll.jpg"));
		}
		//doesn't work, don't do
		catch (IOException e) {
			e.printStackTrace();
		}

		//make the image
		log.drawImage(pic, 0, 0, 200, 200, null);
		
	}

}
