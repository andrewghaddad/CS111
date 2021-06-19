public class Factorial {
	public static void main (String[] args){

		// computes the factorial of a number read from the command line
		int a= Integer.parseInt(args[0]);
		int total=1;

		while (a > 1) {
			total= total * a;
			a--;
		}
		System.out.println(total);
	}
}