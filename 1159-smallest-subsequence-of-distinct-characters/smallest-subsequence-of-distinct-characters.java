class Solution {
    public String smallestSubsequence(String s) {

        char[] str = s.toCharArray();

        int[] freq = new int[26];
        for(char ch: str){
            freq[ch-'a']++;
        }

        Stack<Character> st = new Stack<>();

        boolean[] present = new boolean[26];

        for(char ch: str){
            freq[ch-'a'] -- ;
            if(present[ch-'a']) continue;

            while(!st.isEmpty() &&
            ch <= st.peek()  &&  freq[st.peek() -'a'] > 0  &&  present[st.peek() -'a'] ){
                present[st.peek()-'a'] = false;
                st.pop();
            }

            if(!present[ch-'a']){
                st.push(ch);
                present[ch-'a'] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());

        return sb.reverse().toString();
    }
}