//leetcode 860

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten =0;
        Queue <Integer> queue = new LinkedList();
        for(int bill : bills){
            if(bill == 5) five++;
            else if(bill == 10) {
                if(five ==0) return false;
                else {
                    five--;
                    ten++;
                }
                
            }
            else if(bill == 20){
                if(five>=3 && ten==0) {
                    five -= 3;
                } else if(five>0 && ten>0) {
                    ten--;
                    five--;
                }else{
                    return false; 
                }
            }
        }
       return true;
    }
}
