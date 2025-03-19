import java.util.Arrays;
import java.util.Scanner;

public class e_QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if(low >= high) return;

        int start = low;
        int end = high;

        // Let pivot element be middle element
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while(start <= end) {

            // This condition prevents the sub arrays from sorting if they are already sorted.
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;

            // If these both conditions fail, then we need to swap values of start and end
            if(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        // Now pivot is at correct position, we need to call recursively to sort the left and right part of pivot.
        sort(arr, low, end);
        sort(arr, start, high);

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
