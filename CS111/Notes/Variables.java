
// inline comment , the complier disregards this line

/*
this is a multiline comment
*/

// all java code is to be inside a class
public class Variables {

	// main mathod is an entry point to a program
	public static void main (String[] args){
		int x=3;
		int y=23;
		int z=15;

		int divZbyX= z / x;
		System.out.println("z/x = "+divZbyX); // "+" is appending string to value
												// to make it be a single string

		// an integer / by another interger, results in an integer
		int divYbyX= Y / X;
		System.out.println("y/x="++divYbyX);

		// how can we get the fractional part?
		double divYbyXReal= (y*1.0) / x;
		System.out.println("y/x="+ divYbyXReal);


		int remainder= y % x;
		System.out.println("y%x= "+remainder);

		
		// math class is built in to manguage and does many different mathmatical computations
		// rounding up= ceiling & rounding down= floor
		double ceil= Math.ceil(divYbyXReal);
		System.out.println(" cieling="+ciel);


		System.out.println("sqrt of"+x+"is"+ Math.sqrt(x));
		System.out.println("power of"+x+"is"+ Math.pow(x,2));


		// test boolean expressions 
		boolean a= false; // true or false always in lowercase
		boolean nota= !a; // not a/ negation of a (so this means it is true)
		System.out.println("a:"+a+"nota:"+nota);


		// and= && or= || not= ! => NEXT CLASS!

	}
	
}