//https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank24 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern pat = Pattern.compile("<(.+)>([^<>]+)</(\\1)>");
        while(testCases>0){
            String line = in.nextLine();
            //Write your code here
            Matcher m = pat.matcher(line);
            if(m.find()){
                m.reset();
                while(m.find()){
                    System.out.println(m.group(2));
                }
            }else{
                System.out.println("None");
            }
            testCases--;
        }
    }
}
