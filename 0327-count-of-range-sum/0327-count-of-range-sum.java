class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return mergeSort(prefix, 0, n, lower, upper);
    }

    int mergeSort(long[] sum, int left, int right, int lower, int upper) {
        if (left >= right)
            return 0;

        int mid = left + (right - left) / 2;

        int count = mergeSort(sum, left, mid, lower, upper)
                  + mergeSort(sum, mid + 1, right, lower, upper);

        int j = mid + 1;
        int k = mid + 1;

        for (int i = left; i <= mid; i++) {

            while (j <= right && sum[j] - sum[i] < lower)
                j++;

            while (k <= right && sum[k] - sum[i] <= upper)
                k++;

            count += k - j;
        }

        long[] temp = new long[right - left + 1];

        int i = left, p = mid + 1, t = 0;

        while (i <= mid && p <= right) {
            if (sum[i] <= sum[p])
                temp[t++] = sum[i++];
            else
                temp[t++] = sum[p++];
        }

        while (i <= mid)
            temp[t++] = sum[i++];

        while (p <= right)
            temp[t++] = sum[p++];

        for (int x = 0; x < temp.length; x++)
            sum[left + x] = temp[x];

        return count;
    }
}