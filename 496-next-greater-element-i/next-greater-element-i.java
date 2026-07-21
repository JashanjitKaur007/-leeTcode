class Solution {
    public int[] nextGreaterElement(int[] q, int[] nums) {
        int n=nums.length;

        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> jgs = new Stack<>();

        for(int num: nums){
            while(!jgs.isEmpty() && jgs.peek() < num) mp.put(jgs.pop(), num);
            jgs.push(num);
        }
        while(!jgs.isEmpty()) mp.put(jgs.pop(), -1);

        for(int i=0; i<n; i++) nums[i] = mp.getOrDefault(nums[i], -1);

        int qn=q.length;
        for(int i=0; i<qn; i++) q[i] = mp.get(q[i]);
        return q;
    }
}   