// have to import Color Class
import java.awt.Color;

public class Turtle {
	
	// INSTANCE VARIABLES: unique in value to each object

	// made private so that client isnt able to move coordinates

	// the private modifier hides instance variable or instance methods from other classes
	// so they are onlyvisible inside the class

	// (x,y) coordinates
	private double x;
	private double y;

	// direction turtle is facing
	private double angle; 

	// defines the turtles path color
	private Color color;

	// Static variable is viible and accessible by every turtle object 
	// but there is only one variable that resides in the class
	static int numberOfTurtles;

	// CONSTRUCTOR: responsible for initializing instance variables

	// default constructor (no arguments constructor)
	public Turtle () {
		x = y = 0.0;
		angle = 90.0;
		color= StdDraw.BLACK;
		numberOfTurtles += 1; // don't need "Turtles." bc variable is inside this class 
	}
	
	// 3 argument constructor to initialize turtle to position and orientation
	public Turtle (double x, double y, double angle, Color color) {

		// this method refers to istance variable that belongs to this object
		// refers to either method or instance variable of object 
		//(if inside object and pointing to one of instance method)
		this.x = x;
		this.y = y;
		this.angle = angle;
		this.color= color;
	}

	// equals comares two objects of same type
	public boolean equals (Object other) {

		if (!(other instanceof Turtle)) {
			return false;
		}
		Turtle o= (Turtle)other; //cast other as a turtle 
		return (o.x == x) && (o.y == y) && (o.color == color);
	}

	// to String method returns the sring description of an object 
	public String toString () {
		return "turtle position ("+x+","+y+") & angle: "+angle;
	}

	// access methods for readings
	public double getX () {
		return x;
	}

	public double getY () {
		return y;
	}

	public Color getColor () {
		return color; 
	}

	// turns the turtle left 
	public void turnLeft (double delta) {
		angle += delta;
	}

	public void moveFoward (double d) {

		double oldx= x;
		double oldy= y;

		x+= d * Math.cos(Math.toRadians(angle));
		y+= d * Math.cos(Math.toRadians(angle));

		StdDraw.setPenColor(color);
		StdDraw.line(oldx, oldx, x, y);
	}

	public static void main(String[] args) {
			
		Turtle t1= new Turtle (0.0, 0.0, 0.0, StdDraw.CYAN); // instantiating new turtle
		t1.moveFoward(1.0);
		t1.turnLeft(120.0);
		t1.moveFoward(1.0);
		t1.turnLeft(120.0);
		t1.moveFoward(1.0);
		t1.turnLeft(120.0);

		System.out.println("number Of Turtles= "+numberOfTurtles);
	}
}