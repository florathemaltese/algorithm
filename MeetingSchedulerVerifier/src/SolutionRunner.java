import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionRunner {
    public static void main(String[] args) {

        // Create an empty ArrayList of ArrayLists, where each inner list represents an interval
        List<List<Integer>> intervals = new ArrayList<>();

        // Add two intervals to the intervals list using the Arrays.asList() method
        intervals.add(Arrays.asList(7, 10));
        intervals.add(Arrays.asList(2, 4));

        // Create a Solution object
        Solution solution = new Solution();

        // Call the canAttendMeetings method of the Solution object with the intervals list as input
        boolean canAttend = solution.canAttendMeetings(intervals);

        // Print the result of the canAttendMeetings method to the console
        System.out.println("Can attend meetings: " + canAttend);
    }
}

