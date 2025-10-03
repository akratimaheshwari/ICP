package Day6;

public class Word_search {
    
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        // boolean[][] visited = new boolean[m][n];
        boolean res = false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    res = backtrack(board,word,i,j,0);
                    if(res){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean backtrack(char[][] board, String word,int r,int c,int idx){
        if(idx == word.length()) return true; 

        if(r<0 || c<0 || r>=board.length || c>= board[0].length ||  board[r][c] != word.charAt(idx)){
            return false;
        }
        char temp = board[r][c];
        board[r][c] = '#';
        // visited[r][c] = true;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] i:dir){
            int x = r+i[0];
            int y = c+i[1];
            if(backtrack(board,word,x,y,idx+1)){
                return true;
            }
        }
        // backtrack
        // visited[r][c] = false;
        board[r][c] = temp;
        return false;
    }
}

