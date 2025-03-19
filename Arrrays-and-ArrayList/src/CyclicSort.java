import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        // sort(arr);
        //
        // System.out.println(Arrays.toString(arr));

        // Missing Number:
        missingNumMain();
    }

    static void sort(int[] arr) {
        // 1 to n
        int n = arr.length;

        int ptr = 0;

        while(ptr < n) {
            int correctIndex = arr[ptr] - 1;

            if(arr[ptr] != arr[correctIndex]) {
                swap(arr, ptr, correctIndex);
            } else {
                ptr++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void missingNumMain() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        for(int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the missing number:

        // Step 1:
        sortForMissing(arr);

        // Step 2:
        int ans = findMissing(arr);

        if(ans == -1) {
            ans = n;
        }

    }

    static void sortForMissing(int[] arr) {
        int n = arr.length;

        int ptr = 0;
        while(ptr < n) {
            int correctIndex = arr[ptr];

            if(arr[ptr] < n && arr[ptr] != arr[correctIndex]) {
                swap(arr, ptr, correctIndex);
            } else {
                ptr++;
            }
        }
    }

    static int findMissing(int[] arr) {
        int ptr = 0;
        while(ptr < arr.length) {
            if(arr[ptr] != ptr) {
                return ptr;
            }
            ptr++;
        }

        return -1;
    }
}
