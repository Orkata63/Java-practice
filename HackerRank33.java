//https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
package hackerrank;
import java.util.*;
import java.io.*;
public class HackerRank33 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,Integer> phonebook = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phonebook.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            System.out.println(phonebook.containsKey(s) ? s+"="+phonebook.get(s) : "Not found");
        }
    }
}
