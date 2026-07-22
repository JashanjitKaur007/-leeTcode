class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;

        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(int i=1; i<n; i++){
            if(nums[i] < nums[st.peek()]) st.push(i);
        }

        int ramp=0; 

        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && nums[i] >= nums[st.peek()]){
                ramp = Math.max(ramp, i - st.pop());
            }

            if(st.isEmpty()) break;
        }

        return ramp;
    }
}