public class TestPicture { // instantiating an object of type picture (instantiating a picture)
	
	public static void main (String[] args) {
		
		// p is reference variale to a type picture 
		Picture p= new Picture (args[0]);

		// show method from pciture class that displays the image
		p.show();

		// can take in two instancs of same class type
		Picture v= new Picture (args[1]);
		v.show();

	}
}