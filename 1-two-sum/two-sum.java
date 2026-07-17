class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        // mp.put(0, -1);
        int idx=0;
        for(int i: nums){
            if(mp.containsKey(target - i)){
                ans[0] = mp.get(target-i);
                ans[1] = idx;
                // System.out.println(ans[0] + ", " + ans[1]);
                return ans;
            }
            else{
                mp.put(i, idx);
            }
            idx++;
        }
        return ans;
    }
}

// hashmap - if target - num present then yes , else put num