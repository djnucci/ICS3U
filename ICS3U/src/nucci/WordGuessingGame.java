package nucci;

import java.util.Scanner;

public class WordGuessingGame {

	public static void main(String[] args) {

		String[] words = new String[]{"gyro", "do", "you", "often", "need", "to", "take", "spreadsheet", "of", "data", "and", "convert", "comma", "list", "special", "philatelist"};
		Scanner read = new Scanner(System.in);
		int randomWord = (int) (Math.random() * 16);
		boolean dashes = true;

		char[] wordDashes = new char[words[randomWord].length()];
		System.out.println("Word Guessing Game...");

		for (int i = 0; i < words[randomWord].length(); i++) {
			wordDashes[i] = '-';
		}

		char[] wordOfWords = words[randomWord].toCharArray();
		String userGuess = "#";
		String guessWord;

		while (!userGuess.equalsIgnoreCase("!") && dashes) {
			
			for(int i = 0; i < wordDashes.length; i++){
				if(wordOfWords[i] == userGuess.charAt(0)){
					wordDashes[i] = userGuess.charAt(0);
				}
				
				System.out.print(wordDashes[i]);
				
			}
			
			for (int i = 0; i < wordDashes.length; i++) {
				if (wordDashes[i] == '-') {
					dashes = true;
					break;
				}
				if (wordDashes[i] != '-') {
					dashes = false;
				}
			}
			System.out.println();
			if(dashes){
			System.out.print("Enter a letter (or a ! to guess the word):");
			
			userGuess = read.nextLine();
			}
		}

		if (!dashes) {
			System.out.println("Congrats, you won!");
			System.out.println("You guessed the word, it was: " + "'" + words[randomWord] + "'");
		} else {
			System.out.println("What is your guess for the word?");
			guessWord = read.nextLine();
			if(guessWord.equalsIgnoreCase(words[randomWord])){
				System.out.println("Congrats, you won!");
				System.out.println("You guessed the word, it was: " + "'" + words[randomWord] + "'");
			}
			else{
				System.out.println("You failed the task.");
				System.out.println("You did not guess the word, it was: " + "'" + words[randomWord] + "'");
			}
		}
	}

}
