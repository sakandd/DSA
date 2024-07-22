class Solution {
    public boolean isPalindrome(int x) {
        int revnumber = 0;
        int n = x;
        if(n<0){
            return false;
        }
        while(n>0){
            int rem = n%10;
            revnumber = revnumber*10 + rem;
            n = n/10;
        }
        if(revnumber == x){
            return true;
        }else{
            return false;
        }

        
    }
}