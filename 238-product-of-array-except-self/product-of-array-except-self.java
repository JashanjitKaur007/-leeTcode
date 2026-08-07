class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];

        // PREFIX SUM

        int[] left = new int[n];
        Arrays.fill(left, 1);
        int prefix=1;
        for(int i=1; i<n; i++){
            left[i] = prefix * nums[i-1];
            prefix = left[i];
        }
// 1 1 2 6

        int[] right = new int[n];
        Arrays.fill(right, 1);
        prefix = 1;
        for(int i=n-2; i>=0; i--){
            right[i] = prefix * nums[i+1];
            prefix = right[i];
        }
// 6 

        for(int i=0; i<n; i++){
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}