class Solution {
    static boolean isValid(int[] arr, int k, int maxSum) {
        int sum = 0;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {

            if (sum + arr[i] > maxSum) {
                count++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }

            if (count > k) {
                return false;
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int ans = 0;
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(nums, k, mid)) {
                //move left and store the ans 
                ans = mid;
                end = mid - 1;
            } else {
                //move right 
                start = mid + 1;
            }
        }

        return ans;

    }
}