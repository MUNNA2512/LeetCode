class Solution {
    static boolean BinarySearch(int[] nums, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                //move right

                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return false;
    }

    public boolean search(int[] nums, int target) {
        //find pivot index 
        int s = 0;
        int n = nums.length;
        int e = n - 1;
        int pivot = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                pivot = i;
                break;
            }
        }

        int levelOneStart = 0;
        int levelOneEnd = pivot - 1;

        int levelTwoStart = pivot;
        int levelTwoEnd = n - 1;

        if (BinarySearch(nums, levelOneStart, levelOneEnd, target)
                || BinarySearch(nums, levelTwoStart, levelTwoEnd, target)) {
            return true;
        } else {
            return false;
        }

    }
}