public class TestIO {
	public static void main (String[] args) {

		StdOut.println("Enter an integer number: ");
		int x = StdIn.readInt(); // reads an integer from the standard input
		StdOut.println("Read the integer: " + x);

		StdOut.println("Enter a double: ");
		double y = StdIn.readDouble(); // reads a double from the standard input
		StdOut.println("Read the double: " + y);
	}
}