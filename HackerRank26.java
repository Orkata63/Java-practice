//https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank26 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        int max = -1000000; //some cases had - max
        for (int x = 1; x < 5; x++){
            int pMax = 0;
            for ( int y = 1; y < 5; y++ ){
                pMax = (arr.get(x-1).get(y-1) + arr.get(x-1).get(y) + arr.get(x-1).get(y+1) + arr.get(x).get(y) + arr.get(x+1).get(y-1) + arr.get(x+1).get(y) + arr.get(x+1).get(y+1));
                if ( pMax >= max )
                    max = pMax;
            }
        }
        System.out.println(max);
    }
}
