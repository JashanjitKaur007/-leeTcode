class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> ls = new ArrayList<>();

        while(n>0){
            int digit = n%10;
            ls.add(digit);
            n/=10;
        }

        ls.sort(Collections.reverseOrder());

        if(ls.size() <= 1) return n;
        return ls.get(0) * ls.get(1);
    }
}