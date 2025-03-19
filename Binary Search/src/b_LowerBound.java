import java.util.Scanner;
import java.util.Arrays;

public class b_LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ans = lowerBound(arr, target);

        System.out.print(ans);

        sc.close();
    }

    public static int lowerBound(int[] arr, int target) {
        Arrays.sort(arr);
        int size = arr.length;

        int ans = size;

        int start = 0, end = size - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
