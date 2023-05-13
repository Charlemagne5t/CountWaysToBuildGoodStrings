package org.example;
//Given the integers zero, one, low, and high,
// we can construct a string by starting with an empty string, and then at each step perform either of the following:
//
//    Append the character '0' zero times.
//    Append the character '1' one times.
//
//This can be performed any number of times.
//
//A good string is a string constructed by the above process having a length between low and high (inclusive).
public class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int mod = (int) 1e9 + 7;
        long[] dp = new long[high + 1];
        dp[0] = 0;
        if (zero == 1) {
            dp[1] = 1;
        }
        if (one == 1) {
            dp[1] = dp[1] + 1;
        }

        for (int i = 2; i <= high; i++) {

            if (zero == i) {
                dp[i] = dp[i] + 1;
            }

            if (one == i) {
                dp[i] = dp[i] + 1;
            }
            if (i - zero > 0)
                dp[i] = (dp[i] + dp[i - zero]) % mod;
            if (i - one > 0)
                dp[i] = (dp[i] + dp[i - one] % mod);
        }
        long sum = 0;
        for (int i = low; i <= high; i++) {
            sum += dp[i];
        }
        return (int) (sum % mod);
    }
}
