import java.util.*;
class Solution {
    public int mySqrt(int x) {
       if(x<2)
         return x;

        int ans=0;
        int l=1;
        int h=x/2;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(m<=x/m)
              {
                ans=m;
                l=m+1;
              }
            else{
                h=m-1;
            }
        }
        return ans;
    }
}