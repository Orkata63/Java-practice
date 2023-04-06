//https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.util.*;
public class HackerRank45 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a/b);
        } catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            scan.close();
        }
    }
}
