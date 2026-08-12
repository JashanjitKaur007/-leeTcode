class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();
        // for(int i: nums){
        //     mp.put(i, mp.getOrDefault(i, 0) + 1);
        // }

        int max=0;
        int right=0;
        int left=0;
        while(right < n){
            // int freq = mp.get(nums[right]);
            // mp.put(nums[right], freq - 1);
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);

            // if(freq - k < 0){
            while (mp.get(nums[right]) > k) {
                // left ++ ;
                // while(mp.get(nums[right]) - k < 0){
                    int lnum = nums[left];
                    mp.put(lnum, mp.get(lnum) - 1);
                    left ++ ;
                // }
            }

            max = Math.max(max, right - left + 1);
            right ++ ;
        }

        return max;
    }
}