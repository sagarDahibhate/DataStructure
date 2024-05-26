package Basic;

//   SWAPPING USING TEMP VARIABLE

// read two parameter from the user 
//  implement bussiness logic 
//   logic     
// declare temp var    
//    temp=a;
//    a=b;
//    b=temp;
//   swapping done print data

public class Swapping {

	// swapping using tmep variable
	public static void swap(int a, int b) {
		int temp = 0;
		System.out.println("before swapping a :" + a + " b: " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping a :" + a + " b: " + b);
	}

	// swapping using addition and subtraction
	public static void swap1(int a, int b) {
		System.out.println("before swapping a :" + a + " b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after Swapping a: " + a + " b: " + b);
	}

	// swapping using multiplication and division
	public static void swap2(int a, int b) {
		System.out.println("before swapping a :" + a + " b: " + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("after Swapping a: " + a + " b: " + b);
	}

	// swapping using bitwise operator
	public static void swap3(int a, int b) {
		System.out.println("before swapping    f a :" + a + " b: " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after Swapping a: " + a + " b: " + b);
	}

	public static void main(String[] args) {
		Swapping.swap3(10, 20);
	}
}
