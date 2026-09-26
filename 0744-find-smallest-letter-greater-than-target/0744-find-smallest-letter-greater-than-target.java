class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int n = letters.length;
        int e = n - 1;

        char ans = letters[0];

        while (s <= e) {
            int mid = (s + e) / 2;
            int targetInt = (int) target;
            int elementInt = (int) letters[mid];

            if (targetInt >= elementInt) {
                s = mid + 1;

            } else {
                ans = letters[mid];
                e = mid - 1;
            }

        }

        return ans;
    }
}