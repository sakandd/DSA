class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer>duplicates = new ArrayList<>();
        for(int num : nums){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }
        return duplicates;
        
    }
}