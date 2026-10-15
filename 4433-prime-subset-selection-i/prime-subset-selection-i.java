class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans = new ArrayList<>();

        if(n<2 || s<2) return ans;
        
        boolean temp[] = new boolean[n+1];
        Arrays.fill(temp, true);

        temp[0] = temp[1] = false;

        int sum = 0;
        for(int i=2; i<=n; i++){
            // is prime ?
            if(temp[i] == false) continue;

            // correctionn - 
            if(sum + i > s) break;

            // add
            sum+=i;
            if((sum) <= s) ans.add(i);

            // why not here
            // else break; // if sum exceeds the n then leave;


            // eh kiu ni chl reha ??? 
            
            // cross multiples
            // int m=2;
            // while(i * m <= s){
            //     temp[ i * m ] = false;
            //     m++;
            // }


            int no = i;


            // eh kiu ni chl reha ??
            
            // if(i*i > n) break;
            
            // for(int multiple = i*i; multiple <= n; multiple += i){
            //     temp[multiple] = false;
            // }
            
            if((long)i*i <= n){
            for(int multiple = i*i; multiple <= n; multiple += i){
                temp[multiple] = false;
            }}
        }

        return ans;
    }
}