public class SearchTargetRunner {
    public static void main(String[] args) {
        int[] nums = {6, 7, 8, 2, 3, 4, 5};
        int target = 2;
        int ans = SearchTarget.searchTarget(nums, target);
        System.out.println(ans);
    }
}