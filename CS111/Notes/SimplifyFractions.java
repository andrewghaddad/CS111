public class SimplifyFractions {
	
	public static void main(String[] args) {
		StdOut.println("enter numerator: ");
		int num= StdIn.readInt();
		StdOut.println("enter denominator: ");
		int denom= StdIn.readInt();

		int gcf= Methods.gcf(num, denom);

		num /= gcf;
		denom /= gcf;

		StdOut.println(num+"/"+denom);

	}
}