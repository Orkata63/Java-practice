//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
package hackerrank;
import java.util.HashMap;
import java.util.Scanner;

public class HackerRank18 {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.toLowerCase().equals(b.toLowerCase()))
            return true;
        /* This is for a quick exit if the words are the same*/
        if (a.length() != b.length())
            return false;
        /* another quick exit in case we don`t have same length words*/
        a = a.toLowerCase();
        b = b.toLowerCase();
        HashMap<Character,Integer> listA = new HashMap<Character,Integer>();
        HashMap<Character,Integer> listB = new HashMap<Character,Integer>();
        for (int i = 0; i < a.length(); i++){
            if (listA.containsKey(a.charAt(i))){
                listA.put(a.charAt(i), listA.get(a.charAt(i))+1);
            } else {
                listA.put(a.charAt(i), 1);
            }
            if (listB.containsKey(b.charAt(i))){
                listB.put(b.charAt(i), listB.get(b.charAt(i))+1);
            } else {
                listB.put(b.charAt(i), 1);
            }
        }
        return listA.equals(listB);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
