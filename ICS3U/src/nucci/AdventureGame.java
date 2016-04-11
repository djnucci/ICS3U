package nucci;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import hsa_new.Console;

public class AdventureGame {

	public static ImageObserver ImgObs;
	public static Image Pic;

	public static void main(String[] args) throws InterruptedException {

		Console log = new Console(50, 150);

		//String[][] userInput = new String[2][10];
		//int gold;

		Toolkit tk = Toolkit.getDefaultToolkit();
		Pic = tk.getImage("12186061-a-wacky-cartoon-water-drop-character.jpg");
		log.drawImage(Pic, 10, 10, 50, 50, ImgObs);
		Thread.sleep(1000);
		log.close();
		
		/*
		 * log.println(
		 * "Run run run! You are a theif who has just stolen gold from a castle! You come across two paths. One leads to a desert, one leads to a forest. Which path do you take?"
		 * );
		 * 
		 * 
		 * userInput[0][0] = log.readLine();
		 * 
		 * if (userInput[0][0].equalsIgnoreCase("forest")) { log.println(
		 * "The gaurds chase you into the forest! You get to a clearing, and see a large tree. Do you hide in the tree or keep running?"
		 * );
		 * 
		 * userInput[0][1] = log.readLine();
		 * 
		 * if (userInput[0][1].equalsIgnoreCase("hide in trees")) { log.println(
		 * "You successfully climb the tree. The guards are confused, they look around trying to find a trail for you. You see some rocks up on the tree. Unsure of how they got there, you pick one up and take aim. You could throw the rock and knock the guards out, but there's only a 1/3 chance of success. Do you take the risk?"
		 * ); } else if (userInput[0][1].equalsIgnoreCase("keep running")) {
		 * log.println(
		 * "The guards catch up to you! They kill you. You are dead."); } } else
		 * if (userInput[0][0].equalsIgnoreCase("desert")) {
		 * 
		 * log.
		 */

	}

}
