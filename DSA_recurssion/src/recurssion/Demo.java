package recurssion;

public class Demo {

	public static void print(int n) {
		// System.out.println(n);
		if (n >= 0) {
			// System.out.println(n);
			print(n - 1);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		print(5);
	}

}
