class Solution {
    int k;

/*
    nCr =     n!
          ____________
           r! (n-r) !
*/

    // public int nCr (int slot, int count){
    public long nCr (int n, int r){
        r = Math.min(r, n - r);

        long res=1;

        for(int i=1; i<=r; i++){
            res = res * (n - r + i) / i;

            if(res >= k) return k;  // early return
        }

        return res;
    }


    public String smallestPalindrome(String s, int K) {
        k = K;
        int n=s.length();

        int freq[] = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a'] ++ ;
        }

        int mid=-1;
        for(int i=0; i<26; i++){
            if(mid == -1){
                if(freq[i] % 2 == 1) mid = i;
            }

            freq[i] /= 2;
        }


        StringBuilder halfResult = new StringBuilder();
        int half = n/2;        

        for(int i=0; i<half; i++){
            boolean placeholder = false;

            for(int j=0; j<26; j++){
                if (freq[j] == 0) continue;

                freq[j] -- ;

                // ways = remaining slots / freq[i] > 1 ;
                int letters = half - i - 1;
                long ways = 1;

                // ways *= nCr (letters, freq[j]);
                // letters -= freq[j];
                for (int c = 0; c < 26; c++) {
                    if (freq[c] > 0) {
                        ways *= nCr(letters, freq[c]);
                        letters -= freq[c];

                        if(ways >= k){
                            ways = k;
                            break;
                        }
                    }
                }

// nCr = total / count of ch * remaining toal / count of ch .....

                if(ways >= k){
                    halfResult.append((char)('a'+j));
                    placeholder = true;
                    break;
                }

                k -= (int) ways;
                freq[j] ++ ;
                
            }

            if(placeholder == false) return "";
        }


        // halfResult + mid + reverse of half;

        StringBuilder ans = new StringBuilder();
        ans.append(halfResult);
        if(n%2==1){
            ans.append((char) ('a' + mid));
        }
        ans.append(new StringBuilder(halfResult).reverse());

        return ans.toString();
    }
}