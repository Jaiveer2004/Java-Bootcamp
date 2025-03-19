import java.util.Arrays;
import java.util.Scanner;

public class d_MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(arr));

    }

    static void mergeSort(int[] arr, int start, int end) {
        if(start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];

        int left = start, right = mid + 1;
        int index = 0;

        while(left <= mid && right <= end) {
            if(arr[left] <= arr[right]) {
                mix[index++] = arr[left++];
            } else {
                mix[index++] = arr[right++];
            }
        }

        while(left <= mid) {
            mix[index++] = arr[left++];
        }

        while(right <= end) {
            mix[index++] = arr[right++];
        }

        for (int i = 0; i < mix.length; i++) {
            arr[start + i] = mix[i];
        }
    }
}
