public class c_RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int x = 7;

        System.out.println(searchElement(arr, 0, arr.length - 1, x));
    }

    static int searchElement(int[] arr, int start, int end, int x) {
        int mid = start + (end - start) / 2;

        // Base Condition
        if(start > end) return -1;

        // Check if middle element is target
        if(arr[mid] == x) return mid;

        // Condition 1: Check which part of array is sorted
        // Left part is sorted
        if(arr[start] <= arr[mid]) {
            if(arr[start] <= x && x < arr[mid]) {
                return searchElement(arr, start, mid - 1, x);
            } else {
                return searchElement(arr, mid + 1, end, x);
            }
        }

        // Right part is sorted
        else {
            if(arr[mid] < x && x <= arr[end]) {
                return searchElement(arr, mid + 1, end, x);
            } else {
                return searchElement(arr, start, mid - 1, x);
            }
        }

    }
}
