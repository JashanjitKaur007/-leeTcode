class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        HashMap<Character, Integer> mp = new HashMap<>();

        char[] str = s.toCharArray();
        int max=0;
        int left=0;
        int right=0;
        while(right < n){
            mp.put(str[right], mp.getOrDefault(str[right], 0) + 1);

            while(mp.get(str[right]) > 2){
                mp.put(str[left], mp.get(str[left]) - 1);
                if(mp.get(str[left]) == 0) mp.remove(str[left]);
                left ++ ;
            }

            max = Math.max(max, right-left+1);
            right++;
        }

        return max;
    }
}