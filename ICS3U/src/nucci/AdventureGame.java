package nucci;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

//while(!Toolkit.getDefaultToolkit().prepareImage(img1,img1.getWidth(null),img1.getHeight(null),null)));
//where img1 is the variable name of the image you want to load
import hsa_new.Console;

public class AdventureGame {
	
	public static BufferedImage bridgePic 						= null;
	public static BufferedImage camelPic 						= null;
	public static BufferedImage castlePic 						= null;
	public static BufferedImage desertPic 						= null;
	public static BufferedImage forestPathPic					= null;
	public static BufferedImage forestPic 						= null;
	public static BufferedImage goldPic 						= null;
	public static BufferedImage homePic							= null;
	public static BufferedImage loadingBar100					= null;
	public static BufferedImage loadingBar75					= null;
	public static BufferedImage loadingBar50					= null;
	public static BufferedImage loadingBar25					= null;
	public static BufferedImage moreGuardsPic					= null;
	public static BufferedImage moreDesertPic 					= null;
	public static BufferedImage mummyPic 						= null;
	public static BufferedImage playerPic 						= null;
	public static BufferedImage princessPic 					= null;
	public static BufferedImage pyramidHallwayPic 				= null;
	public static BufferedImage pyramidPic 						= null;
	public static BufferedImage skeletonArmyPic 				= null;
	public static BufferedImage swordPic 						= null;
	public static BufferedImage thronePic 						= null;
	public static BufferedImage trollPic 						= null;
	public static BufferedImage tunnelPic 						= null;
	public static BufferedImage yellowBrickRoadPic 				= null;
	public static BufferedImage yellowBrickRoadWithFriendsPic 	= null;

