
public abstract class AbstractPlayer {

	private String Roshambo;
	private String name;

	public AbstractPlayer(String roshambo, String name) {
		setRoshambo(roshambo);
		setName(name);
	}

	public AbstractPlayer(String name) {
		setName(name);
	}

	public AbstractPlayer() {

	}

	public String getRoshambo() {
		return Roshambo;
	}

	public void setRoshambo(String roshambo) {
		Roshambo = roshambo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int generateIntRoshambo();

	public abstract String generateRoshambo();

	public String generateRoshambo(int i) {
		
		return null;
	}
}
