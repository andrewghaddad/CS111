public class SquareOfStars {
	public static void main (String[] args) {

		/* print an array with stars (*)
		EX: inputs:		numbers of rows (3)
			outputs:	* * *
						* * *
						* * *
		*/

		int n= Integer.parseInt(args[0]);
		int row=0;
		// outer loop calls the inner loop n times
		while (row < n) {
			int col=0;

			// inner loop will print out row of stars
			while( col < n) {
			System.out.print(" *");
			col++;
			}
		row++;
		System.out.println();
		}
	}
}