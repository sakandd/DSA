class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
        // Check for every element
        for (int i = 0; i < n; i++) {
            int count = 0;
            
            // Count the frequency of nums[i]
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            
            // If the count is greater than n/3 and the element is not already in result
            if (count > n / 3 && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }
        
        return result;
    }
}
