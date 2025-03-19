import java.util.Scanner;

public class f_Geekonacci_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(geekonacciNum(a, b, c, n));
    }
    static int geekonacciNum(int a, int b, int c, int n) {
        if(n == 1) return a;
        if(n == 2) return b;
        if(n == 3) return c;

        return geekonacciNum(a, b, c, n - 1) + geekonacciNum(a, b, c, n - 2) + geekonacciNum(a, b, c, n - 3);
    }

}
