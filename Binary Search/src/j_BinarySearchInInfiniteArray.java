import java.util.Scanner;

public class j_BinarySearchInInfiniteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // We will consider the following array as infinite array as we don't the length of this array
        int[] arr = {1, 2, 4, 5, 6, 7, 9, 11, 23, 30, 35, 38, 39};

        int x = sc.nextInt();

        System.out.println(findElement(arr, x));
    }

    static int findElement(int[] arr, int x) {
        int start = 0, end = 1;

        while(x > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, x, start, end);
    }

    static int binarySearch(int[] arr, int x, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == x) {
                return mid;
            }
            else if(arr[mid] > x) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
