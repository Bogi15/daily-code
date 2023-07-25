//leetcode 852
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
          int b[] = Arrays.copyOf(arr,arr.length);
          Arrays.sort(b);
          for(int i=0;i<arr.length;i++){
              if(arr[i]==b[arr.length-1]) return i;
          }
          return 0;
    }
}
