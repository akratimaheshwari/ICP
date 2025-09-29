public class Search_in_2d {
     public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        int target = 5;

        
        boolean found = searchMatrix(matrix, target);

        System.out.println("Is " + target + " present in the matrix? " + found);
    }

    public static boolean searchMatrix(int[][] matrix, int x) {
        int r=0;
        int c = matrix[0].length-1;
        while(r<matrix.length && c >=0){
            if(matrix[r][c]==x) return true;

            else if(matrix[r][c]>x){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}

