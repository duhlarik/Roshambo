
public class RandomPlayer extends AbstractPlayer {

	public RandomPlayer(String roshambo, String name) {

		super(roshambo, "Super Player");
	}

	public RandomPlayer() {
		super();
	}

	@Override
	public int generateIntRoshambo() {

		int i = (int) (Math.random() * 3);

		return i;
	}

	@Override
	public String generateRoshambo(int i) {

		String roshambo = "";
		switch (i) {
		case 0:
			roshambo = "rock";
			break;
		case 1:
			roshambo = "paper";
			break;
		case 2:
			roshambo = "scissors";
			break;
		}
		return roshambo;
	}

	@Override
	public String generateRoshambo() {
		
		return null;
	}

}
