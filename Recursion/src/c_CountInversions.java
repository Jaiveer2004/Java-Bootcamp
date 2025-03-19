import java.util.Scanner;

public class c_CountInversions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int inversions = countInversions(arr, 0, size - 1);

        System.out.println("Inversions: " + inversions);

        sc.close();
    }

    public static int countInversions(int[] arr, int start, int end) {
        int count = 0;

        if (start >= end) {
            return count;
        }

        int mid = start + (end - start) / 2;

        count += countInversions(arr, start, mid);
        count += countInversions(arr, mid + 1, end);

        count += merge(arr, start, mid, end);

        return count;
    }

    public static int merge(int[] arr, int start, int mid, int end) {
        int count = 0;

        int[] temp = new int[end - start + 1];

        int first = start, second = mid + 1, index = 0;

        while (first <= mid && second <= end) {
            if (arr[first] <= arr[second]) {
                temp[index++] = arr[first++];
            } else {
                temp[index++] = arr[second++];
                if(arr[first] > 2 * arr[second]) {
                    count += (mid - first + 1);
                }
            }
        }

        while (first <= mid) {
            temp[index++] = arr[first++];
        }

        while (second <= end) {
            temp[index++] = arr[second++];
        }

        System.arraycopy(temp, 0, arr, start, temp.length);

        return count;
    }
}
