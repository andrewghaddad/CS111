import java.io.*;
import java.util.*;

class Solution{
    public static void main(String [] args) throws Exception {

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int t = 0; t < n; t++) {
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     System.out.println(a+b);
        // }

        int n= IO.readInt();
        for (int i=0; i <n; i++) {
            int a= IO.readInt();
            int b= IO.readInt();
            System.out.println(a+b);
        }
    }
}