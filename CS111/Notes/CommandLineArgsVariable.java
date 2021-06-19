public class CommandLineArgsVariable {
	public static void main(String[] args) {

		//args.length stores the number of command line arguments
		System.out.println("the number of arguments "+ args.length);

		//to print all arguments
		int index=0; // first argument is at index 0
		while (index < args.length) {
			System.out.println(args[index]);
			index= index +1;
		}

		for (int i=0; i < args.length; i++) { // ^ doing same just using for loop
			System.out.println(args[i]);
		}
	}
}
