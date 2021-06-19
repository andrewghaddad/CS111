/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Andrew Haddad andrew.gh@rutgers.edu 179009180
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

	// WRITE YOUR CODE HERE
    	if(n==0) {
    		return original;
    	} else {
    		return appendNTimes(original, n-1) +original;
    	}
    }

    public static void main (String[] args) {

	// WRITE TEST CASES HERE to test your method
    	StdOut.println("Enter string: ");
    	String original= StdIn.readString();
    	StdOut.println("Enter number of times appended: ");
    	int n= StdIn.readInt();

    	String strAppended= appendNTimes(original, n);
    	StdOut.println(strAppended);

    }
}
