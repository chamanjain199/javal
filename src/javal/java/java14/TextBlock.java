package javal.java.java14;

public class TextBlock {

	static void test1() {
		// String test1="""Test1"""; invalid because first line should be only 3 double
		// quote

		String test2 = """
				Test2
				"""; // this will have have a new line at end

		System.out.println(test2);

		String test3 = """
				Test3"""; // this will not have have a new line a end

		System.out.println(test2);
	}

	static void indentation() {
		String html = """
				<html>

				    <body>
				        <span>example text</span>
				    </body>
				</html>""";

		System.out.println(html);
	}

	static void escaptinQuote() {
		String escaptinQuote = """
				"fun" with
				whitespace
				and other escapes \"""
				""";

		System.out.println(escaptinQuote);
	}

	public static void getIgnoredNewLines() {
		String ignoreNewlIne = """
				This is a long test which looks to \
				have a newline but actually does not""";
		System.out.println(ignoreNewlIne);

	}
	public static void escaptingSpace() {
		String excapingSpace = """
				line1     \s
				line2     \s
				""";
		System.out.println(excapingSpace);

	}
	public static String getFormattedText(String parameter) {
	    return """
	            Good Morning : %s 
	            """.formatted(parameter);
	}
	public static void main(String[] args) {
		test1();
		indentation();
		escaptinQuote();
		getIgnoredNewLines();
		escaptingSpace();
		System.out.println(getFormattedText("rahul"));
	}

}
