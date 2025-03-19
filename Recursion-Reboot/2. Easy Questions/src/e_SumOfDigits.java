public class e_SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        
        // Method 1: Using extra variable (ans)
        // System.out.println(sumI(n, 0));

        // Method 2: Using a single variable
        System.out.println(sumII(n));
    }

    static int sumI(int n, int ans) {
        if(n == 0) {
            return ans;
        }

        ans += n % 10;

        return sumI(n / 10, ans);
    }

    static int sumII(int n) {
        if(n == 0) {
            return 0;
        }

        return (n % 10) + sumII(n / 10);
    }
}
