//leetcode 492
class Solution {
      public int[] constructRectangle(int area) {
      int[] arr = new int[2];
      int Diff = 10_000_001;
      for (int L = 1; L <= area; L++) {
         int W = (area / L);
         if (L * W == area && L >= W && L - W < Diff) {
            arr[0] = L;
            arr[1] = W;
            Diff = L - W;
        }
    }
    return arr;
  }
}
