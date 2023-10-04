//leetcode 119
class Solution {
    public List<Integer> getRow(int rowIndex) {
    int [] a = new int [rowIndex + 1];
    Arrays.fill(a, 0);
    a[0] = 1;
        
    for (int i = 1; i <= rowIndex; i++) {
        for (int j = i; j > 0; j--) {
            a[j] = a[j] + a[j - 1];
        }
    }
    List<Integer> result = new ArrayList<>();
    for (int num : a) {
        result.add(num);
    }
    return result;
    }
  }
