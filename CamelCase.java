/*
CamelCase
https://www.hackerrank.com/challenges/camelcase/submissions/code/353939178
*/
class Result {

    public static int camelcase(String s) {
     int count = 1 ;
     for(char c : s.toCharArray()){
         if(c >= 65 && c <=91){
             count++;
         }
     }
     return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
