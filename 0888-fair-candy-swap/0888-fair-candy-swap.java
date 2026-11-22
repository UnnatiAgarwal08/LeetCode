
import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }

        for (int y : bobSizes) {
            sumB += y;
        }

        int diff = (sumA - sumB) / 2;

        Arrays.sort(bobSizes);

        for (int x : aliceSizes) {

            int target = x - diff;

            int low = 0;
            int high = bobSizes.length - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (bobSizes[mid] == target) {
                    return new int[]{x, target};
                }
                else if (bobSizes[mid] < target) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return new int[]{};
    }
}
