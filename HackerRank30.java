//https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HackerRank30 {
    public static void main(String[] args){
/*        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();


        BigInteger num = new BigInteger(s);
        System.out.println(num.isProbablePrime(2)? "prime" : "not prime");*/
//      Solution for website didnt work in my IDE
        Scanner scan = new Scanner(System.in);

        BigInteger num = scan.nextBigInteger();

        System.out.println(num.isProbablePrime(2)? "prime" : "not prime");
    }
}
