import java.util.Scanner;
import java.util.Arrays;

public class c_UpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ans = upperBound(arr, target);

        System.out.print(ans);

        sc.close();
    }

    public static int upperBound(int[] arr, int target) {
        Arrays.sort(arr);
        int size = arr.length;

        int ans = size;

        int start = 0, end = size - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > target) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
