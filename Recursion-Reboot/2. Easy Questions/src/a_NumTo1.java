public class a_NumTo1 {
    public static void main(String[] args) {
        int n = 10;
        decrementer(n);
    }

    static void decrementer(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        decrementer(n - 1);
    }
}
