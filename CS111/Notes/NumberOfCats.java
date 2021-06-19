public class NumberOfCats {

	//assume that ellens number of cats is the first argument at index 0
	//assume that annas number of cats is second argument at index 1
	public static void main (String[] args) {
		
		// transforms the arg[0] string into an integer
		int ellenCats= Integer.parseInt(args[0]);

		// transforms the arg[1] string into an integer
		int annasCats= Integer.parseInt(args[1]);


		if ( ellenCats < 0 || annasCats < 0){
			System.out.println("Error");
		}
		else {
			int totalCats= ellenCats + annasCats;
			System.out.println("total number of cats is "+ totalCats);
		}
	}
}