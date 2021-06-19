/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Andrew Haddad andrew.gh2rutgers.edu 179009180
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

	// WRITE YOUR CODE HERE
        double[] arr= new double [array.length];
        for(int i=0; i < array.length; i++) {
            arr[i]=array[i];
        }
        return arr;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

	// WRITE YOUR CODE HERE
        for (int i =0; i < x.length; i++) {
            x[i]= x[i]* alpha;
            y[i]= y[i]* alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	// WRITE YOUR CODE HERE
        for (int i =0; i < x.length; i++) {
            x[i]= x[i] + dx;
            y[i]= y[i] + dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

	// WRITE YOUR CODE HERE
        double xtemp= 0;
        double ytemp= 0;
        
        for (int i =0; i < x.length; i++) {
            xtemp= x[i];
            ytemp= y[i];

            double t= Math.PI/180 * theta;

            x[i]= (xtemp * Math.cos(t)) - (ytemp * Math.sin(t));
            y[i]= (ytemp * Math.cos(t)) + (xtemp * Math.sin(t));
        }   
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

	   //code for copy method
        double[] a= {1,2,3,4,5};

        double[] array1= copy(a);

        for (int i=0; i < a.length; i++) {
            StdOut.println(array1[i]);
        }

        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 

        // // Scales polygon by the factor 2.
        // StdDraw.setScale(-5.0, +5.0); 
        // double alpha = 2.0; 
        // StdDraw.setPenColor(StdDraw.RED); 
        // StdDraw.polygon(x, y); 
        // scale(x, y, alpha); 
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.polygon(x, y);

        // // Translates polygon by (2, 1).
        // StdDraw.setScale(-5.0, +5.0); 
        // double dx = 2.0, dy = 1.0; 
        // StdDraw.setPenColor(StdDraw.RED); 
        // StdDraw.polygon(x, y); 
        // translate(x, y, dx, dy); 
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.polygon(x, y);

        // Rotates polygon 45 degrees. 
        StdDraw.setScale(-5.0, +5.0); 
        double theta = 30; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        rotate(x, y, theta); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);

    }
}
