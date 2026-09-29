class Solution {
public:
    vector<int> plusOne(vector<int>& arr) {
        int n=arr.size();
        for(int i=n-1; i>=0; i--){
            if(arr[i] < 9){
                arr[i] = arr[i] + 1;
                return arr;
            }
            else{
                arr[i] = 0;
            }
        }

        // arr[n+1, 0];
        // arr[0] = 1;
        // return arr;
        vector<int> ans_999 (n+1, 0) ;
        ans_999 [0] = 1 ;
        return ans_999 ;
    }
};


////////////////////////runtime error//////////////////////////
// class Solution {
// public:

//     int digitToInt (vector<int>& arr, int n){
//         int no=0;
//         for(int i=0; i<n; i++){
//             no = no*10 + arr[i];
//         }
//         return no+1;
//     }

//     // vector<int> intToDigit (int n, vector<int> &ans){
//     vector<int> intToDigit (int n){
//         int no = n;
//         vector<int> ans;
//         while(n>0){
//             int digit = n%10;
//             n = n/10;
//             ans.push_back(digit);
//         }
//         reverse(ans.begin(), ans.end());
//         return ans;
//     }

//     vector<int> plusOne(vector<int>& arr) {
//         int n = arr.size();
//         int num = digitToInt(arr, n);
//         // vector<int> ans;
//         // intToDigit(num, ans);
//         // return ans;
//         return intToDigit(num);
//     }
// };