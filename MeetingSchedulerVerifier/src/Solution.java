/**
 * Solution class contains a method to check if a person can attend all scheduled meetings without overlapping.
 */
import java.util.List;

class Solution {

    /**
     * Checks if a person can attend all scheduled meetings without overlapping.
     *
     * @param intervals A List of Lists of integers representing scheduled meetings.
     * @return boolean true if a person can attend all scheduled meetings without overlapping, false otherwise.
     */
    public boolean canAttendMeetings(List<List<Integer>> intervals) {
        quickSort(intervals, 0, intervals.size() - 1);
        for (int i = 0; i < intervals.size() - 1; i++) {
            if (intervals.get(i).get(1) > intervals.get(i + 1).get(0)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Partition method used in Quick Sort algorithm to partition the List of Lists of integers.
     *
     * @param array A List of Lists of integers representing scheduled meetings.
     * @param low   An integer representing the lowest index of the partition.
     * @param high  An integer representing the highest index of the partition.
     * @return int Returns the partitioning index.
     */
    private int partition(List<List<Integer>> array, int low, int high) {
        int pivot = array.get(high).get(0);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array.get(j).get(0) <= pivot) {
                i++;
                List<Integer> temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
            }
        }
        List<Integer> temp = array.get(i + 1);
        array.set(i + 1, array.get(high));
        array.set(high, temp);
        return i + 1;
    }

    /**
     * Quick Sort algorithm implementation for sorting a List of Lists of integers.
     *
     * @param array A List of Lists of integers representing scheduled meetings.
     * @param low   An integer representing the lowest index of the partition.
     * @param high  An integer representing the highest index of the partition.
     */
    private void quickSort(List<List<Integer>> array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
}
