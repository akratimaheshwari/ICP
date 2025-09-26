import java.util.*;
class Sliding_window_maximum {
    public static void main(String[] args){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k= 3;
        maxSlidingWindow(arr,k);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < n; i++) {    
           pq.add(new int[]{nums[i], i});
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            if (i >= k - 1) {
                result[i - k + 1] = pq.peek()[0];
            }
        }

        return result;
    }
}