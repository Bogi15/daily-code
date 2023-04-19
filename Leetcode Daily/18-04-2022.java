//leetcode 2496 
class Solution {
   public int maximumValue(String[] strs) {
        int max=0; //this will be the end result of the program
        //we will need 2 temporary integers where we will store the size of given strings
        int tem_max1=0;
        int tem_max2=0;
        int n = strs.length;
        //the most important part into solving the problem is to find if the string is only digit-we do this using Character.isDigit(c) while separating the sting into chars
        for (int i = 0; i < n; i++) {
            boolean t = true;
            for (int j = 0; j < strs[i].length(); j++) {
                char c = strs[i].charAt(j);
                if (!Character.isDigit(c)) {
                    t = false;
                    break;
                }
            }
            if (t) {
                tem_max2 = Integer.parseInt(strs[i]);
            } else {
                tem_max2 = strs[i].length();
            }
            if (tem_max2 > tem_max1) {
                tem_max1 = tem_max2;
                max = tem_max1;
            }
        }
        return max;
    }
}
