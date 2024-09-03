class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>seen = new HashSet<>();
        for(char c : s.toCharArray()){
            if(seen.contains(c)){
                return c;
            }
            seen.add(c);
        }
        return 0;
        
    }
}