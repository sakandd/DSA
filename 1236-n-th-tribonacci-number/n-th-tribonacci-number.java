class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
    }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int result =0;
        for(int i =3; i<=n; i++){
         result = a+b+c;
         a = b;
         b = c;
         c = result;

        }
        return result;
        
    }
}