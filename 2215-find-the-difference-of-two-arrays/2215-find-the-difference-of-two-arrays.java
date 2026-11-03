class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int x : nums1) {
            if(!contains(nums2, x) && !list1.contains(x))
                list1.add(x);
        }

        for(int x : nums2) {
            if(!contains(nums1, x) && !list2.contains(x))
                list2.add(x);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);

        return ans;
    }

    public boolean contains(int[] arr, int x) {
        for(int num : arr) {
            if(num == x)
                return true;
        }
        return false;
    }
}