public class Multiply {
	public static void main(String[] args) {

		// takes two numbers a & b and multiplies them without the multiplication operation
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int total=0;

		while (a > 0) {
			total= total + b;
			a--; // same as a-= 1 & a = a-1
		}
		System.out.println(total);
	}
}