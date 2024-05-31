public class SearchTarget{
    public static int searchTarget(int[] nums, int target) {
        // If the array does not exist, or it is empty.
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // While the array does exist and consists of at least 1 integer.
        // Set the default left border, right border and their middle position.
        int l = 0;
        int r = nums.length - 1;
        int mid;

        while (l <= r) {
        mid = l + (r - l) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        // If the first half is sorted.
        if (nums[l] <= nums[mid]) {
        // And target is in the first half.
            if (target >= nums[l] && target < nums[mid]) {
                r = mid - 1;
            }
            else {
            l = mid + 1;
        }

        } else {
            if (target <= nums[r] && target > nums[mid]) {
            l = mid + 1;
            }
            else {
            r = mid - 1;
        }
        }
        }
            return -1;
        }
}
