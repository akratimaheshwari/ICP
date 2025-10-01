import java.util.*;
public class Min_arrow_to_brust {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrow =1;
        int prevEnd = points[0][1];
        for(int i=0;i<points.length;i++){
            int currStart = points[i][0];
            if(currStart <= prevEnd) {
                continue;
            }
            else{
                arrow++;
                prevEnd = points[i][1];
            }
        }
        return arrow;
    }
}
