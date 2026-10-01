class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.')
                    continue;

                char num = board[i][j];

                String row = num + " found in row " + i;
                String col = num + " found in col " + j;

                int box = (i / 3) * 3 + (j / 3);
                String block = num + " found in block " + box;

                if (!set.add(row))
                    return false;

                if (!set.add(col))
                    return false;

                if (!set.add(block))
                    return false;
            }
        }

        return true;
    }
}