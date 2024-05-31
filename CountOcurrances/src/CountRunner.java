public class CountRunner {
    public static void main(String[] args) {
    int[] array = {2, 2, 3, 3, 4, 4, 4,4, 8, 8, 8, 8, 8, 9, 9, 10, 12, 15};
    int target = 2;
    int count = CountOccurrences.countOccurrences(array, target);
    System.out.println(count);
    }
}
