public class c_PathWithObstacle {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        path("", 0, 0, maze);
    }

    static void path(String p, int row, int col, boolean[][] maze) {

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // Check for obstacle:
        if(!maze[row][col]) {
            return;
        }

        // Way 1:
        if(row < maze.length - 1) {
            path(p + " D", row + 1, col, maze);
        }

        // Way 2:
        if(col < maze[0].length - 1) {
            path(p + " R", row, col + 1, maze);
        }
    }
}
