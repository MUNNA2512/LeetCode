class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            list.add(num);
        }

        
        for (int num : nums2) {
            if (list.contains(num)) {
                result.add(num);
                list.remove((Integer)num);
            }
        }

        
        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;

    }
}