/*Strong Password  "code snippet"
https://www.hackerrank.com/challenges/strong-password/problem
*/

class Result {

    
    public static int minimumNumber(int n, String password) {
        int count = 0;
        
        List<String> arrlist = new ArrayList<String>(); 
        
        int  min_length = 6;
        
        arrlist.add("0123456789");
        arrlist.add("abcdefghijklmnopqrstuvwxyz");
        arrlist.add("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        arrlist.add("!@#$%^&*()-+");
        
        for(char c : password.toCharArray()){
            int i = 0;
            while(i<arrlist.size()){
                
            if(arrlist.get(i).contains(c + "")){
                
                arrlist.remove(i);
                
            }
            
            else{i++;}
                
            }
            
            
            
        }
        
        return Math.max(arrlist.size(), min_length-password.length());
        
    }

}

