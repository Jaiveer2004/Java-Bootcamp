import java.util.Scanner;

public class i_KokoEatingBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] piles = new int[size];

        for(int i = 0; i < size; i++) {
            piles[i] = sc.nextInt();
        }

        int h = sc.nextInt();


        // System.out.println(bruteForce(piles, h));
        System.out.println(binarySearch(piles, h));
    }

    static int bruteForce(int[] piles, int h) {
        int n = piles.length;

        int ans = 0;
        int maxEle = Integer.MIN_VALUE;

        for(int num : piles) {
            if(num > maxEle) {
                maxEle = num;
            }
        }

        for(int i = 1; i <= maxEle; i++) {
            ans = 0;
            for(int num : piles) {
                ans += (num + i - 1) / i;
            }
            if(ans <= h) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    static int findMinimumHours(int[] piles, int mid) {
        int ans = 0;

        for(int num : piles) {
            ans += (num + mid - 1) / mid;
        }

        return ans;
    }

    static int binarySearch(int[] arr, int h) {
        int start = 1, end = max(arr);
        int ans = Integer.MAX_VALUE;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            int totalHours = findMinimumHours(arr, mid);

            if(totalHours <= h) {
                ans = mid;
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    static int max(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > maxi) maxi = num;
        }

        return maxi;
    }
}
