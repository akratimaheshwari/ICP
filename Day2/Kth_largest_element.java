package Day2;

import java.util.PriorityQueue;

public class Kth_largest_element {
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        // heap used - largest- minHeap
        // smallest - max head, use heap window of k size
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.poll();
    }
    
}
