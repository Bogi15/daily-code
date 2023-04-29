//leetcode 724
class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==0){
                int num=0;
                for(int j=1;j<nums.length;j++){
                    num += nums[j];
                }
                if(0==num) return 0;
            }
            else{
                int num1=0,num2=0;
                for(int j=0;j<i;j++){
                    num1+=nums[j];
                }
                for(int j=i+1;j<nums.length;j++){
                    num2+=nums[j];
                }
                if(num1==num2) return i;
            }

        }
        return -1;
    }
}
