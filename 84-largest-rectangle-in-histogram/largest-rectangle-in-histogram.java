class Solution {
    public int largestRectangleArea(int[] nums) {
        int n=nums.length;
        int max=0;

        Stack<Integer> st = new Stack<>();


        // for(int i=0; i<n; i++){
        for(int i=0; i<=n; i++){

            int bar =  i == n ? 0 : nums[i];

            while(!st.empty() && bar < nums[st.peek()]){

            // while(!st.empty() && nums[i] < nums[st.peek()]){
                int top = nums[st.pop()];

                int height = top;
                
                // int width = st.isEmpty() ? 1 : i - st.peek() - 1;
                int width = st.isEmpty() ? i : i - st.peek() - 1;

                max = Math.max(max, height*width);
            }

            st.push(i) ;
        }


        return max;
    }
}