package nucci;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import hsa_new.Console;

public class Testing {

	public static ImageObserver ImgObs;
	public static Image pic;

	public static void main(String[] args) {

		Console log = new Console(50, 150);
		Toolkit tk = Toolkit.getDefaultToolkit();

		pic = tk.getImage("Wii U.jpg");

		//log.prepareImage(Pic, 10, 10, ImgObs);
		
		log.drawImage(pic, 10, 10, 100, 100, ImgObs);
		
	}

}
