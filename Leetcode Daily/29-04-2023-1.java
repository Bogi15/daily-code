//leetcode 1480
class Solution {
    public static int[] runningSum(int[] nums) {
        int arr[]=new int [nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}
