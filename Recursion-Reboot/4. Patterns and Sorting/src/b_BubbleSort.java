import java.util.Arrays;
import java.util.Scanner;

public class b_BubbleSort {

    public static void main(String[] args) {
        // Bubble sort using recursion
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble Sort using Recursion

    // Method 1:
    static void bubbleSort(int[] arr, int i, int j) {
        if(i == 0) return;

        if(j < i) {
            if(arr[j] > arr[j  + 1]) {
                swap(arr, j, j + 1);
            }
            bubbleSort(arr, i, j + 1);
        } else {
            bubbleSort(arr, i - 1, 0);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
