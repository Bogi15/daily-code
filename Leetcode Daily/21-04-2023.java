//leetcode 1945
class Solution {
    public static int getLucky(String s, int k) {
	     	int sum=0;
            StringBuilder n=new StringBuilder();
            for(int i=0;i<=s.length()-1;i++){
                n.append(s.codePointAt(i)-96);
            }
            while(k>0){
	            sum=0;
	            for (int i=0;i<=n.length()-1;i++)
		            sum+=n.charAt(i)-'0';
	                n=new StringBuilder(String.valueOf(sum));
	            k--;
            }
            return sum;
	    }  
}
