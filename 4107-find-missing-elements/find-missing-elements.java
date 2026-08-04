class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        Set<Integer> hs = new HashSet<>();

        for(int i: nums){
            hs.add(i);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        for(int i=min; i<=max; i++){
            if(!hs.contains(i)) ans.add(i);
        }

        return ans;
    }
}