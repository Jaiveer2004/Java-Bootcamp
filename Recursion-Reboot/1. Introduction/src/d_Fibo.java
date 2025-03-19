/*
 * Reccurence Relation : The function by which we can define recursion.
 * For Fibonnaci Number:
 * Fibo(n) = Fibo(n - 1) + Fibo(n - 2)
 */

public class d_Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }
    static int fibo(int n) {
        // Base Condition
        if(n == 0 || n == 1) return n;

        // Recursive call
        return fibo(n - 1) + fibo(n - 2);
    }
}

