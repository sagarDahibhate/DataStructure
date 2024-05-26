package Basic;

public class SumOfNaturalNumbers {

	// using loop
	public static int sumOfNatural_v1(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// using recursion
	public static int sumOfNatural_v2(int n) {
		if (n == 0)
			return 0;
		else
			return n + sumOfNatural_v2(n - 1);
	}

	// using math formula
	public static int sumOfNatural_v3(int n) {
		return (n * (n + 1)) / 2;
	}

	public static void main(String[] args) {
            System.out.println("Using loop : "+sumOfNatural_v1(5));
            
            System.out.println("Using recurssion :"+sumOfNatural_v2(4));
            
            System.out.println("using math formula :"+sumOfNatural_v3(3));
	}
}
