/**
 * Solution to the problem of finding the number of subarrays where the sum of the subarray
 * is greater than half of its length.
 */
public class Solution {

    /**
     * Returns the number of subarrays where the sum of the subarray is greater than half of its length.
     *
     * @param nums the input array of integers
     * @return the number of subarrays where the sum of the subarray is greater than half of its length
     */
    public static int solution(int[] nums) {
        int n = nums.length;
        int[] preSum = new int[n + 1];
        int res = 0;
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sumRange = preSum[j + 1] - preSum[i];
                if ((j - i + 1) / 2 < sumRange) {
                    res++;
                }
            }
        }
        return res;
    }
}
