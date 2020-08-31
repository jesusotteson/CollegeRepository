/*
 * Hangman Game
 * Jp Otteson
 */
import java.util.Scanner;
import java.util.Random;

public class HangmanMain{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random ();
		String[] guesses = {"utah","mississippi","hawaii","cat"};
		
		boolean PlayingGame = true;
		while (PlayingGame) {
			System.out.println();
			System.out.println("Welcome to Hangman");
			char[] randomWord = guesses[rand.nextInt (guesses.length)].toCharArray();
			int amountOfGuesses = randomWord.length;
			char[] playerGuess = new char[amountOfGuesses];
			
			for (int i = 0; i < playerGuess.length; i++) {
					playerGuess[i]= '_';
			}
			
			boolean wordIsGuessed = false;
			int tries = 0;
			
			while (!wordIsGuessed && tries != amountOfGuesses) {
				System.out.print("Current Guesses: \n");
				System.out.print(playerGuess);
				System.out.printf("You have %d tries left. \n", amountOfGuesses - tries);
				System.out.println("Enter a Letter");
				char input = scan.nextLine().charAt(0);
				tries++;
				
				if (input == '-') {
					PlayingGame = false;
					wordIsGuessed = true;
				} else {
					for (int i =0; i < randomWord.length; i ++) {
						if (randomWord [i] == input) {
							playerGuess [i] = input;
						}
					}
					
					if (isTheWordGuessed (playerGuess)) {
						wordIsGuessed = true;
						System.out.println();
						System.out.println(playerGuess);
						System.out.println("You Won!");
					}
				}
			}
			if (!wordIsGuessed) System.out.println("You ran out of guessed :/");
			System.out.println();
			System.out.println("Press Enter to play again.");
			String anotherGame = scan.nextLine();
			if (anotherGame.contentEquals("no")) PlayingGame = false;
		}
		
		System.out.println("Game Over");
	}
	
	public static void printArray (char[] array) {
		for (int i =0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			System.out.println();
		}
	}
	
	public static boolean isTheWordGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_') return false;
		}
		return true;
	}
}