import java.util.Random;

public class Puzzle7 {

	public static void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt();
		if (Math.round((double) i) != i) {
			System.out.println("Ground Round");
		} else {
			System.out.println("Not Ground Round");
		}

	}

}
