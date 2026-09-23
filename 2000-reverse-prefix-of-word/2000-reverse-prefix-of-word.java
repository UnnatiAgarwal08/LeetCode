class Solution {
    public String reversePrefix(String word, char ch) {

        int i = word.indexOf(ch);

        if (i == -1)
            return word;

        String s = word.substring(0, i + 1);

        String rev = new StringBuilder(s).reverse().toString();

        return rev + word.substring(i + 1);
    }
}