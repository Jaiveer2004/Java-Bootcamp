import java.util.Scanner;

public class d_ReversePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int reverse = countReverse(arr, 0, size - 1);

        System.out.println("Reverse Pairs: " + reverse);

        sc.close();
    }

    public static int countPairs(int[] arr, int start, int mid, int end) {
        int second = mid + 1;
        int count = 0;

        for(int i = start; i <= mid; i++) {
            while(second <= end && (long) arr[i] > 2L * arr[second]) second++;
            count += second  - (mid + 1);
        }

        return count;
    }

    public static int countReverse(int[] arr, int start, int end) {
        int count = 0;

        if (start >= end) {
            return count;
        }

        int mid = start + (end - start) / 2;

        count += countReverse(arr, start, mid);
        count += countReverse(arr, mid + 1, end);
        count += countPairs(arr, start, mid, end);
        merge(arr, start, mid, end);

        return count;
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int count = 0;

        int[] temp = new int[end - start + 1];

        int first = start, second = mid + 1, index = 0;

        while (first <= mid && second <= end) {
            if (arr[first] <= arr[second]) {
                temp[index++] = arr[first++];
            } else {
                temp[index++] = arr[second++];
            }
        }

        while (first <= mid) {
            temp[index++] = arr[first++];
        }

        while (second <= end) {
            temp[index++] = arr[second++];
        }

        System.arraycopy(temp, 0, arr, start, temp.length);
    }
}
