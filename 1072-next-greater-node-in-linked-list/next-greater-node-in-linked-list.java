class Solution {
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> ls = new ArrayList<>();

        for(ListNode h=head; h!=null; h=h.next){
            ls.add(h.val);
        }

        int[] res = new int[ls.size()];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<ls.size(); i++){
            while(!st.isEmpty() && ls.get(st.peek()) < ls.get(i)){
                res[st.pop()] = ls.get(i);
            }
            st.push(i);
        }    

        return res;    
    }
}


// 2 1 5

// 2 1 , 5 2 pop - 5 1 pop - 5