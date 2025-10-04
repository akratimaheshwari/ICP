public class Maximum_subarray {
    public int maxSubArray(int[] nums) {
        //dp--tabulation
        int max =nums[0];
        int n = nums.length;
        
        int[] dp = new int[n+1];
        dp[0] = nums[0];
        for(int i=1;i<n;i++){
            dp[i]= Math.max(nums[i],dp[i-1]+nums[i]);
            if(dp[i]>max) max = dp[i];

        }
        return max;
    }
}
