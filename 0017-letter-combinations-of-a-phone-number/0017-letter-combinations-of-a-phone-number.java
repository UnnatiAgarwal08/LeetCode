
import java.util.*;

class Solution {
    List<String> ans = new ArrayList<>();
    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    void solve(String digits, int idx, StringBuilder curr) {
        if (idx == digits.length()) {
            ans.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            curr.append(letters.charAt(i));
            solve(digits, idx + 1, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return ans;
        }

        solve(digits, 0, new StringBuilder());
        return ans;
    }
}
