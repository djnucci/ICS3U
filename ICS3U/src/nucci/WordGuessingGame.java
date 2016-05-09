package nucci;

import java.util.Scanner;

public class WordGuessingGame {

	public static void main(String[] args) {

		String[] words = new String[]{"gyro", "do", "you", "often", "need", "to", "take", "spreadsheet", "of", "data", "and", "convert", "comma", "list", "special", "philatelist"};
		Scanner read = new Scanner(System.in);
		int randomWord = (int) (Math.random() * 16);
		boolean dashes = false;

		char[] wordDashes = new char[words[randomWord].length()];
		System.out.println("Word Guessing Game...");

		for (int i = 0; i < words[randomWord].length(); i++) {
			wordDashes[i] = '-';
		}
		
		for (int i = 0; i < words[randomWord].length(); i++) {
			System.out.print(wordDashes[i]);
		}
		String userGuess = "thisisnotnull";

		while (!userGuess.equalsIgnoreCase("!") && !dashes) {
			for(int i = 0; i < wordDashes[i]; i++){
				if (wordDashes[i] == '-'){
					dashes = false;
					break;
				}
				if (wordDashes[i] != '-'){
					dashes = true;
				}
			}
			System.out.println("");
			System.out.println("Enter a letter (or a ! to guess the word)");
			userGuess = read.nextLine();
		}
		
		if(!dashes){
			System.out.println("You guessed the word, it was " + words[randomWord]);
		}
		else{
			System.out.println("");
		}
	}

}
