package org.example;
class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int mod = (int)1e9 + 7;
        int[] dp = new int[high + 1];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++) {
            if(i - zero >= 0) {
                dp[i] = dp[i - zero] % mod;
            }
            if(i  - one >= 0) {
                dp[i] = dp[i] % mod + dp[i - one] % mod;
            }
        }
        int res = 0;
        for(int i = low; i <= high; i++) {
            res = (res % mod + dp[i]% mod) % mod;
        }


        return res;
    }
}