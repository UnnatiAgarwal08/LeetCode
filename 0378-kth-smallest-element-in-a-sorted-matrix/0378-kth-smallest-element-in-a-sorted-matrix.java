class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        int mat[]=new int[n*m];
        int ind=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[ind++]=matrix[i][j];
            }
        }
        Arrays.sort(mat);
        return mat[k-1];
    }
}