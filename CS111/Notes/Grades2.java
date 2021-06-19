public class Grades2 {
	
	public static void main (String[] args) {

		// keep a 2D array for scores
		//[row][column]
		// read the array dimensions from a file
		int rows = StdIn.readInt();
		int columns = StdIn.readInt();
		double[][] scores = new double[rows][columns]; // 100 students, 3 exams

		// populate the array with values from the file
		for (int r = 0; r < scores.length; r++ ) {
			for (int c = 0; c < scores[r].length; c++ ) {
				scores[r][c] = StdIn.readDouble();
				StdOut.println(scores[r][c]);
			}
		}

		// find the average for midterm 1 which is in column 0
		double sum = 0.0;
		for (int r = 0; r < scores.length; r++ ) {
			sum += scores[r][0]; // sum = sum + scores[r][0];
		}
		// scores.length = number of rows = number of students
		System.out.println("Average for midterm 1 is " + sum/scores.length);

		// find the student average for all exams
		int student = StdIn.readInt(); 
		StdOut.println("Computing average for student " + student);
		sum = 0.0;
		for ( int c = 0; c < scores[student].length; c++ ) {
			sum += scores[student][c];
		}
		// the number of exams for student is scores[student].length
		System.out.println("Average for student " + student + " is " + sum/scores[student].length);
	}
}