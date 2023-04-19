#leetcode 2119
class Solution {
    public boolean isSameAfterReversals(int num) {
      int reverse = 0;
      int reverse_reverse = 0;
      int original = num;
      while (num != 0) {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num/10;
      }
      while(reverse != 0){
        int digit = reverse % 10;
        reverse_reverse = reverse_reverse * 10 + digit;
        reverse = reverse/10;
      }
      if(reverse_reverse == original) return true;
      return false;
  }
}
