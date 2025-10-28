import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        int res[] = new int[nums1.length];

        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[st.peek()]<= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
            nextGreater[i] = st.peek();
            }
            st.push(i);
        }
        // for(int i=0;i<nums2.length;i++){
        //     System.out.println(nextGreater[i]);
        // }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nextGreater.length; i++){
            map.put(nums2[i],nextGreater[i]);
        }

        for(int i=0;i<nums1.length;i++){
            
                if(map.get(nums1[i])==-1){
                    res[i] = -1;
                    
                }
                else{
                res[i] = nums2[map.get(nums1[i])];}
            
        }
        return res;
    }
}
