class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];

        // binry Search
        int min = Integer.MAX_VALUE;
        int s=0;
        int e=nums.length-1;
                                                               
        while(s<=e){
            int mid = s + (e-s)/2;

            // left sorted 
            if(nums[s] <= nums[mid]){
                min = Math.min(nums[s], min);
                s = mid+1;
            }

            if(nums[mid] <= nums[e]){
                min = Math.min(nums[mid], min);
                e = mid-1;
            }
        }

        return min;
    }
}