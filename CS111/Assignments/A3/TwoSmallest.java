/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author: Andrew Haddad andrew.gh@rutgers.edu 179009180
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE

		double smallest=Double.MAX_VALUE;
     	double smallest2=Double.MAX_VALUE;
    	double number=0;

		for (int i=0; i < args.length; i++) {

			double values= Double.parseDouble(args[i]);

    		if (values < smallest) {
    			smallest2= smallest;
                smallest= values;
            }
        	
            else if (smallest < smallest2) {
    			number=smallest2;
    			smallest2=smallest;
    			smallest=number;
            }

            else if (smallest > smallest2) {
                number= smallest2;
                smallest2= smallest;
                smallest= number;
            }
            
            else if (values < smallest2 && values != smallest) {
                smallest2= values;
            }
		}
	   System.out.println(smallest);
       System.out.println(smallest2);
    }
}
