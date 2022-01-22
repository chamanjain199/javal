package javal.java.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMethods {

	public static void main(String[] args) {

		try {
			Files.writeString(Path.of("text.txt"), "Hello Java");
			String str=Files.readString(Path.of("text.txt"));
			System.out.println(str.equals("Hello Java"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
