class Solution {
    public int trap(int[] nums) {
        int n=nums.length;

        Stack<Integer> st = new Stack<>();

        int water=0;

        for(int i=0; i<n; i++){
            while(!st.isEmpty() &&  nums[i] > nums[st.peek()]) {
                int top = st.pop();

                if(st.isEmpty()) break;

                int height = Math.min(nums[i], nums[st.peek()]) - nums[top];
                int width = i - st.peek() - 1;

                water += width * height;
            }

            st.push(i);
        }

        return water;
    }
}