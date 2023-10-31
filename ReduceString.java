
/*
Super Reduced String
https://www.hackerrank.com/challenges/reduced-string/submissions/code/354220407
*/
class Result {


    public static String superReducedString(String s) {
   
      for(int i=0;i<s.length()-1;i++){
          
          if(s.charAt(i)==s.charAt(i+1)){
              s = s.replace(s.substring(i,i+2),"");
              i = -1 ; 
          }
          
      }
      if(s.isEmpty()){
          return "Empty String";
      }
      else{
          return s;
      }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
