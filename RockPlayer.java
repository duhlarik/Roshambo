
public class RockPlayer extends AbstractPlayer {

	public RockPlayer(String name) {
		super("Player to Beat");
	}

	@Override
	public String generateRoshambo() {
		
		return "rock";
	}

	@Override
	public int generateIntRoshambo() {
		
		return 0;
	}

}
