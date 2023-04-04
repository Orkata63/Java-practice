//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.util.*;

public class HackerRank19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] tokens = s.trim().split("[!,?._'@ ]+");
        System.out.println(tokens.length == 0 || tokens[0].isEmpty() ? "0" : tokens.length);
        /* logic used to counter specific test cases */
        for ( String token : tokens ){
            System.out.println(token);
        }
        
    }
}
