package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,new ArrayList<>(),ans,0);
        return ans;
    }
    public void helper(int[] arr,int t, List<Integer>curr,List<List<Integer>> ans,int start){
        if(t==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(t<0){
            return;
        }
        for (int i = start; i < arr.length; i++) {
            // skip duplicates
            if (i > start && arr[i] == arr[i - 1]) continue;

            if (arr[i] > t) break; 

            curr.add(arr[i]);
            helper(arr, t - arr[i], curr, ans, i + 1); 
            curr.remove(curr.size() - 1);
        }
    }
}
