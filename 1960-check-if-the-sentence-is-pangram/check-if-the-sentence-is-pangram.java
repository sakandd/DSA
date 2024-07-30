class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for(char c = 'a'; c<='z'; c++){
            if(sentence.indexOf(c) == -1){
                return false;
            }
        }
        return true;
        
    }
}