// Class that we will use objects from Turtle Class; NOT a class that creates an object
public class DrunkenTurtles {

	public static void main(String[] args) {

		int n= Integer.parseInt(args[0]); // instantiates number of turtles
		int trials= Integer.parseInt(args[1]); // number of stepseach turtle will take
		double stepSize= Double.parseDouble(args[2]); // size of step each turtle will make

		// enough space for n turtles but turtles have not been instanciated yet
		Turtle[] turtles = new Turtle[n]; 


		// instantiating turtles 
		for (int i=0; i < n; i++) {
			double x= StdRandom.uniform(0.0,1.0); // same as Math.Random()
			double y= StdRandom.uniform(0.0,1.0);
			turtles[i]= new Turtle(x,y,0.0,StdDraw.MAGENTA); // calling Turtle constructor
		}

		for (int s=0; s < trials; s++) {
			// all turtles take one step 
			for (int i=0; i < n; i++) {
				double angle= StdRandom.uniform(0.0,360);
				turtles[i].turnLeft(angle);
				turtles[i].moveFoward(stepSize);

				System.out.println(turtles[i].toString());

			}
		}
		
	}
}