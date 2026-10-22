
class Solution {
    int n, m;

    void dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= n || c < 0 || c >= m)
            return;

        if (grid[r][c] == 0)
            return;

        grid[r][c] = 0;

        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numEnclaves(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        for (int i = 0; i < m; i++) {
            if (grid[0][i] == 1)
                dfs(grid, 0, i);

            if (grid[n - 1][i] == 1)
                dfs(grid, n - 1, i);
        }

        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1)
                dfs(grid, i, 0);

            if (grid[i][m - 1] == 1)
                dfs(grid, i, m - 1);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    count++;
            }
        }

        return count;
    }
}
