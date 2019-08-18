import java.util.Random;

public class Puzzle6 {

	public static void main(String[] args) {
		Random random = new Random();
		boolean toBe = random.nextBoolean();
		Number result = (toBe || !toBe) ? new Integer(3) : new Float(1);
		System.out.println(result);
	}

}