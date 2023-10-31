
/*
Java Anagrams
https://www.hackerrank.com/challenges/java-anagrams/problem
*/
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String string_a = a.toLowerCase();
        String string_b = b.toLowerCase();
        if(string_a.length()!=string_b.length()){
            return false;
        }
        char[] array1 = string_a.toCharArray();
     //   char[] array2 = string_b.tocharArray();
        for(char c : array1){
        int index = string_b.indexOf(c);
        if(index!=-1){
    string_b=string_b.substring(0,index)+string_b.substring(index+1,string_b.length());
        }
        else{
            return false;
        }
        }
        return true;
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
