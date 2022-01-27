package javal.java.java13;

public class StripIndentMethod {

	public static void main(String[] args) {
		// In java 13 it is a preview feature

		String json=""
		+ "         {\n "
		+ "           \"id\":\"1000\" \n"
		+ "           \"firstname\":\"Jack\" \n"
		+ "           \"lasName\":\"Spawrrow\" \n"
		+ "         }";

		System.out.println(json);

		System.out.println(json.stripIndent());


	}

}
