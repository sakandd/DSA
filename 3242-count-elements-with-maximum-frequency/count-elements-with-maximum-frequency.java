class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[]arr = new int[101];
        int maxFreq = 0;
        int total = 0;
        for(int num:nums){
            arr[num]++;
            int freq = arr[num];
            if(freq >maxFreq){
                maxFreq = freq ;
                total = freq;
            }
            else if(freq == maxFreq){
                total+=freq;

            }

        }
        return total;
        
    }
}