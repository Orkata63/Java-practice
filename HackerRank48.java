//https://www.hackerrank.com/challenges/simple-addition-varargs/problem?isFullScreen=true
package hackerrank;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Add{
    public void add(int... numbers){
        int sum = numbers[numbers.length-1];
        for (int i = 0; i < numbers.length-1;i++){
            System.out.print(numbers[i]+"+");
            sum+=numbers[i];
        }
        System.out.println(numbers[numbers.length-1]+"="+sum);
    }
}
public class HackerRank48 {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
