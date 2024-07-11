class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;  // Initialize count for each element
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;  // Increment count if we find a match
                }
            }
            if (count == 1) {
                return nums[i];  // Return the element if it appears only once
            }
        }
        return -1;  // Return -1 if no single number is found (should not happen as per problem constraints)
    }
}