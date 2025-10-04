import java.util.Arrays;

public class Unique_Path {
    static int[][] dp = new int[101][101];
    public int uniquePaths(int m, int n) {
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return helper(0,0,m,n);
        
    }
    public static int helper(int i,int j,int m,int n){
        if(i >= m ||  j >= n){
            return 0;
        }
        if (i == m - 1 && j == n - 1){ 
            return 1;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int right = helper(i,j+1,m,n);
        int down = helper(i+1,j,m,n);
        return dp[i][j] = (right+down);
    }
}
