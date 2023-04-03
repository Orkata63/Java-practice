//https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank3 {

    /**
     * @param args the command line arguments
     */
        private static final Scanner scan = new Scanner(System.in);
        
    public static void main(String[] args) {
        // TODO code application logic here
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scan.close();
        if  ((N % 2 == 0)&&( N<6 || N>20)){
            System.out.println("Not Weird");        
        }else{
            System.out.println("Weird");
        }
            
        
            
        
    }
    
}
