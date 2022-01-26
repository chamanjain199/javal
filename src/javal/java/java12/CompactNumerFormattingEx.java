package javal.java.java12;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.text.ParseException;
import java.util.Locale;

public class CompactNumerFormattingEx {

	public static void main(String[] args) throws ParseException {

		NumberFormat nf = NumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);
		System.out.println(nf.format(1000000)); // 1 million
		nf = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
		System.out.println(nf.format(1000000)); // 1M

		nf = NumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);
		System.out.println(nf.format(1000)); // 1 thousand
		nf = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
		System.out.println(nf.format(1000)); // 1K

		NumberFormat nfp = NumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);
		System.out.println(nfp.parse("1 million")); // 1000000
		nfp = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
		System.out.println(nfp.parse("1M")); // 1000000

		nfp = NumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);
		System.out.println(nfp.parse("1 thousand")); // 1000
		nfp = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
		System.out.println(nfp.parse("1K")); // 1000

		
		nf = NumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);
		nf.setMaximumFractionDigits(3);

		nf.setMaximumFractionDigits(10);
		System.out.println(nf.format(10350)); //10.35 thousand
		nf = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
		System.out.println(nf.format(105020)); // 105K
	}

}
