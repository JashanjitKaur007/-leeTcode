class Solution {

    public long nCr (int N, int R, int k){
        R = Math.min(R, N-R);

        long ways = 1;
        for(int r=1; r<=R; r++){
            // ways = ways * ((N - r + 1) / r);
            ways = ways * (N - r + 1) / r;

            if(ways >= k) break;
        }

        return ways;
    }
    

    public String smallestPalindrome(String s, int k) {
        int n=s.length();

        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }

        // char mid = ' ';
        char mid = '\0';
        for(int i=0; i<26; i++){
            if(freq[i] % 2 == 1) mid = (char) ('a' + i);
            freq[i] /=2;
        }

        StringBuilder halfResult = new StringBuilder(); 
        int half=n/2;

        for(int i=0; i<half; i++){
            boolean placeholder = false;

            for(int j=0; j<26; j++){
                if(freq[j] == 0) continue;

                freq[j] -- ;
                int slots = half - i - 1;
                long ways = 1;

                for(int c=0; c<26; c++){
                    if(freq[c] == 0) continue;

                    ways *= nCr(slots, freq[c], k);
                    slots -= freq[c];

                    if(ways >= k){
                        break;
                    }
                }

                if(ways >= k){
                    halfResult.append((char) ('a'+j));
                    placeholder = true;
                    break;
                }
                else{
                    k -= ways;
                    freq[j] ++ ;
                }
            }

            if(!placeholder) return "";
        }

        StringBuilder ans = new StringBuilder();
        ans.append(halfResult);
        // if(mid!='') ans.append(mid);
        // Null Check: If ch is a boxed Character object or a string, checking ch != null or ch.length() > 0 is used instead.
        
        // if(mid!=null) ans.append(mid);
        if(mid != '\0') ans.append(mid);
        ans.append(halfResult.reverse());
        
        return ans.toString();
    }
}