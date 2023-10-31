/*
Java Substring
https://www.hackerrank.com/challenges/java-substring/problem
*/
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String string_S = S.substring(start,end);
        System.out.println(string_S);
    }
}