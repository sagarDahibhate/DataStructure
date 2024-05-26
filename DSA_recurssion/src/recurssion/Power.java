package recurssion;

public class Power {

	public static int m(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * m(a, b - 1);
	}

	public static int power(int a, int b) {
		if (b >= 1) {
			return a * power(a, b - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(m(5, 2));
	}
}
