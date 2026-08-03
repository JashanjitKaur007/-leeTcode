class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a'] ++ ;
        }
        
        Stack<Character> st = new Stack<>();

        boolean[] present = new boolean[26];
        Arrays.fill(present, false);

        for(char ch: s.toCharArray()){
            freq[ch-'a'] -- ;
            if(present[ch-'a'] == true) continue;

            while(!st.isEmpty() && ch <= st.peek() && 
                freq[st.peek()-'a'] > 0 && present[st.peek()-'a']){

                present[st.peek()-'a'] = false;
                st.pop();
            }

            if(present[ch-'a'] == false){
                st.push(ch);
                present[ch-'a'] = true;
            }

            // freq[ch-'a'] -- ;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
};