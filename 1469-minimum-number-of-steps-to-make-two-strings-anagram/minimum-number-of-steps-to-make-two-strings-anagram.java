class Solution {
    public int minSteps(String s, String t) {
        int n = s.length();
        int[] mp_s = new int[26];
        int[] mp_t = new int[26];
        
        // Count the frequency of each character in both strings
        for (int i = 0; i < n; i++) {
            mp_s[s.charAt(i) - 'a']++;
            mp_t[t.charAt(i) - 'a']++;
        }
        
        int result = 0;
        
        // Calculate the number of steps needed
        for (int i = 0; i < 26; i++) {
            int freq_s = mp_s[i];
            int freq_t = mp_t[i];
            if (freq_s > freq_t) {
                result += freq_s - freq_t;
            }
        }
        
        return result;
    }
}
