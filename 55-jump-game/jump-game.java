class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n==0){
            return false;
        }
        int lastreachableindex = n-1;
        for(int i = n-2; i>=0;i--){
            if(i+nums[i]>=lastreachableindex){
                lastreachableindex = i;
                 }
            }
            return lastreachableindex == 0;
        
    }
}