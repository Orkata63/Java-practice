//https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.util.*;
public class HackerRank10 {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in);
    public static int B = scan.nextInt();
    public static int H = scan.nextInt();
    
    public static void main(String[] args) {
        try{
            if ( B > 0 && H > 0){
                System.out.println(B*H);
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
           System.out.print(e);        
        }
        
    }
}
            
        
            
        

