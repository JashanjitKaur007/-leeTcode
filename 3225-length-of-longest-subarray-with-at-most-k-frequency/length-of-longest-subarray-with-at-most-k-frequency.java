class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n =nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();

        int max=0;
        int left=0;
        int right=0;
        while(right < n){
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);

            while(mp.get(nums[right]) > k){
                mp.put(nums[left], mp.get(nums[left]) - 1);
                left ++ ;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}