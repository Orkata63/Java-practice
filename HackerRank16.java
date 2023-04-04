//https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
package hackerrank;
import sun.font.TrueTypeFont;

import java.util.Scanner;

public class HackerRank16 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s;
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length()-k+1;i++){
            String s1 = s.substring(i,i+k);
            if ( s1.compareTo(smallest) < 0 )
                smallest = s1;
            if ( s1.compareTo(largest) > 0 )
                largest = s1;
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
