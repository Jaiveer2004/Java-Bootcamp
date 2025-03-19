public class f_ReverseANumber {

    public static void main(String[] args) {
        int n = 1234;

        // My Method : Using an extra variable
        // System.out.println(reverseI(n, 0));

        // Using User Defined Helper Function
        System.out.println(reverseII(n));

    }

    static int reverseI(int n, int sum) {
        if(n == 0) return sum;

        int rem = n % 10;
        sum = sum * 10 + rem;

        return reverseI(n / 10, sum);
    }

    static int reverseII(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function

        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if(n % 10 == n) return n;

        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
