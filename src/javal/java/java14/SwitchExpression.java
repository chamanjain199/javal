package javal.java.java14;

import java.time.LocalDate;

public class SwitchExpression {

	public static int noOfDaysInMonth(String month) {

		int noOfDays = switch (month) {
		case "FEBRUARY" -> {
			int days = 28;
			if (LocalDate.now().isLeapYear()) {
				days = 29;
			}
			yield days; // to return a result
		}
		case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER" -> 31;
		case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" -> 30;
		default -> throw new IllegalArgumentException("Unexpected value: " + month);
		};

		int noOfDaysOld = 0;
		switch (month) {
		case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER":
			noOfDaysOld = 31;
			break;
		case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER":
			noOfDaysOld = 30;
			break;
		case "FEBRUARY":
			noOfDaysOld = 28;
		}

		System.out.println("noOfDaysOld " + noOfDaysOld + " noOfDays " + noOfDays);

		return noOfDays;

	}

	public static void main(String[] args) {

		noOfDaysInMonth("JANUARY");
	}

}
