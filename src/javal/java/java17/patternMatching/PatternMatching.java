package javal.java.java17.patternMatching;

interface Shape {

	public static double getParimeterError(Shape shape) {
		if (!(shape instanceof Circle cr))
			return cr.radios() * 2 * Math.PI; // Can not use cr here because the predicate cr Circle Rectangle is false.

		if (shape instanceof Rectangle r && r.length() > 5) {
			// Because the conditional-AND operator (&&) is short-circuiting, the program
			// can reach the r.length() > 5 expression only if the instanceof operator is
			// true.
			System.out.println(r);
		}
		if (shape instanceof Rectangle r || r.length() > 5) {
			System.out.println(r);// The program can reach the r.length() || 5 if the instanceof is false; thus,
									// you cannot use the pattern variable r here.

		}

	}

	public static double getParimeter(Shape shape) {
		if (shape instanceof Circle cr) {
			return cr.radios() * 2 * Math.PI;
		} else if (shape instanceof Rectangle rc) {
			return 2 * rc.length() + 2 * rc.width();
		} else {
			throw new IllegalArgumentException("Unrecognized shape");
		}
	}

	public static double getPerimeter2(Shape shape) throws IllegalArgumentException {
		return switch (shape) {
		case Rectangle r -> 2 * r.length() + 2 * r.width();
		case Circle c -> 2 * c.radius() * Math.PI;
		default -> throw new IllegalArgumentException("Unrecognized shape");
		};
	}

	public static double getPerimeter1(Shape shape) throws IllegalArgumentException {
		return switch (shape) {
		case Rectangle r -> 2 * r.length() + 2 * r.width();
		case Circle c -> 2 * c.radius() * Math.PI;
		default -> throw new IllegalArgumentException("Unrecognized shape");
		};
	}

}

record Circle(double radios) implements Shape {

}

record Rectangle(double width, double length) implements Shape {

}

public class PatternMatching {

	public static void main(String[] args) {

		Circle circle = new Circle(3);
		System.out.println(Shape.getParimeter(circle));
		Rectangle rectangle = new Rectangle(3, 3);
		System.out.println(Shape.getParimeter(rectangle));

	}

}
