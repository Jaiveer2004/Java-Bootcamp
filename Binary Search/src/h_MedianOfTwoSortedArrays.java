import java.util.Scanner;

public class h_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int[] a = new int[size1];
        int[] b = new int[size2];

        for(int i = 0; i < size1; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < size2; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(bruteForce(a, b));
    }

    // Brute Force:
    static double bruteForce(int[] a, int[] b) {
        int[] mix = merge(a, b);

        int size = mix.length;

        double median = 0;
        int mid = size / 2;

        // size is even
        if(size % 2 == 0) {
            median = (mix[mid] + mix[mid - 1]) / 2.0;
        }
        // size is odd
        else {
            median = mix[mid];
        }

        return median;
    }

    static int[] merge(int[] a, int[] b) {
        int[] mix = new int[a.length + b.length];

        int size1 = a.length;
        int size2 = b.length;

        int first = 0, second = 0;
        int index = 0;

        while (first < size1 && second < size2) {
            if(a[first] <= b[second]) {
                mix[index++] = a[first++];
            } else {
                mix[index++] = b[second++];
            }
        }

        while (first < size1) {
            mix[index++] = a[first++];
        }

        while (second < size2) {
            mix[index++] = b[second++];
        }

        return mix;
    }

    // Optimized (Binary Search):
    static double optimized(int[] a, int[] b) {
        return 0.0;
    }
}
