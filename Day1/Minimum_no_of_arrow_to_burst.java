import java.util.Arrays;

public class Minimum_no_of_arrow_to_burst {
    public static void main(String[] args){
        int[][] points = { {10,16}, {2,8}, {1,6}, {7,12} };

        int count = findMinArrowShots(points);
        System.out.println(count);
    }
    
    public static int findMinArrowShots(int[][] points) {
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
    

