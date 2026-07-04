class Solution {
    public String longestCommonPrefix(String[] str) {
        int n=str.length;

        String prefix=str[0];

        for(int i=1; i<n; i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        return prefix;
    }
}