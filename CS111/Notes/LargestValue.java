public class LargestValue {
	public static void main(String[] args) {

		// find largest valuein an array 
		double[] array= new double [100];

		// populating array 
		for (int i=0; i < array.length; i++) {
			array[i]= Math.random();
		}

		// display array vlaues
		for (int i= 0; i < array.length; i++) {
			System.out.println(i+" = "+array[i]);
		}

		// find largest value in array 
		double largest= 0.0;
		double largestIndex= 0.0;
		for(int i=0; i <array.length; i++) {
			if (largest < array[i]){
				largest= array[i];
				largestIndex=i;
			}
		}

		System.out.println("largest"+i+" = "+largest);
	}
}
