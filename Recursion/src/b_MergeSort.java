import java.util.Scanner;

public class b_MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, size - 1);

        for(Integer num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void mergeSort(int[] arr, int start, int end) {
        // Base Condition
        if(start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {
        // 1st part: start -> mid
        // 2nd part: mid + 1 -> end

        int[] temp = new int[end - start + 1];

        int first = 0, second = mid + 1;
        int index = 0;

        while(first <= mid && second <= end) {
            if(arr[first] <= arr[second]) {
                temp[index++] = arr[first++];
            } else {
                temp[index++] = arr[second++];
            }
        }

        while(first <= mid) {
            temp[index++] = arr[first++];
        }

        while(second <= end) {
            temp[index++] = arr[second++];
        }

        System.arraycopy(temp, 0, arr, start, temp.length);
    }

}
