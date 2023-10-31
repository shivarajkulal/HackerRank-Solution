/*
Java String Tokens
https://www.hackerrank.com/challenges/java-string-tokens/submissions/code/353825099
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.trim().isEmpty()) {
        System.out.println("0");
        } 
        else{
        String delimiter = "[ !,?._'@]+";
        String[] array = s.trim().split(delimiter);
        System.out.println(array.length);
        for(String str : array)
        System.out.println(str);
        } 
        scan.close();
    }
}

