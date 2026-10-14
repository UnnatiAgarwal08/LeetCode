class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        if(n==0)
          return 0;
        int sign=1;
        long num=0;

        // white spaces
        while(i<n && s.charAt(i)==' ')
          i++;

        //sign
        if(i<n && (s.charAt(i)== '+'|| s.charAt(i)=='-'))
        {
            if(s.charAt(i)=='-')
                sign=-1;
            i++;
        }

        // number reading
        while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9'))
        {
            num=num*10+(s.charAt(i)-'0');
            // range check
            if (sign*num>Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign*num<Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (num*sign);
    }
}