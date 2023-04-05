//https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank29 {
    public static void main( String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for ( int i = 0; i < n; i++){
            ArrayList<Integer> tempArr = new ArrayList<Integer>();
            int n1 = scan.nextInt();

            for (int j=0; j<n1;j++ ){
                tempArr.add(scan.nextInt());
            }

            arr.add(tempArr);
        }
        System.out.println(arr);
        int n2 = scan.nextInt();
        for (int k = 0; k < n2;k++  ){
            int row = scan.nextInt();
            int col = scan.nextInt();
            try{
                System.out.println(arr.get(row-1).get(col-1));
            } catch  (Exception e){
                System.out.println("ERROR!");
            }
        }


    }
}
