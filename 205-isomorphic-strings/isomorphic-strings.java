class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Maps to keep track of character mappings
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check the mapping from s to t
            if (sToT.containsKey(charS)) {
                if (sToT.get(charS) != charT) {
                    return false; // Mismatch in expected character mapping
                }
            } else {
                sToT.put(charS, charT);
            }

            // Check the mapping from t to s
            if (tToS.containsKey(charT)) {
                if (tToS.get(charT) != charS) {
                    return false; // Mismatch in expected character mapping
                }
            } else {
                tToS.put(charT, charS);
            }
        }

        return true; // All characters are correctly mapped
    }
}