class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);

        if (i == -1)
            return word;

        Stack<Character> st = new Stack<>();

        for (int j = 0; j <= i; j++) {
            st.push(word.charAt(j));
        }

        String result = "";

        while (!st.empty())
            result += st.pop();

        result += word.substring(i + 1);

        return result;
    }
}