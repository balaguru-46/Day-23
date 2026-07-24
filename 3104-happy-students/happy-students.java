import java.util.*;

class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);

        int n = nums.size();
        int answer = 0;

        // Check selecting 0 students
        if (nums.get(0) > 0) {
            answer++;
        }

        // Check selecting k students
        for (int k = 1; k <= n; k++) {
            int lessCount = k - 1;

            if (k < n && nums.get(k - 1) < k && nums.get(k) > k) {
                answer++;
            }
        }

        // Check selecting all students
        if (nums.get(n - 1) < n) {
            answer++;
        }

        return answer;
    }
}