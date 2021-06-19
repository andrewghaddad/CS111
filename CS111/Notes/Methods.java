public class Methods {

	public static double average (double a, double b) {

	}

	public static boolean isAdult (String name, int age) {

	}

	public static String legalName (String first, String last) {

	}
	
	// teo arguments n & symbol are the inputs for the method
	// contains two arguments n & symbols 
	// prints a square nby n symbols
	public static void square (int n, String symbol) {

		for (int i=0; i < n; i++) {
			for (int j=0; j < n; j++) {
				System.out.print(symbol+" ");
			}

			System.out.println(); // prints new line
		}
	}

	// method that prints an array
	public static void printArray (int[] array) {
		for (int i=0; i < array.length; i++) {
			StdOut.print(array[i]+" ");
		}

		StdOut.println();
	}

	// method that reverses arguement array and returns a new/ reversed array 
	public static int[] reverseArray (int[] array) {
		int[] rArray= new int [array.length];
		for (int i=0; i < array.length; i++) {
			int j= array.length -1 -i;
			rArray[j]=array[i];
		}
		return rArray;
	}

	public static int gcf (int a, int b) {
		int gcf=0;
		int largest=0;


		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		for (int i= largest; i > 1 ; i--) {
			if (a % i== 0 && b% i==0) {
				gcf= i;
				return gcf;
			}
		}
		return gcf;
	}

	public static void main( String args[]) {
		StdOut.print("enter the number of lines");
		int dimension= StdIn.readInt();
		
		int[] arr= {3,7,9,4,2};

		printArray(arr); // calls method


		int[] revIntArr= reverseArray(arr); // calls reverse array method but stores it into
											// new array so that returned values have somewhere to go;

		square(dimension, "*");

		int a= 18;
		int b=24;

		int gcf= gcf(a,b);
	}

}