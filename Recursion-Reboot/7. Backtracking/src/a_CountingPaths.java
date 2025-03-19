public class a_CountingPaths {
    public static void main(String[] args) {
        System.out.println("Number of ways are: " + findPaths(3, 3));
    }

    static int findPaths(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }

        int firstWay = findPaths(row - 1, col);
        int secondWay = findPaths(row, col - 1);

        return firstWay + secondWay;
    }
}
