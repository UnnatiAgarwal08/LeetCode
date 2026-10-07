class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {

        List<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] d : dislikes) {
            int u = d[0];
            int v = d[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        int[] color = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (color[i] == 0) {
                if (!dfs(i, 1, graph, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean dfs(int node, int c, List<Integer>[] graph, int[] color) {

        color[node] = c;

        for (int neighbour : graph[node]) {

            if (color[neighbour] == c) {
                return false;
            }

            if (color[neighbour] == 0) {
                if (!dfs(neighbour, -c, graph, color)) {
                    return false;
                }
            }
        }

        return true;
    }
}