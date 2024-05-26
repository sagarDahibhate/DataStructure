package Basic;


//Algorithm to addition of two numbers 
// first read two variable a and b
// apply logic of addition c=a+b
// return c


public class Addition {
	
	// swapping using temp variable 
	public static int add(int a , int b) {
		int c;
		c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
      System.out.println(Addition.add(10, 20));
	}
}
