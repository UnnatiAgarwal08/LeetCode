
import java.util.*;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int ans = 0;

        for(int house : houses) {
            int low = 0;
            int high = heaters.length - 1;

            while(low <= high) {
                int mid = low + (high - low) / 2;

                if(heaters[mid] < house) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }

            int right = (low < heaters.length) 
                        ? heaters[low] - house : Integer.MAX_VALUE;

            int left = (high >= 0) 
                       ? house - heaters[high] : Integer.MAX_VALUE;

            int minDist = Math.min(left, right);

            ans = Math.max(ans, minDist);
        }

        return ans;
    }
}
