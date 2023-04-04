//https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
package hackerrank;
import com.sun.corba.se.spi.activation.ServerOperations;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.net.SocketPermission;
import java.util.*;
public class HackerRank14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.charAt(0) > B.charAt(0) ? "Yes" : "No");
        System.out.printf("%s %s", A.substring(0,1).toUpperCase() + A.substring(1), B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
