/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                //all right side value is also bad so
                //move left and mid may be the valid ans so store it 
                end = mid - 1;
                ans = mid;
            } else {
                //so mid is good so need to move right to fiund bad

                start = mid + 1;
            }
        }

        return ans;
    }
}