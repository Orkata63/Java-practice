//https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
package hackerrank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class HackerRank21 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

//Write your code here
class MyRegex{
    String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}