class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();

        char[] str = s.toCharArray();

        int mid = n/2;

        Arrays.sort(str, 0, mid);

        for(int i=0; i<mid; i++){
            str[n-i-1] = str[i];
        }

        return new String(str);
    }
}