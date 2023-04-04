//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
package hackerrank;
import java.util.*;

public class HackerRank25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for ( int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int number : a) {
            System.out.println(number);
        }
    }
}
