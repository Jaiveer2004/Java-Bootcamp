import java.util.Scanner;

public class e_BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 1; i <= 5; i++) {
            arr[i - 1] = i;
        }
        // arr = 1, 2, 3, 4, 5

        int x = 4;

        int ans = binarySearch(arr, 0, 4, x);

        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int start, int end, int x) {

        // Base Condition
        if(start > end) return -1;

        int mid = start + (end - start) / 2;

        if(arr[mid] == x) return mid;
        else if(arr[mid] < x) return binarySearch(arr, mid + 1, end, x);
        else return binarySearch(arr, start, mid - 1, x);
    }
}
