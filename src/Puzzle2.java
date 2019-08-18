import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Puzzle2 {

	private static final String[] URL_NAMES = { "http://javapuzzlers.com", "http://apache2-snort.skybar.dreamhost.com",
			"http://google.com", "http://javapuzzlers.com", "http://findbugs.sourceforge.net",
			"http://www.cs.umd.edu" };

	public static void main(String[] args) throws MalformedURLException {
		Set<URL> favourites = new HashSet<>();
		for (String urlName : URL_NAMES) {
			favourites.add(new URL(urlName));
		}
		System.out.println(favourites.size());
	}

}
