// Bitonic Array: Mountain array is also known as bitonic array.
// Question: Find peak in mountain array.

public class k_BitonicArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 0, -1, -2};

        System.out.println(findPeak(arr));
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
}