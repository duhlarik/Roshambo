import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {

	Scanner scan1 = new Scanner(System.in);

	public HumanPlayer(String roshambo, String name) {
		super(roshambo, name);
	}
	
	public HumanPlayer() {
		super();
	}
	
	@Override
	public String generateRoshambo() {

		System.out.println("Choose \"rock,\" \"paper,\" or \"scissors.\"");
		String roshambo = scan1.nextLine();
		/*while (!((roshambo.equalsIgnoreCase("rock")) || (roshambo.equalsIgnoreCase("paper"))
				|| (roshambo.equalsIgnoreCase("scissors")))) {
			System.out.println("Invalid input. Please enter \"rock,\" or \"paper,\" or \"scissors.\"");
			continue;
		}*/
		return roshambo;
	}

	@Override
	public int generateIntRoshambo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
