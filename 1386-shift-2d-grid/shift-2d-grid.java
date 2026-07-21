// 2d - 1d, reverse array appproach

// 2d 1d simplification - 
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;

        int size=m*n;
        int[] arr = new int[size];


        // important - 
        
        k = k % size;


        int s=0;
        for(int[] row: grid){
            for(int val: row){
                arr[s++] = val;
            }
        }

        // reverse array 
        rev(size, k, arr);

        int idx=0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            List<Integer> ls = new ArrayList<>();
            for(int j=0; j<n; j++){
                ls.add(arr[idx++]);
            }
            ans.add(ls);
        }

        return ans;
    }


    public void rev(int size, int k, int[] arr){
        swap(0, size-1, arr);
        swap(0, k-1, arr);
        swap(k, size-1, arr);
    }

    public void swap(int s, int e, int[] arr){
        while(s<=e){
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            s++;
            e--;
        }
    }
}