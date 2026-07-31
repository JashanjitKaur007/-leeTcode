class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        char[] ans = new char[n];
        int k = -1;
        int j = 0;

        for (int i = 0; i < 26; i++) {

            // ❌ Mistake: Only handling freq == 1 and freq == 2.
            // ✅ Fix: Handle all frequencies using freq[i] / 2.
            if (freq[i] % 2 == 1) {
                k = i;
            }

            // ❌ Mistake:
            // ans[j] = (char)('a' + freq[i]);
            // Using frequency instead of character index.
            // ✅ Fix: Use ('a' + i).
            while (freq[i] >= 2) {
                ans[j] = (char) ('a' + i);
                ans[n - j - 1] = (char) ('a' + i);
                freq[i] -= 2;
                j++;
            }
        }

        // ❌ Mistake:
        // ans[n/2] = (char)('a' + freq[k]);
        // Again using frequency instead of character index.
        // ✅ Fix: Use ('a' + k).
        if (k != -1) {
            ans[n / 2] = (char) ('a' + k);
        }

        return new String(ans);
    }
}






















