//leetcode 1502
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dif = arr[1]-arr[0];
        for(int itr = 2; itr < arr.length; itr++){
            if(arr[itr]-arr[itr-1] != dif) return false;
        }
    return true;
    }
}
