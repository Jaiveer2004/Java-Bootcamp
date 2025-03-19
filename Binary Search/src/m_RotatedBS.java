import java.util.Arrays;

public class m_RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 1, 2, 3};
        int target = 0;
        System.out.println(search(arr, target));
    }

    // Search in Rotated Sorted Array
    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        if(pivot == -1) {
            // Means array is not rotated
            // Just perform normal BS
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // If pivot found, we have now two sorted array separated by pivot

        // If pivot is equal to target, just return the pivot
        if(arr[pivot] == target) {
            return pivot;
        }

        // Now, we will check if the target lies between [start, pivot] or [pivot, end]
        if(target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // arr[start] <= arr[mid] which means array is sorted from start to mid, we should proceed to mid + 1to check further
            if(arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if start == mid == end, then we need to skip (start and end) which are the duplicate elements
            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // skip the duplicates
                if(start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if(end > 0 && end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                if(end > start) {
                    end--;
                } else {
                    break;
                }
            }

            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
