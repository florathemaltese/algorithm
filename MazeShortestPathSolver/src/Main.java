public class Main {
    public static void main(String[] args) {
        int[][] maze = {{0,0,0,0,0},
                {1,1,0,0,1},
                {0,0,0,0,0},
                {0,1,0,0,1},
                {0,1,0,0,0}};
        int[] start = {4,3};
        int[] destination = {0,1};
        Solution solution = new Solution();
        int result = solution.shortestDistance(maze, start, destination);
        System.out.println(result); // expected output: -1
    }
}
