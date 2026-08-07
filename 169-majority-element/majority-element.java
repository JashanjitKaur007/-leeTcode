class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int get = n / 2;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i : nums)
            mp.put(i, mp.getOrDefault(i, 0) + 1);

        int max = 0;
        int ans = -1;
        for (int key : mp.keySet()) {
            if (mp.get(key) > max) {
                max = mp.get(key);
                ans = key;
            }
        }

        return ans;
    }
}