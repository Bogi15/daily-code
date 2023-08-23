//leetcode 905
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int result []= new int [nums.length];
        Stack<Integer> stack = new Stack<Integer>();
        int index=0;
        for(int num : nums){
            if(num%2==0){
                result[index]=num;
                index++;
            }
            else{
                stack.push(num);
            }
        }
        while(!stack.empty()){
            result[index]=stack.pop();
            index++;
        }
        return result;
    }
}
