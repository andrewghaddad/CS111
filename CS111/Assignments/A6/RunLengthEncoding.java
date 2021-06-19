/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author: Andrew Haddad andrew.gh@rutgers.edu 179009180
 *
 *************************************************************************/

public class RunLengthEncoding {

    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original)  {

	// WRITE YOUR CODE HERE

    String result= "";
    int count=1;
    if(original.length() == 1) {
        return original;
    }
    for(int i=0; i <= original.length()-2;i++) {
        if(i== original.length()-2) {
            if(original.charAt(i)== original.charAt(i+1)) {
                count++;
                result=result+count+original.charAt(i);
                break;
            }
            else {
                if(count == 1)
                    result=result+original.charAt(i)+original.charAt(i+1);
                else
                    result = result+ count + original.charAt(i) + original.charAt(i+1);
                break;
            }
            
        }
        if(original.charAt(i)== original.charAt(i+1)) {
            count++;
        }
        else {
            if(count==1) {
                result=result+ original.charAt(i);
            } else {
                result=result+count+original.charAt(i);
                count=1;
            }
        }
    }
    return result;
}
    
    /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, 
     * or for loops
     */
    // public static String decode (String original)  {
        
    //     String result="";
    //     char L2= original.charAt(original.length()-2);
    //     char L1= original.charAt(original.length()-1);
    //     int intL2= L2 - '0';
    //     if (original.length() == 0) {
    //         return "";
    //     }
    //     if (original.length() ==1) {
    //         return original;
    //     } else {
    //         String c= Character.toString(L1); // the character you will be appending 
    //     }
    //     else if (Character.isDigit(original.charAt(original.length()-2)) == true) {
    //         int intL2= L2 - '0';
    //         result = result + c;
    //         intL2--;
    //     } else {
    //         result= result + c;
    //         return decode(original.substring(0,original.length()-1));
    //     }
    //     else if (intL2 == 0) {
    //         return result +decode(original.substring(0,original.length()-2));   
    //     }
    //     return result;
    // }

    public static void main (String[] args) {

	// WRITE YOUR TEST CASES HERE to test your methods
        //StdOut.println("Enter string: ");
        StdOut.println("Enter string: ");
        String original= StdIn.readString();

        // String result= encode(original);
        // StdOut.println(result);

        // String result2= decode(result);
        // StdOut.println(result2);
    }
}
