package DynamicProgramming.LCS;

public class CountSubsequenceTIntoS {

    public int numDistinct(String S, String T) {
        int n = S.length();
        int m = T.length();

        int [][] dp = new int[m+1][n+1];

        for(int i=0; i<=n; ++i){
            dp[0][i] = 1;
        }

        for(int t=1; t<=m; ++t){

            for(int s=1; s<=n; ++s){
                if(T.charAt(t-1) != S.charAt(s-1)){
                    dp[t][s] = dp[t][s-1];
                }else{
                    dp[t][s] = dp[t][s-1] + dp[t-1][s-1];
                }
            }
        }

        return dp[m][n];
    }

}
