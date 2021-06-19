/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author: Andrew Haddad andrew.gh@rutgers.edu 179009180
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {
    public static void main (String[] args) {

    	int n= Integer.parseInt(args[0]);
        boolean[][] arr= new boolean [n][n];
    	
        arr[0][0]=true;
        

        for(int m=1; m < n ; m+=m) {
            for (int i=0 ; i < m ; i++) {
                for (int j=0; j < m ; j++) {
                    arr[i+m][j]= arr[i][j];
                    arr[i][j+m]= arr[i][j];
                    arr[i+m][j+m]= !arr[i][j]; 
                }
            }
        }

        
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr.length; j++) {
                if (arr[i][j]== true) {
                    System.out.print("T ");
                } else {
                    System.out.print("F ");            
                }
            }
            System.out.println();
        }
    }
}

