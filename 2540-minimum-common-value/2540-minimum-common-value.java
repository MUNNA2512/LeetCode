class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        if (result.isEmpty()) {
            return -1;
        }

        return Collections.min(result);
    }
}