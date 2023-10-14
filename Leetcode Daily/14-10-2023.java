//leetcode 2644
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=-1,result=0;
        for(int i=0;i<divisors.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] % divisors[i] == 0 ) count ++;
            }
            if(count>max){
                max = count;
                result = divisors[i];
            }else if (count == max ){
                result = Math.min(result,divisors[i]);
            }
        }
        return result;
    }
}
