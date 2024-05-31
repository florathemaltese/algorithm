import java.util.*;

// Define a Solution class
public class Solution {
    // Define a method that calculates the shortest distance from start to destination in a maze
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
    // Get the number of rows and columns in the maze
        int m = maze.length;
        int n = maze[0].length;
    // Initialize a 2D array to store the distance from the start point to each point in the maze
        int[][] distance = new int[m][n];
    // Fill the array with maximum value initially
        for (int i = 0; i < m; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }
        // Set the distance to the start point as 0
        distance[start[0]][start[1]] = 0;
        // Initialize a priority queue with a comparator based on the distance from the start point
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> distance[a[0]][a[1]]));
        // Add the start point to the priority queue
        minHeap.offer(start);
        // Define the possible directions in which to move in the maze
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        // While the priority queue is not empty, keep finding the shortest path
        while (!minHeap.isEmpty()) {
            // Get the current point from the priority queue
            int[] curr = minHeap.poll();
            // Check all the possible directions and move in that direction as long as the cell is not a wall (value = 0)
            for (int[] dir : dirs) {
                int x = curr[0];
                int y = curr[1];
                int cnt = 0;
                while (x + dir[0] >= 0 && x + dir[0] < m && y + dir[1] >= 0 && y + dir[1] < n && maze[x + dir[0]][y + dir[1]] == 0) {
                    x += dir[0];
                    y += dir[1];
                    cnt++;
                }
                // If the new distance is less than the previous distance, update the distance and add the new point to the priority queue
                if (distance[curr[0]][curr[1]] + cnt < distance[x][y]) {
                    distance[x][y] = distance[curr[0]][curr[1]] + cnt;
                    minHeap.offer(new int[]{x, y});
                }
            }
        }
        // Return the distance to the destination point, or -1 if no path exists
        return distance[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 : distance[destination[0]][destination[1]];
    }
}