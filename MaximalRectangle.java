import java.util.ArrayDeque;
import java.util.Deque;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int height[] = new int[col];
        int maxArea = 0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='0'){
                    height[j] = 0;
                }
                else{
                    height[j] += 1;
                }
            }
            maxArea = Math.max(maxArea,largestRectangle(height));
        }
        return maxArea;    
    }
    public int largestRectangle(int[] height){
        Deque<Integer> dq = new ArrayDeque<>();
        int n = height.length;
        int[] prevSmaller = new int[n];
        int[] nextS = new int[n];
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && height[dq.peek()]>= height[i]){
                dq.pop();
            }
            if(dq.isEmpty()){
                prevSmaller[i] = -1;
            }
            else{
                prevSmaller[i] = dq.peek();
            }
            dq.push(i);
        }
        dq.clear();
        for(int i=n-1;i>=0;i--){
            while(!dq.isEmpty() && height[dq.peek()]>= height[i]){
                dq.pop();
            }
            if(dq.isEmpty()){
                nextS[i] = n;
            }
            else{
                nextS[i] = dq.peek();
            }
            dq.push(i);
        }
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int width = nextS[i]-prevSmaller[i]-1;
            int area = width*height[i];
            maxArea = Math.max(maxArea,area);

        }
        return maxArea;
    }
}
