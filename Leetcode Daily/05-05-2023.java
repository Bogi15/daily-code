//leetcode 925
class Solution {
    public boolean isLongPressedName(String name, String typed) {
    int i = 0, j = 0;
    while (i < name.length() && j < typed.length()) {
        char c = name.charAt(i);
        int count1 = 1;
        while (i < name.length() - 1 && name.charAt(i + 1) == c) {
            count1++;
            i++;
        }
        int count2 = 0;
        while (j < typed.length() && typed.charAt(j) == c) {
            count2++;
            j++;
        }
        if (count2 < count1) {
            return false;
        }
        i++;
    }
    return i == name.length() && j == typed.length();
}
}
