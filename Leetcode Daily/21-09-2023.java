//leetcode 4
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        int z = x + y;
        int k=0;
        int[] nums3 = new int[z];
        for(int i=0;i<x;i++){
            nums3[k++] = nums1[i];
        }
        for(int i=0;i<y;i++){
            nums3[k++] = nums2[i];
        }
        Arrays.sort(nums3);
        if (z % 2 == 0) return (float)(nums3[z/2 - 1] + nums3[z/2])/2.0;
        else return nums3[z/2];
    }
}
