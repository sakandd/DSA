class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count = 0;
        int[] res = new int[nums.length];

        // First pass: Add elements less than pivot
        for (int num : nums) {
            if (num < pivot) {
                res[count++] = num;
            }
        }

        // Second pass: Add elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                res[count++] = num;
            }
        }

        // Third pass: Add elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                res[count++] = num;
            }
        }

        return res;
    }
}