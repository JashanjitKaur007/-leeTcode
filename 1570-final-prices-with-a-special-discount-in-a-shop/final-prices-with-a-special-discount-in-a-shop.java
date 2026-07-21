class Solution {
    public int[] finalPrices(int[] nums) {
        int n=nums.length;
        Stack<Integer>st = new Stack<>();
        int[] res = new int[n];

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                res[st.peek()] = nums[st.pop()] - nums[i];
            }
            if(i<n) st.push(i);
        }

        while(!st.isEmpty()){
            res[st.peek()] = nums[st.pop()];
        }

        return res;
    }
}