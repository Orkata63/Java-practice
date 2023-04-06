//https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.util.*;
public class HackerRank32 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for ( int i = 0; i < N; i++){
            arr.add(scan.nextInt());
        }
        int Q = scan.nextInt();
        for ( int j = 0; j < Q; j++) {
            String com = scan.next();
            if (com.equals("Insert"))
                arr.add(scan.nextInt(), scan.nextInt());
            if (com.equals("Delete"))
                arr.remove(scan.nextInt());


        }
        for ( int num : arr){
            System.out.print(num+" ");
        }

    }
}
