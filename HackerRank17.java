//https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.util.*;
public class HackerRank17 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        String B = String.valueOf(sb);
        System.out.println(A.equals(B) ? "Yes" : "No");

    }
}
