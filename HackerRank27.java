//https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class HackerRank27 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BigInteger Bi = scan.nextBigInteger();
        BigInteger Bi1 = scan.nextBigInteger();
        scan.close();
        System.out.println(Bi.add(Bi1));
        System.out.println(Bi.multiply(Bi1));
    }
}
