class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set = new HashSet<>();
        int maxlength = 0;
        int left = 0;
        int right =0;
        while(right<s.length()){
            char c =s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                maxlength = Math.max(maxlength , right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlength;
        
    }
}