class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxRepeatCount = 0;
        int len = s.length();
        Map<Character,Integer> map1 = new HashMap<>();

        for(int right = 0;right<len;right++){
            char curr = s.charAt(right);
            map1.put(curr, map1.getOrDefault(curr, 0)+1);

            maxRepeatCount = Math.max(maxRepeatCount, map1.get(curr));
            int nonrepeat = (right - left + 1 ) - maxRepeatCount;

            if(nonrepeat > k){
                map1.put(s.charAt(left), map1.get(s.charAt(left)) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
        
    }
}