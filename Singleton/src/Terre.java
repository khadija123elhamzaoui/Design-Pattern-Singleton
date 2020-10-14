
public class Terre {
	private static Terre instance= null;
	private Terre() {}
	
	public static Terre getInstance() {
		if (instance==null) {
			instance=new Terre();
			System.out.println("I'm new");
		}
		else
			System.out.println("I'm old");
		return instance;
	}
}
