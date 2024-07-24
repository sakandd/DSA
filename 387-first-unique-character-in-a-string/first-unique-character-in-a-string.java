class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>charcount = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            charcount.put(c,charcount.getOrDefault(c , 0) +1);
        }
        for(int i = 0; i<s.length();i++){
            if(charcount.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
        
    }
}