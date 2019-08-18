import java.util.HashSet;
import java.util.Set;

public class Puzzle1 {

	public static void main(String[] args) {
		Set<Short> shorts = new HashSet<>();
		for (short i = 0; i < 100; i++) {
			shorts.add(i);
			shorts.remove(i - 1);
		}
		System.out.println(shorts.size());
	}

}
