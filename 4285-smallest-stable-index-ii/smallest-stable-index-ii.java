class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        int[] maxi = new int[n];
        int[] mini = new int[n];
        
        int max=nums[0];
        for(int i=0; i<n; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            maxi[i] = max;
        }
        
        int min=nums[n-1];
        for(int i=n-1; i>=0; i--){
            if(min > nums[i]){
                min = nums[i];
            }
            mini[i] = min;
        }
        
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(maxi[i] - mini[i] <= k){
                if(ans > i) ans = i;
            }
        }
        
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}