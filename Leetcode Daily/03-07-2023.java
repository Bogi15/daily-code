//leetecode 345
class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            if (vowels.contains(chars[left] + "") && vowels.contains(chars[right] + "")) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            } else if (vowels.contains(chars[left] + "")) {
                right--;
            } else {
                left++;
            }
        }

        return new String(chars);
    }
}
