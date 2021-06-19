public class RecursiveTriangle {
	
	public static void main(String[] args) {
		
	}

	public static void printRow (int stars) {
		if (stars ==1) {
			System.out.println();
			return;
		}
		System.out.print("*");
		printRow(stars -1);
	}

	public static void pyramid (int stars, printRow) {

		if(stars==1) {
			printRow(stars);
		} else{
			pyramid(stars -1);
			printRow(stars);
	}
}