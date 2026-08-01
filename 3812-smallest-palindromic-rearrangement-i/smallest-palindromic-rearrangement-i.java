class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch - 'a'] ++ ;
        }

        char[] ans = new char[n];
        int k=-1;
        int j=0;
        for(int i=0; i<26; i++){
            if(freq[i] % 2 == 1){
                k=i;
            }
            // if(freq[i]){
            //     ans[j] = (char) ('a' + freq[i]);
            //     ans[n-j-1] = (char) ('a' + freq[i]);
            //     j++;
            // }
            while(freq[i] >= 2){
                ans[j] = (char) ('a' + i);
                ans[n-j-1] = (char) ('a' + i);
                j++;
                freq[i] -= 2;
            }
        }
        
        if(k!= -1) ans[n/2] = (char) ('a' + k);

        return new String(ans);
    }
}