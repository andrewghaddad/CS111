public class TestingStrings {
	
	public static void main(String[] args) {
		
		// instantiate (creating object of type string) a string 
		String s1 = new String("Chocolate cake");
		String s2 = new String("Cookie dough");
		String s3 = new String("chocolate cake"); // not the same string as s1

		
		// compares addresses ONLY
		if (s1 == s2) {
			StdOut.println("The two strings have the SAME addresses");
		} else {
			StdOut.println("The two strings have DIFFERENT addresses");
		}

		// compares if STRINGS are the same
		if(s1.equals(s2)) {
			StdOut.println("string s1-"+s1+"and string s2-"+s2+"are equal");
		} else {
			StdOut.println("The two strings have DIFFERENT strings");
		}

		// prints each chacter in the string
		for (int i=0; i < s1.length(); i++) { // s1.length() has "()" bc since NOT primitive
											  // data type, .length() is a method within string class.
			StdOut.println(s1.charAt(i));
		}

		/*
		s3= s1; // this
		if (s3== s1) {
			boolean b= true;
			StdOut.print(b); // WILL PRINT TRUE BC U MADE BOTH ADDRESSES
		}					 // THE SAME, BUT THAT DOESNT MEAN THE STRINGS
							 // ARE ACUALLY THE SAME - > THIS CAN FOOL YOU!
		*/


		}


	}
}