//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String betterString(String str1, String str2) {
        int count1 = countDistinctSubsequences(str1);
        int count2 = countDistinctSubsequences(str2);

        return count1 >= count2 ? str1 : str2;
    }

    private static int countDistinctSubsequences(String str) {
        int n = str.length();
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % 1000000007;

            if (lastOccurrence.containsKey(str.charAt(i - 1))) {
                int lastIndex = lastOccurrence.get(str.charAt(i - 1));
                dp[i] = (dp[i] - dp[lastIndex - 1] + 1000000007) % 1000000007;
            }

            lastOccurrence.put(str.charAt(i - 1), i);
        }

        return dp[n];
    }
}