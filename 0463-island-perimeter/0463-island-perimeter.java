// BFS
class Solution {
    int n;
    int m;
    int peri = 0;
    void bfs(int[][] grid, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        grid[i][j] = -1;
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                    peri++;
                } else if (grid[nx][ny] == 0) {
                    peri++;
                } else if (grid[nx][ny] == 1) {
                    grid[nx][ny] = -1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
    public int islandPerimeter(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        peri = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    bfs(grid, i, j);
                    return peri;
                }
            }
        }
        return 0;
    }
}
