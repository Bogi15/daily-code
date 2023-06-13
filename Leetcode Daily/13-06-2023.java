//leetcode 2383
class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hour = 0;
        for(int i=0;i<energy.length;i++){
                if(initialEnergy<=energy[i]){
                    int dif=energy[i]-initialEnergy;
                    initialEnergy+=dif + 1;
                    hour+=dif+1;
                }
                if(initialExperience<=experience[i]){
                    int dif=experience[i]-initialExperience;
                    initialExperience+=dif+1;
                    hour+=dif+1;
                }
            if(initialEnergy>energy[i]&&initialExperience>experience[i]){
                initialEnergy-=energy[i];
                initialExperience+=experience[i];
            }
        }
        return hour;
    }
}
