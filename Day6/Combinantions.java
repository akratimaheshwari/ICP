package Day6;

import java.util.ArrayList;
import java.util.List;

public class Combinantions {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(n,k,1,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int n ,int k,int start,ArrayList<Integer> curr,List<List<Integer>> ans){
        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        if(curr.size()>k){
            return;
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            helper(n,k,i+1,curr,ans);
            curr.remove(curr.size()-1);
        }

    }
}

