package nucci;
/**
 * @author Nucci
 * AnimalGuessingGame.java
 * an animal guessing game with a new way i found of adding objects to an array
 * */
import java.util.Scanner;

public class AnimalGuessingGame {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String[] animal = new String[20];
		boolean[] previousGuess = new boolean[animal.length];
		boolean correctAnswer = false;
		int i = 0;
		String userResponce;

		animal[i] = "lion"; i++;
		animal[i] = "jaguar"; i++;
		animal[i] = "cat"; i++;
		animal[i] = "dog"; i++;
		animal[i] = "tiger"; i++;
		animal[i] = "giraffe"; i++;
		animal[i] = "newt"; i++;
		animal[i] = "lizard"; i++;
		animal[i] = "dragon"; i++;
		animal[i] = "ant"; i++;
		animal[i] = "human"; i++;
		animal[i] = "mole"; i++;
		animal[i] = "guinea pig"; i++;
		animal[i] = "hamster"; i++;
		animal[i] = "frog"; i++;
		animal[i] = "bird"; i++;
		animal[i] = "octopus"; i++;
		animal[i] = "spider"; i++;
		animal[i] = "gorilla"; i++;
		animal[i] = "wolf";
		
		System.out.println("Hi, let's play a guessing game. Think of an animal and I'll guess what it is (an invalid answer is counted as you saying no).");

		while (!correctAnswer) {
			
			int guess = (int) (Math.random() * 20);
			
			if (!previousGuess[guess]) {
				previousGuess[guess] = true;
				System.out.println("Is it a(n) " + animal[guess] + "?");
				userResponce = read.nextLine();
				
				if (userResponce.equalsIgnoreCase("Yes")) {
					correctAnswer = true;
				}
			}
			if (previousGuess[0]&&previousGuess[1]&&previousGuess[2]&&previousGuess[3]&&previousGuess[4]&&previousGuess[5]&&previousGuess[6]&&previousGuess[7]&&previousGuess[8]&&previousGuess[9]&&previousGuess[10]&&previousGuess[11]&&previousGuess[12]&&previousGuess[13]&&previousGuess[14]&&previousGuess[15]&&previousGuess[16]&&previousGuess[17]&&previousGuess[18]&&previousGuess[19]){
				break;
			}
		
		}
		if(correctAnswer){
			System.out.println("I win!!");
		}
		else{
			System.out.println("I don't seem to have that animal in my memory");
		}
	}

}
