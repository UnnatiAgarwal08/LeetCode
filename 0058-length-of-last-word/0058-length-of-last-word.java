class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n=s.lastIndexOf(" ");
        return (s.substring(n+1,s.length()).length());
        
    }
}