/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Andrew Haddad andrewgh@rutgers.edu 179009180
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

	// WRITE YOUR CODE HERE

       double h= Math.sqrt(3) / 2 * (length);
       return h;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    // takes in point and you have to code for the other three points then call Std.Fill method in BLACK
    public static void filledTriangle(double x, double y, double length) {

	// WRITE YOUR CODE HERE
    StdDraw.setPenRadius();
    StdDraw.setPenColor(StdDraw.BLACK);

    double h = height(length);
    double[] c1= {x,x + length/2,x - length/2};
    double[] c2= {y,y+ (h),y+ (h)};

    StdDraw.filledPolygon(c1,c2);


    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

	// WRITE YOUR CODE HERE
    double h= height(length);


        if(n==0) {
            return;
        // }
        // if (n==1) {
        //     filledTriangle(x,y,length);
        } else {
            filledTriangle(x,y,length);
            sierpinski(n-1,x, y+(h), length/2);
            sierpinski(n-1, x - length /2,y, length/2);
            sierpinski(n-1, x + length /2,y, length/2);

        }
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

        // Takes an integer command-line argument n; 
        int n= Integer.parseInt(args[0]);

        // finds height
        double length=1.0;
        double h = height(length);

        // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
        StdDraw.setPenColor(StdDraw.BLACK);
        double[] xo= new double[] {0,1,0.5};
        double[] yo= new double[] {0,0,h};
        StdDraw.polygon(xo,yo);

        double x= length/2;
        double y= 0;

        //double[] c1= {x,x + (length/2),x- (length/ 2)};
        //double[] c2= {y,y+ (h/2),y- (h/2)};
        //StdDraw.filledPolygon(c1,c2);

        sierpinski(n,x,y,length/2);

        //filledTriangle(x,y,length);

    }
}
