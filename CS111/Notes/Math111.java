public class Math111 {
	
	// writing methods
	public static double Sum(double n1, double n2) {

		double total= n1+n2;
		return total; // returns value of variable total to the call method
	}

	public static void main (String[] args){

		double a= 3.7;
		double b= 2.1;
		double c= Sum(a,b);
		System.out.println(c);
		System.out.println(Sum(1.1,2.2));
	}

}