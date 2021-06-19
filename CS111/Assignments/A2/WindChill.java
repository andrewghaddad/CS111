/*************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill 35.0 10.0
 *
 *  @author: Andrew Haddad andrew.gh@rutgers.edu 179009180
 *
 *  That takes two double command-line arguments temperature and velocity 
 *  and prints the wind chill (a double) according to the following:
 *
 *  w = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) v^0.16
 *
 *  % java WindChill 35.0 10.0
 *  27.445420765619037
 *
 *  The formula is not valid if T is larger than 50 in absolute value or if 
 *  v is larger than 120 or less than 3.
 *
 *  Assume the inputs are valid values
 *
 *
 *************************************************************************/

public class WindChill {

    public static void main (String[] args) {

		// WRITE YOUR CODE HERE
		double temperature= Double.parseDouble(args[0]);
		double velocity= Double.parseDouble(args[1]);
		double v= Math.pow(velocity, 0.16);

		double w=0;

		while (temperature < Math.abs(-50) || temperature < Math.abs(50) || velocity <= 120 && velocity >= 3) {
			w= 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * v;
			System.out.println(w);
			break;
		}
    }
}
