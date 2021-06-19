public class PowerOfTwo {
	public static void main(String[] args) {

		/* inputs number and will print 2^ to whatever number inputted in command line

			n=3
			Ex: 2^0= 1
				2^1= 2
				2^2= 4
				2^3= 8
		*/

		int n= Integer.parseInt(args[0]);
		int exponent=0;
		int value= 1;

		/*while(exponent <= n) {
			System.out.println("2^"+exponent+"= "+value);
			exponent++;
			value *= 2;
		}
		*/
		
		// rewriting while loop as for loop
		for(int exponent=0; exponent <=n; exponent++) {
			value *=2
			System.out.println("2^"+exponent+"= "+value);
		}
	}
}