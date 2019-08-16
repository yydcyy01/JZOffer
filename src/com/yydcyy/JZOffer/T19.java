package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * 正则表达式匹配
 * https://www.acwing.com/problem/content/28/
 */
public class T19 {
    public boolean isMatch(String s, String p) {
        int m= s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;
        for (int i = 1; i <= n; i ++){
            if (p.charAt(i-1) == '*'){
                dp[0][i] = dp[0][i - 2];
            }
        }

        for (int i = 1; i <= m; i ++){
            for (int j = 1;j <= n; j ++){
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.'){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if(p.charAt(j - 1) == '*'){
                    if ( p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.' ) {
                        dp[i][j] |= dp[i][j - 1]; //a* counts as single a
                        dp[i][j] |= dp[i - 1][j]; //a* counts as multiple a
                        dp[i][j] |= dp[i][j - 2]; //a* counts as empty
                    }
                    else
                        dp[i][j] = dp[i][j - 2];
                }
            }
        }
        return dp[m][n];
    }
}
