// Create a CountOccurrences class
public class CountOccurrences {
    public static int countOccurrences(int[] array, int target) {
        int n = array.length;
        int l = 0;
        int r = n - 1;

        // find the left border
        int first = 0;
        while (l < r) {
            int mid = (l + r) / 2;
            if (array[mid] < target) {
                l = mid + 1;
            } else if (array[mid] >= target) {
                r = mid;
            }
            first = l;
        }


        l = 0;
        r = n - 1;
        // find the right border
        int last = n - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (array[mid] <= target) {
                l = mid + 1;
            } else if (array[mid] > target) {
                r = mid;
            }
            last = l - 1;
        }
        // return last - first + 1, which is the number of the same number in between
        return last - first + 1;
    }
}