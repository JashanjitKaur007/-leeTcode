class Solution {

    public void rev(int s, int e, int[] nums) {
        while(s<=e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n=nums.length;

        k = k%n;

        rev(0, n-1, nums);
        rev(0, k-1, nums);
        rev(k, n-1, nums);
    }
}