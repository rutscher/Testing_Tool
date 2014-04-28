public class phaseOneTriangle {

	boolean isATriangle = true;
	String triangleType = "Not A Triangle";

	public String triangle(int a, int b, int c) {

		while (isATriangle == true) {

			if (a < 5 || a > 205) {
				isATriangle = false;
				System.out
						.println("Value of a is not in the range of permitted values");

			}

			else if (b < 5 || b > 205) {
				isATriangle = false;
				System.out
						.println("Value of b is not in the range of permitted values");

			}

			else if (c < 5 || c > 205) {
				isATriangle = false;
				System.out
						.println("Value of c is not in the range of permitted values");

			}

			if (isATriangle == false) {
				break;
			}

			if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
				isATriangle = false;
				break;

			}

			if (a == b && b == c) {
				triangleType = "Equilateral";
			}

			else if (a != b && a != c && b != c) {
				triangleType = "Scalene";
			}

			else {
				triangleType = "Isosceles";

			}

			break;
		}

		//System.out.println("Is triangle:");
		//System.out.println(isATriangle);
		//System.out.println("Type of Triangle:");
		//System.out.println(triangleType);
		return triangleType;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		phaseOneTriangle test1 = new phaseOneTriangle();
		test1.triangle(18, 6, 23);

	}

}
