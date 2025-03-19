public class c_ProductFromNto1 {
    public static void main(String[] args) {
        int n = 5, ans;

        // My Method : By using an extra variable for storing the product at each level.
        // ans = product(n, 1);

        // Factorial Method : By using a single variable "n" and then returning it.
        ans = productII(n);

        System.out.println(ans);
    }

    static int product(int n, int ans) {
        if(n <= 1) return ans;

        ans *= n;
        return product(n - 1, ans);
    }

    static int productII(int n) {
        if(n == 0) return 1;

        return n * productII(n - 1);
    }
}
