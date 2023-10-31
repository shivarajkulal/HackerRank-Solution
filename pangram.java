/*
Pangrams
https://www.hackerrank.com/challenges/pangrams/submissions/code/353939822
*/
class Result {

    public static String pangrams(String s) {
    String plain = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String ans = "pangram";
    for(char c='a';c<='z';c++)
    {
    if(!plain.contains(""+c))
    {
        ans="not pangram";
        break;
    }
    }
     return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
