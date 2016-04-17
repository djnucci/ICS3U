package nucci;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import hsa_new.Console;

public class AdventureGame {

	// make all the buffered Images for the pictures that you want
	public static BufferedImage bridgePic = null;
	public static BufferedImage camelPic = null;
	public static BufferedImage castlePic = null;
	public static BufferedImage desertPic = null;
	public static BufferedImage forestPathPic = null;
	public static BufferedImage forestPic = null;
	public static BufferedImage goldPic = null;
	public static BufferedImage homePic = null;
	public static BufferedImage loadingBar100 = null;
	public static BufferedImage loadingBar75 = null;
	public static BufferedImage loadingBar50 = null;
	public static BufferedImage loadingBar25 = null;
	public static BufferedImage moreGuardsPic = null;
	public static BufferedImage moreDesertPic = null;
	public static BufferedImage mummyPic = null;
	public static BufferedImage playerPic = null;
	public static BufferedImage princessPic = null;
	public static BufferedImage pyramidHallwayPic = null;
	public static BufferedImage pyramidPic = null;
	public static BufferedImage skeletonArmyPic = null;
	public static BufferedImage swordPic = null;
	public static BufferedImage thronePic = null;
	public static BufferedImage trollPic = null;
	public static BufferedImage tunnelPic = null;
	public static BufferedImage yellowBrickRoadPic = null;
	public static BufferedImage roadWithFriendsPic = null;

	public static boolean death = false;

