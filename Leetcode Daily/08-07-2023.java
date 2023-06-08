//leetcode 2129
class Solution {
    public String capitalizeTitle(String title) {
        char[] ch = title.toCharArray();
		int len = ch.length;

		for(int i = 0; i < len; ++i) {

			int f = i; 

			while(i < len && ch[i] != ' ') {
				ch[i] = Character.toLowerCase(ch[i]); 
				++i;
			}
			if(i - f > 2) {
				ch[f] =  Character.toUpperCase(ch[f]);
			}
		}

		return String.valueOf(ch); 
    } 
}
