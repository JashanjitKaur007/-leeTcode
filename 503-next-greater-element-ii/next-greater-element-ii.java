class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer>st = new Stack<>();
        int[] res = new int[n];
        Arrays.fill(res, -1);

        for(int i=0; i<2*n; i++){
            // i = i%n; // interpreting i fouls the loops as well 
            int j = i % n;

            while(!st.isEmpty() && nums[st.peek()] < nums[j]){
                res[st.pop()] = nums[j];
            }

            if(i<n) st.push(i);
        }

        return res;
    }
}