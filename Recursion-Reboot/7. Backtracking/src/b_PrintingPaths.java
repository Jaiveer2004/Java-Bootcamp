import java.util.ArrayList;

public class b_PrintingPaths {
    public static void main(String[] args) {
        // printPaths("", 4, 4);
        ArrayList<String> ans = printPathsWithDiagonal("", 3, 3);
        System.out.println(ans + " Number of ways: " + ans.size());
    }

    // In this part we can only move down and right:
    static void printPaths(String p, int row, int col) {

        if(row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        // Way 1:
        if(row > 1) {
            printPaths(p + " D", row - 1, col);
        }

        // Way 2:
        if(col > 1) {
            printPaths(p + " R", row, col - 1);
        }
    }

    // In this part, we can move down, right and diagonally (3 ways)
    static ArrayList<String> printPathsWithDiagonal(String p, int row, int col) {

        if(row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(row > 1 && col > 1) {
            list.addAll(printPathsWithDiagonal(p + "D", row - 1, col - 1));
        }

        if(row > 1) {
            list.addAll(printPathsWithDiagonal(p + "V", row - 1, col));
        }

        if(col > 1) {
            list.addAll(printPathsWithDiagonal(p + "R", row, col - 1));
        }

        return list;
    }
}
