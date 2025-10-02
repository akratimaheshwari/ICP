import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queen_reconstruction_by_height {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            else{
                return b[0]-a[0];
            }
        });
        List<int[]> ans = new ArrayList<>();
        for(int[] i:people){
            ans.add(i[1],i);
        }
        return ans.toArray(new int[people.length][2]);
    }
}
