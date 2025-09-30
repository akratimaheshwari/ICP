package Day4;

public class Max_ConsecutivesOnesIII {
    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        System.out.println(longestOnes(arr,k));
    }
    public static int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int maxLen = 0;
        int c=0;
        while(r<nums.length){
            if(nums[r]==0){
                c++;
            }
            while(c>k){
                if(nums[l]==0){
                    c--;
                    
                }
                l++;

            }
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
