public class Grades {
	
	public static void main (String[] args) {

		// keep a 2D array for scores
		//[row][column]
		double[][] scores = new double[100][3]; // 100 students, 3 exams

		// populate the array with random values between 0-10
		for (int r = 0; r < scores.length; r++ ) {
			for (int c = 0; c < scores[r].length; c++ ) {
				scores[r][c] = Math.random() * 10; 
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
		int student = 4;
		sum = 0.0;
		for ( int c = 0; c < scores[student].length; c++ ) {
			sum += scores[student][c];
		}
		// the number of exams for student is scores[student].length
		System.out.println("Average for student " + student + " is " + sum/scores[student].length);
	}
}