	public static void main(String[] args) throws InterruptedException {

		// make a console
		Console log = new Console(40, 150);

		// make all text green
		log.setTextColour(Color.GREEN);

		// make the background colour black
		log.setTextBackgroundColor(Color.BLACK);

		// refresh the colour scheme
		log.clear();

		// assign buffered images a value
		try {
			loadingBar25 = ImageIO.read(AdventureGame.class.getResourceAsStream("/Loading Bar 25%.jpg"));
			loadingBar50 = ImageIO.read(AdventureGame.class.getResourceAsStream("/Loading Bar 50%.jpg"));
			loadingBar75 = ImageIO.read(AdventureGame.class.getResourceAsStream("/Loading Bar 75%.jpg"));
			loadingBar100 = ImageIO.read(AdventureGame.class.getResourceAsStream("/Loading Bar 100%.jpg"));
			bridgePic = ImageIO.read(AdventureGame.class.getResourceAsStream("/bridge.jpg"));
			camelPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/camel.jpg"));
			castlePic = ImageIO.read(AdventureGame.class.getResourceAsStream("/castle.jpg"));
			desertPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/desert.jpg"));

			// mock up a loading bar at 25%
			log.drawImage(loadingBar25, 0, 0, 500, 500, null);
			forestPathPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/Forest Path.jpg"));
			forestPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/Forest.jpg"));
			goldPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/gold.jpg"));
			homePic = ImageIO.read(AdventureGame.class.getResourceAsStream("/home.jpg"));
			moreGuardsPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/more guards.jpg"));
			moreDesertPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/more desert.jpg"));
			mummyPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/mummy.jpg"));

			// mock up a loading bar at 50%
			log.drawImage(loadingBar50, 0, 0, 500, 500, null);
			playerPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/player.jpg"));
			princessPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/princess.jpg"));
			pyramidHallwayPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/pyramid hallway.jpg"));
			pyramidPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/pyramid.jpg"));
			skeletonArmyPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/skeleton army.jpg"));
			swordPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/sword.jpg"));
			thronePic = ImageIO.read(AdventureGame.class.getResourceAsStream("/throne.jpg"));

			// mock up a loading bar at 75%
			log.drawImage(loadingBar75, 0, 0, 500, 500, null);
			trollPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/troll.jpg"));
			tunnelPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/tunnel.jpg"));
			yellowBrickRoadPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/yellow brick road.jpg"));
			//roadWithFriendsPic = ImageIO.read(AdventureGame.class.getResourceAsStream("/Yellow_Brick_Road and friends.jpg"));

			// finish loading
			log.drawImage(loadingBar100, 0, 0, 500, 500, null);

			// make sure everyone can see the final loading bar
			Thread.sleep(500);

			// handle all 'errors'
		} catch (IOException e) {
			e.printStackTrace();
		}

		// make 2d array for the users inputs
		String[][] userInput = new String[2][10];

		// and another 2d array for all error handling loops
		boolean[] noError = new boolean[20];

		// first user input value
		String primaryChoice = null;

		// starting gold value
		int gold = 25;

		// misc values for future use
		@SuppressWarnings("unused")
		boolean sword = false;
		String riddle;
		int triesTroll = 2;
		boolean playAgain = true;
		String replay;
		String userGuess;
		int triesMummy = 3;

		// playback loop
		while (playAgain == true) {
			// first error handling loop
			while (!noError[0]) {

				// clear all values in the array
				for (int i = 0; i < 10; i++) {
					userInput[0][i] = null;
					userInput[1][i] = null;
				}
				primaryChoice = null;

				// print user output
				log.clear();
				log.drawImage(castlePic, 0, 0, 1920 / 3, 1200 / 3, null);
				log.println("Run run run! You are a thief who has just stolen gold from a castle!");
				log.println("You come across two paths. One leads to a desert, one leads to a forest.");
				log.println("Which path do you take? (forest/desert)");
				primaryChoice = log.readLine();
				log.clear();

				// first branch
				if (primaryChoice.equalsIgnoreCase("forest")) {
					noError[0] = true;
					// second error handling loop
					while (!noError[1]) {

						// user output
						log.drawImage(forestPic, 0, 0, 5184 / 5, 3374 / 5, null);
						log.println("The guards chase you into the forest! You get to a clearing, and see a large tree. Do you hide in the tree or keep running?");
						log.println("(hide in tree/keep running)");
						userInput[0][1] = log.readLine();
						log.clear();

						if (userInput[0][1].equalsIgnoreCase("hide in tree") || userInput[0][1].equalsIgnoreCase("hide in trees")) {
							noError[1] = true;
							while (!noError[2]) {
								log.println("You successfully climb the tree.");
								log.println("The guards are confused, they look around trying to find your trail.");
								log.println("You see some rocks up on the tree.");
								log.println("Unsure of how they got there, you pick one up and take aim.");
								log.println("You could throw the rock and knock the guards out, but there's only a 1/3 chance of success.");
								log.println("Do you take the risk? (yes/no)");
								userInput[0][2] = log.readLine();
								log.clear();

								// third layer of branching paths
								if (userInput[0][2].equalsIgnoreCase("Yes")) {
									noError[2] = true;
									// FIXME TEMPORARY FOR DEBUGGING
									int chance = 2;
									// int chance = (int) (Math.random() * 3);
									if (chance == 0 || chance == 1) {
										log.println("You miss, the guards spot you and kill you. You are dead.");
										KillPlayer();
									} else {
										sword = true;

										while (!noError[3]) {
											log.println("You hit the guards and kill them. You climb down and steal some of their gold, along with a sword as a weapon!");
											log.println("You come across a cross roads.");
											log.println("One path leads to a bridge, the other goes to a yellow brick road. Where would you like to go?(bridge/yellow brick road)");
											userInput[0][3] = log.readLine();
											log.clear();

											if (userInput[0][3].equalsIgnoreCase("bridge") && death == false) {
												noError[3] = true;
												for (int i = 2; i != 0; i--) {
													log.drawImage(bridgePic, 0, 0, 1680 / 2, 1050 / 2, null);
													log.println("As you are beginning to cross, a troll blocks your path!");
													log.println("You tell the troll that you wish to pass, and he says he'll let you if you can get his riddle right in three guesses.");
													log.println("The riddle is: What gets wetter as it drys?");
													riddle = log.readLine();
													if (riddle.equalsIgnoreCase("a towel") && i == 2) {
														log.println("The troll says 'that is correct, you may procced!'");
														death = false;
														log.clear();
														break;
													} else if (riddle.equalsIgnoreCase("a towel")) {
														log.println("The troll says 'correct, but you didnt get it on the first try! I know I said I'd give you 3 tries, but i lied.' The troll eats you, you are dead.");
														KillPlayer();
														break;
													} else {
														log.println("The troll says 'wrong, try again.' You have " + i + " guesses left");
														KillPlayer();
														triesTroll--;
														if (triesTroll == 0) {
															log.println("The troll says 'Sorry, you're out of tries. I'm gonna eat you now.' You turn around and try to run, but see 3 guards approching. The troll notices them, looks at you and says 'dont move.' The troll lunges himself at the guards, but before you get a chance to run, the troll kills a gaurd and throws him at you. The two other gaurds kill the troll, and start approching you.");
															if (sword = true) {
																log.println("You pull out the sword you found earlier, and charge at the guards. Useing your agility, you manage to kill both of them. You steal their gold and cross the bridge, seeing your house in the distance.");
															} else {
																log.println("With nothing to defend yourself, the guards kill you. You are dead.");
																KillPlayer();
															}
															log.clear();
														}
													}
													Thread.sleep(750);
													log.clear();
												}

											} else if (userInput[0][3].equalsIgnoreCase("yellow brick road") && death == false) {
												noError[3] = true;
												log.drawImage(roadWithFriendsPic, 0, 0, 600 * 2, 407 * 2, null);
												log.println("You come across a girl, a tin man, a scarecrow and a lion who all look familier. Before you can remmber from where, they all attack you. You are dead.");
												KillPlayer();
											} else {
												noError[3] = false;
												log.println("Please enter a valid option.");
												Thread.sleep(1000);
												log.clear();
											}
										}
									}
								} else if (userInput[0][2].equalsIgnoreCase("No")) {
									noError[2] = true;
									log.println("The guards spot you and kill you. You are dead.");
									KillPlayer();
								} else {
									noError[2] = false;
									log.println("Please enter a valid option.");
									Thread.sleep(1000);
									log.clear();
								}
							}
						} else if (userInput[0][1].equalsIgnoreCase("keep running")) {
							noError[1] = true;
							log.println("The guards catch up to you! They kill you. You are dead.");
							KillPlayer();
						} else {
							noError[1] = false;
							log.println("Please enter a valid option.");
							Thread.sleep(1000);
							log.clear();
						}

					}
				} else if (primaryChoice.equalsIgnoreCase("desert")) {
					noError[0] = true;
					log.drawImage(desertPic, 0, 0, 1920 / 2, 1280 / 2, null);
					log.println("You come to a camel. Do you want to take it? (yes/no)");
					userInput[1][0] = log.readLine();
					log.clear();
					if (userInput[1][0].equalsIgnoreCase("Yes")) {
						log.drawImage(pyramidPic, 0, 0, 450 * 2, 362 * 2, null);
						log.println("You ride the camel until you approch a pyramid.");
						log.println("Do you enter?");
						userInput[1][1] = log.readLine();
						log.clear();
						if (userInput[1][1].equalsIgnoreCase("yes")) {
							log.drawImage(tunnelPic, 0, 0, 5760 / 6, 3840 / 6, null);
							log.println("You enter the pyramid, unaware of what awaits you.");
							log.println("You come to a tunnel.");
							log.println("Would you like to enter the tunnel?");
							userInput[1][2] = log.readLine();
							log.clear();

							if (userInput[1][2].equalsIgnoreCase("yes")) {
								log.drawImage(goldPic, 0, 0, (int) (1680 / 1.5), (int) (944 / 1.5), null);
								log.println("You see a bag of gold being held by a dead corpse.");
								log.println("You take it and move on. (Type anything to continue)");
								gold = gold + 10;
								log.readLine();
								log.clear();
							}

							log.drawImage(mummyPic, 0, 0, 600, 780, null);
							log.println("You keep walking until you come across a mummy.");
							log.println("The mummy says:");
							log.println("'All who enter here DIE!... Unless you can guess my number thats between 1 and 5'");
							log.println("You have three guesses.");

							int mummyNumber = (int) (Math.random() * 3);
							for (int i = 0; i < triesMummy; i++) {
								userGuess = log.readLine();
								if (userGuess.equals(mummyNumber) && i == 3) {
									i = -1;
									log.println("Wow... you got it on the first try.");
									log.println("You must be a genius!");
									log.println("I need a genius like you, to lead my army of skeletons!");
									log.println("Go, lead my army and attack that wretched kingdom!");
									log.println("Power hungry, you lead the army to the kingdom.");
									log.println("You need a battle plan!");
									log.println("Will you lay seige to the castle, or assault it head on?(seige/assault)");
									userInput[1][3] = log.readLine();
									log.clear();
									if (userInput[1][3].equalsIgnoreCase("seige")) {
										log.println("You lay seige for three gruleng months, until the kingdom finally surrender.");
										log.println("You take over as the new king, marry the princess, and live happily ever after...");
										Thread.sleep(2000);
										log.println("For all of two hours until the mummy comes back demanding the throne.");
										log.println("He kills you.");
										log.println("You are dead.");
										KillPlayer();

									} else if (userInput[1][3].equalsIgnoreCase("assault")) {
										log.println("You charge your army at the castle.");
										log.println("As bones start flying at you, you realize that all it takes is one hit to kill a skeleton.");
										log.println("The defenders of the castle kill your army and you");
										log.println("You are dead.");
										KillPlayer();
									} else {
										log.println("Please enter a valid input.");
									}
								} else if (userGuess.equals(mummyNumber) && i == 2) {
									i = -1;
									log.println("That is correct, you may leave.");
									log.println("As you leave the pyramid, you come across a random portal.");
									log.println("Do you use it?");
									userInput[1][4] = log.readLine();
									log.clear();
									if (userInput[1][4].equalsIgnoreCase("yes")) {
										log.println("You use the portal and it drops you off at home.");
									} else {
										log.println("You keep walking for a while until you begen to feel thirsty.");
										log.println("You died of dehydration.");
										KillPlayer();
									}

								} else if (userGuess.equals(mummyNumber) && i == 1) {
									i = -1;
									log.println("That is correct... however... I think I'm going to kill you anyways.");
									log.println("You are dead.");
									KillPlayer();
								} else {
									log.println("That is wrong.");
									log.println("You have " + Math.abs(i - 2) + " tries left.");
									Thread.sleep(250);
									log.clear();
								}
							}
						} else if (userInput[1][1].equalsIgnoreCase("no")) {
							log.println("You drown in the quicksand you are standing in. You are dead.");
							KillPlayer();
						}
					} else {
						log.println("You keep walking, and begin to feel tired. You start to feel thirsty. You die of dehydration.");
						KillPlayer();
					}
				} else {
					noError[0] = false;
					log.println("Please enter a valid option.");
					Thread.sleep(1000);
					log.clear();
				}
			}
			noError[19] = false;
			while (!noError[19]) {
				if (!death) {
					log.println("Congradulations! You win!");
				}
				log.println("Here were your choices:");
				if (primaryChoice.equalsIgnoreCase("Forest")) {
					log.println(primaryChoice);
					for (int i = 0; i < 10; i++) {
						if (userInput[0][i] != null) {
							log.println(userInput[0][i]);
						}
					}
				} else if (primaryChoice.equalsIgnoreCase("Desert")) {
					log.println(primaryChoice);
					for (int i = 0; i < 10; i++) {
						if (userInput[1][i] != null) {
							log.println(userInput[1][i]);
						}
					}
				} else {
					log.println(primaryChoice);
				}

				log.println("You accumulated " + gold + " gold on your journey.");
				log.println("Would you like to play again?");
				replay = log.readLine();

				if (replay.equalsIgnoreCase("No")) {
					noError[19] = true;
					playAgain = false;
					log.println("Well thats rude. :(");
					Thread.sleep(1000);
					log.close();
				} else if (replay.equalsIgnoreCase("Yes")) {
					playAgain = true;
					for (int i = 0; i < 20; i++) {
						noError[i] = false;
					}
					noError[19] = true;
				} else {
					noError[19] = false;
					log.clear();
					log.println("Please enter a valid option.");
					Thread.sleep(1000);
					log.clear();
				}
			}
		}
	}

	public static void KillPlayer() {
		death = true;
	}

}
