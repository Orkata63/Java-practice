//https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        int count = 0;
        for (int j = 0; j <= n; j++) {
            for (int k = j+1; k <= n; k++) {
                if (Arrays.stream(Arrays.copyOfRange(arr, j, k)).sum() < 0)
                    count++;
                }
            }
        System.out.println(count);
        }

}

