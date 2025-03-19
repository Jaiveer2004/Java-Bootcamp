public class g_PrimeOrNot {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(checkPrime(n, 2));
    }

    static boolean checkPrime(int n, int i) {
        if(n <= 2) return n == 2;

        if(n % i == 0) return false;

        if(i * i > n) return true;

        return checkPrime(n, i + 1);
    }
}
