//leetcode 2535
class Solution {
    int sum=0;
    int digit_sum=0;
    public int differenceOfSum(int[] nums) {
        for(int num : nums){
            sumOfElements(num);
            sumOfNumbers(num);
        }
        return Math.abs(sum-digit_sum);
    }
    public void sumOfElements(int x){
        sum += x;
    }
    public void sumOfNumbers(int x){
        while(x!=0){
            digit_sum += x % 10;
            x /= 10;
        }
    }
}
