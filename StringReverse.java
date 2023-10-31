/*
Java String Reverse
https://www.hackerrank.com/challenges/java-string-reverse/problem
*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int first=0;
        int last=A.length()-1;
        if(A.charAt(first)!=A.charAt(last)){
            System.out.println("No");   
        }
        else{
            System.out.println("Yes");
        }
        
    }
}



