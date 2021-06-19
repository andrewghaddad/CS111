
/* PROGRAM TO EMULATE HOW YOU CAN CALL A METHOD FROM A DIFFERENT CLASS */

public class MethodsTest {
	public static void main(String[] args){

		StdOut.println("enter number of lines");
		int d= StdIn.readInt();


		Methods.square(d, "*"); // calls the square method from Methods class

		int[] arr= {3,7,9,4,2};

		Methods.printArray(arr);
	}
}