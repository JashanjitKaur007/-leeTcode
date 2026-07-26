class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int water=0;

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                int top = nums[st.pop()];

                if(st.isEmpty()) continue;

                int height = Math.min(nums[i], nums[st.peek()]) - top;
                int width = i - st.peek() - 1;

                water += height * width;
            }

            st.push(i);
        }

        return water;
    }
}