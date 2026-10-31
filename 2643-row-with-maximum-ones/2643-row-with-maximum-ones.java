class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int max=-1,index=-1;
        for(int i=0;i<n;i++)
        {
            int countrows=0;
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1){
                    countrows++;
                }
            }
            if(countrows>max)
            {
                max=countrows;
                index=i;
            }
        }
        return new int[]{index,max};
    }
}