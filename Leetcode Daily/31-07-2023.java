//leetcode 1299
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = Integer.MIN_VALUE;
        int a[] = new int [arr.length];
         for (int i = arr.length - 1; i >= 0; i--) {
            if(i==arr.length-1){
                a[i]=-1;
                max=arr[i];
            }
            else{
                a[i] = max;
                max = Math.max(max, arr[i]);
            }
        }
        return a;
    }
}
