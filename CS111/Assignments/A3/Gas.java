/*************************************************************************
 *  Compilation:  javac Gas.java
 *  Execution:    java Gas 3.40 15.0 true
 *
 *  @author: Andrew Haddad andrew.gh@rutgers.edu 179009180
 *
 * The program Gas computes and displays the price a
 * person will pay for gas at the gas station.
 *
 *  % java Gas 3.40 15.0 false
 *  56.1
 *
 *  % java Gas 3.40 15.0 true
 *  51.0
 *
 *************************************************************************/

public class Gas {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    
    double price= Double.parseDouble(args[0]);
    double gas= Double.parseDouble(args[1]);
    boolean cash= Boolean.parseBoolean(args[2]);

    double total=0;
    double subtotal=0;


    if (gas <= 0 || price <= 0){
    	System.out.println("Illegal input");
    } else if (cash== false) {
        subtotal= gas * price;
        total= (subtotal * .10) + subtotal;
        System.out.println(total);
    } else {
        subtotal= gas * price;
        System.out.println(subtotal);
    }

    }
}

