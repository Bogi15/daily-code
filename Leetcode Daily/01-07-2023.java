class Solution {
    public String firstPalindrome(String[] words) {
     for(String x: words){
        StringBuffer y = new StringBuffer(x);
        y.reverse();
        String z = y.toString();
        if(x.equals(z)){
            return x;
        }
     }  
     return "";   
      }
}
