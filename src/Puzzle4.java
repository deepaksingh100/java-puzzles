import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Puzzle4 {

	private static final int GAP_SIZE = 10 * 1024;

	public static void main(String[] args) throws IOException {
		File temp = File.createTempFile("gap", ".txt");
		FileOutputStream out = new FileOutputStream(temp);
		out.write(1);
		out.write(new byte[GAP_SIZE]);
		out.write(2);
		out.close();
		InputStream in = new BufferedInputStream(new FileInputStream(temp));
		int first = in.read();
		in.skip(GAP_SIZE);
		int last = in.read();
		System.out.println(first + last);
	}

}
