/*************************************************************************
 *  Compilation:  javac TrainTicket.java
 *  Execution:    java TrainTicket
 *
 *  @author: Andrew Haddad andrew.gh@rutgers.edu 179009180 
 *
 * The program TrainTicket takes two command-line arguments: an int
 * referring to the persons age and a boolean referring to whether or
 * not the ticket was bought at the train station (true for a ticket
 * bought at the train station). The program computes and displays the
 * ticket price the person needs to pay for the train ride.
 *
 *  % java TrainTicket 23.0 true
 *  13.20
 *
 *  % java TrainTicket 23.0 false
 *  15.84
 * 
 *  % java TrainTicket 230 false
 *  Illegal input
 *
 *************************************************************************/

public class TrainTicket {

    public static void main(String[] args) {

    	int age= Integer.parseInt(args[0]);
        boolean station = Boolean.parseBoolean(args[1]);
        
        double childP=0.00;
        double adultP=13.20;
        double seniorP=7.50;

        if (!(age >= 0 && age <= 120)) {
            System.out.println("Illegal input");
        }

        else if (age >=0 && age < 7) {
            System.out.println(childP);
        }

        else if (age >= 7 && age <= 65){
            if (station == true) {
                System.out.println(adultP);
            } else {
                adultP+= (adultP* .20);
                System.out.println(adultP);
            }
        }

        else if (age > 65) {
            if (station == true) {
                System.out.println(seniorP);
            } else {
                seniorP+= (seniorP * .20);
                System.out.println(seniorP);
            }
        }
    }
} 