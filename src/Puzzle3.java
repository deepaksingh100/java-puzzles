
public class Puzzle3 {

	public static final Puzzle3 PUZZLE3 = new Puzzle3();

	private Puzzle3() {
	}

	private static final Boolean LIVING = true;
	private final Boolean alive = LIVING;

	public final Boolean lives() {
		return alive;
	}

	public static void main(String[] args) {
		System.out.println(PUZZLE3.lives());
	}

}
