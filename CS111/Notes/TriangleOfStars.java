public class TriangleOfStars {
	public static void main(String[] args) {
		
		int n= Integer.parseInt(args[0]);
		int row=0;
		while (row < n) {
			int col =0;
			while( col <= row ) {
				System.out.print("* ");
				col++;

			}

			row++;
			System.out.println();
		}

		/* System.out.println("col="+col); => not possible becuase col
											  isnt accessible inside a loop
		*/
		System.out.println("n="+n+" rows="+row);
	}
}