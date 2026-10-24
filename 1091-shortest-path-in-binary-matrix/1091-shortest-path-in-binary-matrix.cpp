
class Solution {
public:
    vector<pair<int, int>> directions = {
        {1, 1}, {0, 1}, {1, 0}, {0, -1},
        {-1, 0}, {-1, -1}, {1, -1}, {-1, 1}
    };

    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();

        if (m == 0 || n == 0 || grid[0][0] != 0 ||
            grid[m - 1][n - 1] != 0)
            return -1;

        queue<pair<int, int>> q;
        q.push({0, 0});
        grid[0][0] = 1;

        auto isSafe = [&](int x, int y) {
            return x >= 0 && x < m && y >= 0 && y < n;
        };

        int steps = 1;

        while (!q.empty()) {
            int N = q.size();

            while (N--) {
                auto cur = q.front();
                q.pop();

                int x = cur.first;
                int y = cur.second;

                if (x == m - 1 && y == n - 1)
                    return steps;

                for (auto dir : directions) {
                    int nx = x + dir.first;
                    int ny = y + dir.second;

                    if (isSafe(nx, ny) && grid[nx][ny] == 0) {
                        q.push({nx, ny});
                        grid[nx][ny] = 1;
                    }
                }
            }

            steps++;
        }

        return -1;
    }
};
