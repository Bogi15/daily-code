//leetcode 1694
class Solution {
    public String reformatNumber(String number) {
    int len = number.length();
    Queue<Integer> queue = new LinkedList<Integer>();
    for (int i = 0; i < len; i++) {
        char c = number.charAt(i);
        if (Character.isDigit(c)) {
            int n = c - '0';
            queue.add(n);
        }
    }

    int size = queue.size();
    String ans = "";
    int br = 0;
    while (!queue.isEmpty()) {
        if (size % 3 == 1) {
            for (int i = 0; i < (size / 3) - 1; i++) {
                while (br != 3 && !queue.isEmpty()) {
                    ans = ans + queue.remove();
                    br++;
                }
                if (br == 3 && !queue.isEmpty()) {
                    ans = ans + "-";
                    br = 0;
                }
            }
            int j = 0;
            for (int i = 0; i < 4 && !queue.isEmpty(); i++) {
                if (j != 2) {
                    ans = ans + queue.remove();
                    j++;
                }
                if (j == 2 && !queue.isEmpty()) {
                    ans = ans + "-";
                    j = 0;
                }
            }
        } else {
            while (!queue.isEmpty()) {
                while (br != 3 && !queue.isEmpty()) {
                    ans = ans + queue.remove();
                    br++;
                }
                if (br == 3 && !queue.isEmpty()) {
                    ans = ans + "-";
                    br = 0;
                }
            }
        }
    }
    return ans;
  }
}
