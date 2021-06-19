public class TVGuide {
	public static void main (String[] args) {

		StdOut.print("Enter the number of channels: ");
		int nbrChannels = StdIn.readInt();

		while ( nbrChannels < 1 ) {
			// making sure the user inputs the number of channels > 1
			StdOut.print("Enter a value > 1: ");
			nbrChannels = StdIn.readInt();
		}

		String[] tvGuide = new String[nbrChannels];
		boolean quit = false;

		do {

			StdOut.print("Option [1]-add channel, [2]-exit, [3]-lookup by name");
			int option = StdIn.readInt();
			if ( option == 1 ) {
				StdOut.print("Enter channel number to add: ");
				int nbr = StdIn.readInt();
				StdOut.print("Enter channel name to add: ");
				String name = StdIn.readString();

				add(tvGuide, nbr, name);
			} else if ( option == 2 ) {
				quit = true;
			} else if ( option == 3) {
				StdOut.print("Enter channel name: ");
				String name = StdIn.readString();
				int channelNbr = lookupByName(tvGuide, name);
				StdOut.println("Channel " + name + " is at " + channelNbr);
			} else {
				StdOut.println(option + " not available");
			}
		} while ( quit == false );
	}

	public static int lookupByName (String[] guide, String name) {

		for (int i = 0; i < guide.length; i++) {
			if ( name.equals(guide[i]) ) {
				// found name in the array guide at index i
				return i;  // return the index
			}
		}
	}

	public static void add (String[] guide, int channelNbr, String channelName) {

		if ( channelNbr < guide.length && channelNbr >= 0 ) {
			// channelNbr is withing the bounds of the array
			// add channelName to the index channelNbr
			guide[channelNbr] = channelName;
		}
	}

}