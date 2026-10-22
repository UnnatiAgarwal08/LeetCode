
class Solution{
    int m,n;
    void dfs(int[][] image,int r,int c,int oldColor,int color){
        if (r < 0 || r >= m || c < 0 || c >= n)
            return;
        if(image[r][c]!=oldColor)
            return;
        image[r][c]=color;
        dfs(image,r-1,c,oldColor,color);
        dfs(image,r+1,c,oldColor,color);
        dfs(image,r,c-1,oldColor,color);
        dfs(image,r,c+1,oldColor,color);
    }
    public int[][] floodFill(int[][] image,int sr,int sc,int color){
        m=image.length;
        n=image[0].length;
        int oldColor=image[sr][sc];
        if (oldColor==color)
            return image;
        dfs(image,sr,sc,oldColor,color);
        return image;
    }
}
