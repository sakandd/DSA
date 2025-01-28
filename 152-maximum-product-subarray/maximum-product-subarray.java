class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        // Iterate through each starting index of the subarray
        for (int i = 0; i < n; i++) {
            int currentProduct = 1;

            // Iterate through each ending index of the subarray
            for (int j = i; j < n; j++) {
                currentProduct *= nums[j];
                
                // Update maxProduct with the maximum value found
                maxProduct = Math.max(maxProduct, currentProduct);
                if(currentProduct == 0){
                    currentProduct = 1;
                }
            }
        }
        
        return maxProduct;
    }
}