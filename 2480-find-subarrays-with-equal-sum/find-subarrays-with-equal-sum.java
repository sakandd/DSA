class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer>seenSum = new HashSet<>();
        for(int i = 0; i<=n-2;i++){
            int sum = nums[i]+nums[i+1];
            if(seenSum.contains(sum)){
                return true;
            }
            seenSum.add(sum);
        }
        return false;
        
    }
}