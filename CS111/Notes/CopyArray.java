public class CopyArray {
	public static void main( String[] args) {

		// declaring and allocating space for array 1
		double[] array1= new double[5]; 

		array1[0]= 5.6;
		array1[1]= 2.5;
		array1[2]= 7.9;
		array1[3]= 82.3;
		array1[4]= 6.23; // last index is array1.length -1


		double[] array2= new double[array1.length];


		// array1= array2; => THIS IS NOT CORRECT WAY TO COPY VALUES OF ARRAYS

		for (int i=0; i < array1.length; i++){
			array2[i]= array1[i];
		}

		// Display all values of an array 
		// must traverse through each index of array 


		for(int i=0; i < array1.length; i++) {
			System.out.println(i+ " = "+array2[i]);
		}

	}
}