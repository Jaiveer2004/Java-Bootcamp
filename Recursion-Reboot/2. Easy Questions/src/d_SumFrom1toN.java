public class d_SumFrom1toN {
    public static void main(String[] args) {
        int n = 10;

        System.out.print(sum(n));
    }

    static int sum(int n) {
        if(n == 0) return 0;

        return n + sum(n - 1);
    }
}
