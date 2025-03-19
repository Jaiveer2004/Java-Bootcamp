public class b_1ToNum {
    public static void main(String[] args) {
        int n = 10;
        incrementer(n);
    }

    static void incrementer(int n) {
        if(n == 0) {
            return;
        }

        incrementer(n - 1);
        System.out.println(n);
    }
}