	public static void main(String[] args) throws InterruptedException {

		Console log = new Console(50, 150);
		log.setTextColour(Color.GREEN);
		log.setTextBackgroundColor(Color.BLACK);
		log.println("Please wait...");
		
		try{
			loadingBar25 = ImageIO.read(Testing.class.getResourceAsStream("/Loading Bar 25%.jpg"));
			loadingBar50 = ImageIO.read(Testing.class.getResourceAsStream("/Loading Bar 50%.jpg"));
			loadingBar75 = ImageIO.read(Testing.class.getResourceAsStream("/Loading Bar 75%.jpg"));	
			loadingBar100 = ImageIO.read(Testing.class.getResourceAsStream("/Loading Bar 100%.jpg"));
			bridgePic = ImageIO.read(Testing.class.getResourceAsStream("/bridge.jpg"));
			camelPic = ImageIO.read(Testing.class.getResourceAsStream("/camel.jpg"));
			castlePic = ImageIO.read(Testing.class.getResourceAsStream("/castle.jpg"));
			desertPic = ImageIO.read(Testing.class.getResourceAsStream("/desert.jpg"));
			log.drawImage(loadingBar25, 0, 0, 500, 500, null);
			forestPathPic = ImageIO.read(Testing.class.getResourceAsStream("/Forest Path.jpg"));
			forestPic = ImageIO.read(Testing.class.getResourceAsStream("/Forest.jpg"));
			goldPic = ImageIO.read(Testing.class.getResourceAsStream("/gold.jpg"));
			homePic = ImageIO.read(Testing.class.getResourceAsStream("/home.jpg"));
			moreGuardsPic = ImageIO.read(Testing.class.getResourceAsStream("/more guards.jpg"));
			moreDesertPic = ImageIO.read(Testing.class.getResourceAsStream("/more desert.jpg"));
			mummyPic = ImageIO.read(Testing.class.getResourceAsStream("/mummy.jpg"));
			log.drawImage(loadingBar50, 0, 0, 500, 500, null);
			playerPic = ImageIO.read(Testing.class.getResourceAsStream("/player.jpg"));
			princessPic = ImageIO.read(Testing.class.getResourceAsStream("/princess.jpg"));	
			pyramidHallwayPic = ImageIO.read(Testing.class.getResourceAsStream("/pyramid hallway.jpg"));
			pyramidPic = ImageIO.read(Testing.class.getResourceAsStream("/pyramid.jpg"));		
			skeletonArmyPic = ImageIO.read(Testing.class.getResourceAsStream("/skeleton army.jpg"));		
			swordPic = ImageIO.read(Testing.class.getResourceAsStream("/sword.jpg"));		
			thronePic = ImageIO.read(Testing.class.getResourceAsStream("/throne.jpg"));	
			log.drawImage(loadingBar75, 0, 0, 500, 500, null);
			trollPic = ImageIO.read(Testing.class.getResourceAsStream("/troll.jpg"));		
			tunnelPic = ImageIO.read(Testing.class.getResourceAsStream("/tunnel.jpg"));
			yellowBrickRoadPic = ImageIO.read(Testing.class.getResourceAsStream("/yellow brick road.jpg"));
			yellowBrickRoadWithFriendsPic = ImageIO.read(Testing.class.getResourceAsStream("/Yellow_Brick_Road and friends.jpg"));
			log.drawImage(loadingBar100, 0, 0, 500, 500, null);
		
		}catch(IOException e){
			e.printStackTrace();
		}

		String[][] userInput = new String[2][10];
		int gold = 25;
		boolean sword;
		String riddle;
		int triesTroll = 2;
		boolean death = false;
		boolean playAgain = true;
		String replay;
		String userGuess;
		int triesMummy = 3;
		boolean error;

		
		while (playAgain == true) {
			for (int i = 0; i < 10; i++){
				userInput[0][i] = null;
				userInput[1][i] = null;
			}
			log.clear();
			log.drawImage(tunnelPic, 0, 0, 750, 750, null);
			log.println("Run run run! You are a thief who has just stolen gold from a castle!");
			log.println("You come across two paths. One leads to a desert, one leads to a forest.");
			log.println("Which path do you take? (forest/desert)");
			userInput[0][0] = log.readLine();
			log.clear();

			do{
			if (userInput[0][0].equalsIgnoreCase("forest")) {
				log.println(
						"The gaurds chase you into the forest! You get to a clearing, and see a large tree. Do you hide in the tree or keep running? (hide in tree/keep running");

				userInput[0][1] = log.readLine();
				log.clear();
				if (userInput[0][1].equalsIgnoreCase("hide in tree")) {
					log.println(
							"You successfully climb the tree. The guards are confused, they look around trying to find a trail for you. You see some rocks up on the tree. Unsure of how they got there, you pick one up and take aim. You could throw the rock and knock the guards out, but there's only a 1/3 chance of success. Do you take the risk?");
					userInput[0][2] = log.readLine();
					log.clear();
					if (userInput[0][2].equalsIgnoreCase("Yes")) {
						int chance = (int) (Math.random() * 3);
						if (chance == 0 || chance == 1) {
							log.println("You miss, the guards spot you and kill you. You are dead.");
							death = true;

						} else {
							log.println(
									"You hit the guards and kill them. You climb down and steal some of their gold, along with a sword as a weapon");
							sword = true;

						}
					}

					log.println(
							"You come across a cross roads. One path leads to a bridge, the other goes to a yellow brick road. Where would you like to go?(bridge/yellow brick road)");
					userInput[0][3] = log.readLine();
					log.clear();
					if (userInput[0][3].equalsIgnoreCase("the bridge") && death == false) {
						log.println(
								"As you are beggening to cross, a troll blocks your path!You tell the troll that you wish to pass, and he says he'll let you if you can get his riddle right in three guess's. The riddle is: What gets wetter as it drys?");
						for (int i = 2; i != 0; i--) {
							riddle = log.readLine();
							if (riddle.equalsIgnoreCase("towel") && i == 3) {
								log.println("The troll says 'that is correct, you may procced!'");
								i = 0;

							} else if (riddle.equalsIgnoreCase("towel")) {
								log.println(
										"The trool says 'correct, but you didnt get it on the first try! I know I said I'd give you 3 tries, but i lied.' The troll eats you, you are dead.");
							} else if (!riddle.equals("towel")) {
								log.println("The troll says 'wrong, try again.' You have " + i + " guesses left");
								triesTroll--;
							}
							log.clear();

						}
						if (triesTroll == 0) {
							log.println(
									"The troll says 'Sorry, you're out of tries. I'm gonna eat you now.' You turn around and try to run, but see 3 guards approching. The troll notices them, looks at you and says 'dont move.' The troll lunges himself at the guards, but before you get a chance to run, the troll kills a gaurd and throws him at you. The two other gaurds kill the troll, and start approching you.");
							if (sword = true) {
								log.println(
										"You pull out the sword you found earlier, and charge at the guards. Useing your agility, you manage to kill both of them. You steal their gold and cross the bridge, seeing your house in the distance.");
							} else {
								log.println("With nothing to defend yourself, the guards kill you. You are dead.");
							}
							log.clear();
						}
					} else if (userInput[0][3].equalsIgnoreCase("yellow brick road") && death == false) {
						log.println(
								"You come across a girl, a tin man, a scarecrow and a lion who all look familier. Before you can remmber from where, they all attack you. You are dead.");
						death = true;
					} else {

					}
				} else if (userInput[0][1].equalsIgnoreCase("keep running")) {
					log.println("The guards catch up to you! They kill you. You are dead.");
				} else {
					log.println("Please enter a valid option.");

				}
			} else if (userInput[0][0].equalsIgnoreCase("desert")) {
				log.println("You come to a camel. Do you want to take it?");
				userInput[1][0] = log.readLine();
				log.clear();
				if (userInput[1][0].equalsIgnoreCase("Yes")) {
					log.println("You ride the camal until you approch a pyramid.");
					log.println("Do you enter?");
					userInput[1][1] = log.readLine();
					log.clear();
					if (userInput[1][1].equalsIgnoreCase("yes")) {
						log.println("You enter the pyramid, unaware of what awaits you.");
						log.println("You come to a tunnel.");
						log.println("Would you like to enter the tunnel?");
						userInput[1][2] = log.readLine();
						log.clear();
						if (userInput[1][2].equalsIgnoreCase("yes")) {
							log.println("You see a bag of gold being held by a dead corpse.");
							log.println("You take it and move on.");
							gold = gold + 10;
						}
						log.println("You keep walking until you come across a mummy.");
						log.println("The mummy says:");
						log.println(
								"'All who enter here DIE!... Unless you can guess my number thats between 1 and 5'");
						log.println("You have three guesses.");

						int mummyNumber = (int) (Math.random() * 3);
						for (int i = 0; i < triesMummy; i++) {
							userGuess = log.readLine();
							if (userGuess.equals(mummyNumber) && i == 3) {
								i = 0;
								log.println("Wow... you got it on the first try.");
								log.println("You must be a genuis!");
								log.println("I need a genuis like you, to lead my army of skeletons!");
								log.println("Go, lead my army and attack that wretched kingdom!");
								log.println("Power hungry, you lead the army to the kingdom.");
								log.println("You need a battle plan!");
								log.println("Will you lay seige to the castle, or assult it head on?(seige/assult)");
								userInput[1][3] = log.readLine();
								log.clear();
								if (userInput[1][3].equalsIgnoreCase("seige")) {
									log.println(
											"You lay seige for three gruleng months, until the kingdom finally surrender.");
									log.println(
											"You take over as the new king, marry the princess, and live happily ever after...");
									Thread.sleep(2000);
									log.println(
											"For all of two hours until the mummy comes back demanding the throne.");
									log.println("He kills you.");
									log.println("You are dead.");
									death = true;

								} else if (userInput[1][3].equalsIgnoreCase("assult")) {
									log.println("You charge your army at the castle.");
									log.println(
											"As bones start flying at you, you realize that all it takes is one hit to a skelleton to kill it.");
									log.println("The defenders of the castle kill your army and you");
									log.println("You are dead.");
									death = true;
								} else {
									log.println("Please enter a valid input.");
								}
							} else if (userGuess.equals(mummyNumber) && i == 2) {
								log.println("That is correct, you may leave.");
								log.println("As you leave the pyramid, you come across a random portal.");
								log.println("Do you use it?");
								userInput[1][4] = log.readLine();
								log.clear();
								if (userInput[1][4].equalsIgnoreCase("yes")) {
									log.println("You use the portal and it drops you off at home.");
								} else {
									log.println("You keep walking for a while until you begen to feel thursty.");
									log.println("You died of dehydration.");
									death = true;
								}

							} else if (userGuess.equals(mummyNumber) && i == 1) {
								log.println("That is correct... however... I think I'm going to kill you anyways.");
								log.println("Yoou are dead.");
								death = true;
							} else {
								log.println("That's wrong.");
								log.println("You have " + i + " tries left.");
							}
						}
					}
				} else {
					log.println(
							"You keep walking, and begen to feel tired. You start to feel thursty. You die of dehydration.");
					death = true;
				}
			} else {
				error = true;
			}
			}while(error = true);
			if (death = true) {
				log.println("Unfortunatly, you died.");
			} else {
				log.println("Congragulations! You win!");
			}
			log.println("Here are your choices:");
			for (int i = 0; i < 10; i++) {
				log.println(userInput[0][i]);

			}
			log.println("You accumulated " + gold + " gold on your journey.");
			log.println("Would you like to play again?");
			replay = log.readLine();
			if (replay.equalsIgnoreCase("No")) {
				playAgain = false;
				log.println("Well thats rude. :(");
			}
			else if (replay.equalsIgnoreCase("Yes"))
			{
				playAgain = true;
			}

		}

	}

}
