public class h_PowerOfTwo {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(checkIfSquare(n));
        System.out.println(square(n, 2));
        System.out.println(checkIfSquare(n, 0, n));
    }

    static int square(int n, int i) {
        if(i == 0) return 1;

        return n * square(n, i - 1);
    }

    static boolean checkIfSquare(int n) {
        if(n == 1) return true;

        if(n % 2 == 1) return false;

        return checkIfSquare(n / 2);
    }

    static boolean checkIfSquare(int n, int start, int end) {
        if(start > end) return false;

        long mid = start + (end - start) / 2;
        long square = mid * mid;


        if(square == n) return true;
        else if(square > n) return checkIfSquare(n, start, (int) mid - 1);
        else return checkIfSquare(n, (int) mid + 1, end);

    }
}
