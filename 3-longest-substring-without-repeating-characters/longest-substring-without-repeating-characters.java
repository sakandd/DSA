import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        
        return maxLength;
    }
}