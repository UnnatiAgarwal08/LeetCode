class Solution {
    int count;
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(char[] row:board)
        {
            Arrays.fill(row,'.');
        }
            solve(0,board,n);
            return count;
    }
        void solve(int row,char[][] board,int n){
            if(row==n)
            {
                count++;
                return ;
            }
            for(int col=0;col<n;col++)
            {
                if(isSafe(row,col,board,n)){
                    board[row][col]='Q';
                    solve(row+1,board,n);
                    board[row][col]='.';
                }
            }
        }
        boolean isSafe(int row,int col,char[][] board,int n)
        {
            //upper column
            for(int i=0;i<row;i++)
            {
                if(board[i][col]=='Q')
                   return false;
            }
            //upper-left diagonal
            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
            {
                if(board[i][j]=='Q')
                   return false;
            }
            //upper-right diagonal
            for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++)
            {
                if(board[i][j]=='Q')
                    return false;
            }
            return true;
      }
}