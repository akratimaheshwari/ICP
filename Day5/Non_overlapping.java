import java.util.Arrays;

public class Non_overlapping {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int prev =Integer.MIN_VALUE;
        int c =0;
        for(int [] i:intervals){
            int s = i[0];
            int e = i[1];
            if(s<prev){
                c++;
            }
            else{
                prev = e;
            }

        }
        return c;
    }
}
