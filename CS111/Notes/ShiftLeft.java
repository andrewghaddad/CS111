public class ShiftLeft {
	public static void main(String[] args) {

		int[] array= {4, 7, 19, 13};

		for(int i=0; i <= array.length-2; i++) {

			array[i +1]= array[i];
			System.out.println(array[i]);
		}
		array[array.length -1]= array[0];
		System.out.println(array[array.length-1]);

	}
}