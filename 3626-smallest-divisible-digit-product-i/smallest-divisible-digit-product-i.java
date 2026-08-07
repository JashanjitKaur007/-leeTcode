class Solution {
    public int smallestNumber(int n, int t) {

        int ans = n;

        while(true){
            int prod = 1;
            int num = ans;
            while(num > 0){
                prod *= num%10;
                if(prod==0) return ans;
                num/=10;
            }

            if(prod % t == 0) return ans;
            else ans ++ ;
        }
        
        // return 0;
    }
}