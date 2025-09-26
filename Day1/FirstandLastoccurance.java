import java.util.Arrays;

public class FirstandLastoccurance {
    public static void main(String[] args){
        int nums[]= {5,7,7,8,8,10};
        int k = 8;
        int[] res = searchRange(nums,k);
        
        System.out.println(Arrays.toString(res));
    }
   
    public static int[] searchRange(int[] nums, int k) {
        
        int ans1 = -1;
        int l=0,r= nums.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==k){
                l = mid+1;
                ans1 = mid;

            }
            else if(nums[mid]<k){
                l = mid+1;
            }
            else{
                r= mid-1;
            }
        }
        int ans2 = -1;
        int s =0, e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==k){
                e = mid-1;
                ans2 = mid;
            }
            else if(nums[mid]<k){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        int[] ans = new int[2];
        ans[0] = ans2;  // first occurance
        ans[1] = ans1;  // last occurance
        return ans;
    }
}
    

