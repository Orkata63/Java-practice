//https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.util.*;

public class HackerRank37 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        for ( int i = 0; i < M; i++){
            scan.nextLine();
            String com = scan.next();
            int c1 = scan.nextInt();
            int c2 = scan.nextInt();
            if ( com.equals("AND") && ( c1 == 1)){
                B1.and(B2);
            }
            if ( com.equals("OR") && ( c1 == 1)){
                B1.or(B2);
            }
            if ( com.equals("XOR") && ( c1 == 1)){
                B1.xor(B2);
            }
            if ( com.equals("SET") && ( c1 == 1)){
                B1.set(c2, true);
            }
            if ( com.equals("FLIP") && ( c1 == 1)){
                B1.flip(c2);
            }
            if ( com.equals("AND") && ( c1 == 2)){
                B2.and(B1);
            }
            if ( com.equals("OR") && ( c1 == 2)){
                B2.or(B1);
            }
            if ( com.equals("XOR") && ( c1 == 2)){
                B2.xor(B1);
            }
            if ( com.equals("SET") && ( c1 == 2)){
                B2.set(c2, true);
            }
            if ( com.equals("FLIP") && ( c1 == 2)){
                B2.flip(c2);
            }
            System.out.printf("%s %s\n", B1.cardinality(), B2.cardinality());
        }
    }
}
