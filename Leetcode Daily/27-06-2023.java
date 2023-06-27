//leetcode 2390
class Solution {
    public String removeStars(String s) {
      Stack<Character> stack = new Stack<Character>();  
      StringBuilder str = new StringBuilder();
      int stars=0;
      String new1="";
      for(char c : s.toCharArray()){
          if(c == '*'){
              if(!stack.isEmpty()){
                  stack.pop();
              }
          }
          else{
              stack.push(c);
          }
      }
       while(!stack.isEmpty()){
         str.append(stack.pop());
       }
       return str.reverse().toString();
    }
}
