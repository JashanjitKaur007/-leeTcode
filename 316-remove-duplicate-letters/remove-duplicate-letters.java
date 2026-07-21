class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> ims = new Stack<>();

        int[] arr = new int[26];
        for(char ch: s.toCharArray()){
            arr[ch-'a'] ++ ;
        }

        boolean[] present = new boolean[26];
        Arrays.fill(present, false);


        for(char ch: s.toCharArray()){

            arr[ch-'a'] -- ;
            if(present[ch-'a']) continue;

            while( !ims.isEmpty() && ch <= ims.peek() && arr[ims.peek() - 'a'] > 0){
                present[ims.peek() - 'a'] = false;
                ims.pop();
            }

            if(present[ch-'a'] == false){
                ims.push(ch);
                // arr[ch-'a'] -- ;
                present[ch-'a'] = true;
            }

            // arr[ch-'a'] -- ;
        }

        StringBuilder ans = new StringBuilder();
        for(char ch: ims) ans.append(ch);
        return ans.toString();
    }
}