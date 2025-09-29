public class Number_of_Island {
    public static void main(String[] args){
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        int count = numIslands(grid);
        System.out.println("Number of islands: " + count); 
    }

    public static int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    solve(grid,i,j);
                }
            }
        }
        return c;
    }
    public static void solve(char[][] grid,int i,int j){
        if(i<0 || j<0||i>= grid.length || j>= grid[0].length || grid[i][j]=='0'){
            return ;
        }
        grid[i][j]  = '0';
        int[][] dire = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int[] d:dire){
            solve(grid,i+d[0],j+d[1]);
        }
        

    }
}
