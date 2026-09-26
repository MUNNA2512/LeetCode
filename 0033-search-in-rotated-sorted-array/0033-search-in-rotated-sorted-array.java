class Solution {

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        int n = nums.length;

        // Empty array
        if (n == 0) {
            return -1;
        }

        int s = 0;
        int e = n - 1;

        // Array already sorted
        if (nums[s] <= nums[e]) {
            return binarySearch(nums, target, s, e);
        }

        // Find rotation index (minimum element)
        int rotatedIndex = 0;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        rotatedIndex = s;

        // Target is the minimum element
        if (nums[rotatedIndex] == target) {
            return rotatedIndex;
        }

        // Search in right sorted half
        if (target >= nums[rotatedIndex] && target <= nums[n - 1]) {
            return binarySearch(nums, target, rotatedIndex, n - 1);
        }

        // Search in left sorted half
        return binarySearch(nums, target, 0, rotatedIndex - 1);
    }
}