package Day2;

public class MergeSortedArray88 {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6} ;
        int n = 3;
        new MergeSortedArray88().merge(nums1, m, nums2, n);

        // Print result
        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] res = new int[n+m];
       int k=0,i=0,j=0;
       while(i<m && j<n){
        if(nums1[i]<nums2[j]){
            res[k++] = nums1[i];
            i++;
        }
        else {
            res[k++] = nums2[j];
            j++;
        }
       }
       while(i<m){
        res[k++] = nums1[i];
        i++;
       }
       while(j<n){
        res[k++] = nums2[j];
        j++;
       }
       for(int p=0;p<m+n;p++){
        nums1[p] = res[p];
       }
}
}
