import java.util.ArrayList;
import java.util.Arrays;

public class d_BackTracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        ArrayList<String> ans = backTrack("", 0, 0, maze);
        // System.out.println(ans);

        // Additional Question:
        int[][] path = new int[maze.length][maze[0].length];
        backTrackPrint("", 0, 0, maze, path, 1);
    }

    static ArrayList<String> backTrack(String p, int row, int col, boolean[][] maze) {

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(!maze[row][col]) {
            return new ArrayList<>();
        }

        // If I am considering this cell, then set it as false.
        maze[row][col] = false;

        ArrayList<String> list = new ArrayList<>();

        // Way 1: South (Down)
        if(row < maze.length - 1) {
            list.addAll(backTrack(p + "S", row + 1, col, maze));
        }


        // Way 2: North (Up)
        if(row > 0) {
            list.addAll(backTrack(p + "N", row - 1, col, maze));
        }

        // Way 3: East (Right)
        if(col < maze[0].length - 1) {
            list.addAll(backTrack(p + "E", row, col + 1, maze));
        }

        // Way 4: West (Left)
        if(col > 0) {
            list.addAll(backTrack(p + "W", row, col - 1, maze));
        }

        // This is where the function would return.
        // So, for backtracking we need to set the cells to true before the recursive call ends
        maze[row][col] = true;

        return list;
    }

    // Additional Question
    static void backTrackPrint(String p, int row, int col, boolean[][] maze, int[][] path, int steps) {

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            path[row][col] = steps;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        // If I am considering this cell, then set it as false.
        maze[row][col] = false;
        path[row][col] = steps;

        ArrayList<String> list = new ArrayList<>();

        // Way 1: South (Down)
        if(row < maze.length - 1) {
            backTrackPrint(p + "S", row + 1, col, maze, path, steps + 1);
        }


        // Way 2: North (Up)
        if(row > 0) {
            backTrackPrint(p + "N", row - 1, col, maze, path, steps + 1);
        }

        // Way 3: East (Right)
        if(col < maze[0].length - 1) {
            backTrackPrint(p + "E", row, col + 1, maze, path, steps + 1);
        }

        // Way 4: West (Left)
        if(col > 0) {
            backTrackPrint(p + "W", row, col - 1, maze, path, steps + 1);
        }

        // This is where the function would return.
        // So, for backtracking we need to set the cells to true before the recursive call ends
        maze[row][col] = true;
        path[row][col] = 0;

    }

}
