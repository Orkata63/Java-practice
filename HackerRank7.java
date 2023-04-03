//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
package hackerrank;
import java.util.*;
import java.io.*;


public class HackerRank7 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            if ( i != 0)
                System.out.println();
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for ( int j = 0; j < n; j++){
                a+= Math.pow(2, j)* b;
                System.out.print(a+" ");
            }
            
        }
        in.close();
    }
}
            
        
            
        

