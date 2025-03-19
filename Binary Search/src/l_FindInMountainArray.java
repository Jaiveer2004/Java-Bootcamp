public class l_FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int result = search(arr, target);
        System.out.println(result);
    }
    static int search(int[] arr, int target) {
        int peak = findPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // Answer lies on the left side of the array
                end = mid;
            } else {
                // Answer lies on the right side of the array
                start = mid + 1;
            }
        }

        // In the end, the start == end and will be pointing to the peak element.
        // So, Just return any one of them
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(arr[mid] > target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] < target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}

// In leetcode question: Just use .get() method which is defined inside an interface to get the values of the array.
// len = mountainArr.length() -> already defined in the Interface.
