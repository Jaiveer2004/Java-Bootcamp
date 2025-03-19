import java.util.Arrays;

public class c_SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr, arr.length, 0, 0);

        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int start, int end, int max) {
        if(start == 0) return;

        if(end < start) {
            if(arr[end] > arr[max]) {
                selectionSort(arr, start, end + 1, end);
            }
            else {
                selectionSort(arr, start, end + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[start - 1];
            arr[start - 1] = temp;

            selectionSort(arr, start - 1, 0, 0);
        }

    }
}
