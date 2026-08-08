class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n-k];
        // Stack<Integer> st = new Stack<>();
        // for(int i: nums){

        // }
    }
}
//  1 2 3 4 |5| 6
//  k = 2, n=6
//  6-2+1 