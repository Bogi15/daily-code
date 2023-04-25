//leetcode 349
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ans = new int[Math.min(len1, len2)];
        int zero = 0;
        for (int i = 0; i < len1; i++) {
            int num = nums1[i];
            for (int j = 0; j < len2; j++) {
                if (num == nums2[j]) {
                int tmp = num;
                boolean found = false;
                for (int f = 0; f < zero; f++) {
                    if (tmp == ans[f]) {
                        found = true;
                        break;
                        }
                    }
                if (!found) {
                    ans[zero] = tmp;
                    zero++;
                }
            }
        }
    }
    return Arrays.copyOfRange(ans, 0, zero);
    }
}
