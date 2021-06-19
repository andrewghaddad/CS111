/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Andrew Haddad andeew.gh@rutgers.edu 179009180
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE

    // what is the squared distance? is it (x2-x1)^2 + (y2-y1)^2?
    	
    	//number of steps
    	int n= Integer.parseInt(args[0]);

        // range variables
        int min = 1; 
        int max = 4; 
        int range = max - min; 

    	// inital coordinates
    	int a= 0;
    	int b= 0;

        // squared distance variables 
        double x1= 0;
        double y1= 0;
        double x2= 0;
        double y2= 0;
        double xDistance= 0;
        double yDistance= 0;
    	double ecludian= 0;

    	System.out.println("("+a+","+b+")");

		for (int j=0; j < n; j++) {
		int random = (int)(Math.random() * range) + min;
			if (random == 1) {
				b += 1;
			}
			if (random == 2) {
				a += 1;
			}
			if (random == 3) {
				b -= 1;
			}
			if (random == 4) {
				a -= 1;
			}
			if (j == n-1) {
				x2= a;
				y2= b;
			}
    	System.out.println("("+a+","+b+")");
    	}

    xDistance= Math.pow((x2-x1),2);
    yDistance= Math.pow((y2-y1),2);
    ecludian= xDistance + yDistance;
    System.out.println("Squared distance = "+ecludian);
    }
}
