
import java.util.Scanner;

public class MainRoshambo {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		int tie = 0;
		int win = 0;
		int lose = 0;

		System.out.println("Hello, welcome to Roshambo. Please enter your name.");

		String playerName = scan1.nextLine();
		
		System.out.println("To play this game, " + playerName + ", you need to pick an opponent.\n");

		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Enter \"Player to Beat\" or \"Super Player.\"");

			String opponent = scan1.nextLine();
			
			while (!((opponent.equalsIgnoreCase("Player to Beat")) || (opponent.equalsIgnoreCase("Super Player")))) {
				
				System.out.println("Wrong entry. Please enter \"Player to Beat\" or \"Super Player.\"");
				
				opponent = scan1.nextLine();
			}

			HumanPlayer player1 = new HumanPlayer();

			RandomPlayer super1 = new RandomPlayer();

			if (opponent.equalsIgnoreCase("Player to Beat")) {

				String playerChoice = player1.generateRoshambo();

				//System.out.println("Human player generateRoshambo " + playerChoice); // TEST

				playerToBeat(tie, win, lose, playerName, playerChoice);
			}

			else if (opponent.equalsIgnoreCase("Super Player")) {

				int i = super1.generateIntRoshambo();

				String roshambo = super1.generateRoshambo(i);

				//System.out.println("Super Player generateIntRoshambo " + i); // TEST
				//System.out.println("Super Player generateRoshambo " + roshambo); // TEST

				int j = 0;

				String playerChoice = player1.generateRoshambo();

				j = playerChoiceToInt(j, playerChoice);

				//System.out.println("Human player j " + j); // TEST
				//System.out.println("Human player generateRoshambo " + playerChoice); // TEST

				superPlayer(tie, win, lose, playerName, i, roshambo, j, playerChoice);
			}
			
			System.out.println("Play again?");
			
			choice = scan1.nextLine();
			
			if (choice.equalsIgnoreCase("no")) {
				
				System.out.println("Goobye!");
				
				//System.out.println("You had " + win + "wins, " + lose + "losses, and " + tie + "ties.");
			}
			
		}scan1.close();
	}

	public static int playerChoiceToInt(int j, String playerChoice) {
		switch (playerChoice) {
		case "rock":
			j = 0;
			break;
		case "paper":
			j = 1;
			break;
		case "scissors":
			j = 2;
			break;
		default:
			System.out.println("Invalid entry. Please enter \"rock,\" \"paper\" or \"scissors.\"");
		}
		return j;
	}

	public static void superPlayer(int tie, int win, int lose, String playerName, int i, String roshambo, int j,
			String playerChoice) {
		if (i == j) {
			System.out.println(playerName + ": " + playerChoice);
			System.out.println("Super Player: " + roshambo);
			System.out.println("It's a TIE!");
			tie++;
		}

		else if (((i == 1) && (j == 0)) || ((i == 2) && (j == 1)) || ((i == 0) && (j == 2))) {

			System.out.println(playerName + ": " + playerChoice);
			System.out.println("Super Player: " + roshambo);
			System.out.println("You LOSE!");
			lose++;

		}

		else if (((i == 0) && (j == 1)) || ((i == 2) && (j == 0)) || ((i == 1) && (j == 2))) {
			System.out.println(playerName + ": " + playerChoice);
			System.out.println("Super Player: " + roshambo);
			System.out.println("You WIN!!");
			win++;
		}

		else {
			System.out.println("Error");
		}
	}

	public static void playerToBeat(int tie, int win, int lose, String playerName, String playerChoice) {
		switch (playerChoice) {
		case "rock":
			System.out.println(playerName + ": " + playerChoice);
			System.out.println("Player to Beat: rock");
			System.out.println("It's a TIE!");
			tie++;
			break;
		case "scissors":
			System.out.println(playerName + ": " + playerChoice);
			System.out.println("Player to Beat: rock");
			System.out.println("You LOSE!");
			lose++;
			break;
		case "paper":
			System.out.println(playerName + ": " + playerChoice);
			System.out.println("Player to Beat: rock");
			System.out.println("You WIN!!");
			win++;
			break;
		}
	}
}
