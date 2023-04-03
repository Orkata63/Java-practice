//https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
package hackerrank;
import java.util.Scanner;

public class HackerRank6 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s %03d\n", s1, x);
            }
            System.out.println("================================");

    }
}
            
        
            
        

