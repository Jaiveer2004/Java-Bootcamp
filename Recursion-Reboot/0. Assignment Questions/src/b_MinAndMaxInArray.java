import java.util.Arrays;

public class b_MinAndMaxInArray {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        int[] ans = minAndMax(arr);

        System.out.println(Arrays.toString(ans));

    }

    static int[] minAndMax(int[] arr) {
        int minEle = minElement(arr, arr.length - 1);
        int maxEle = maxElement(arr, arr.length - 1);

        return new int[]{minEle, maxEle};
    }

    static int minElement(int[] arr, int n) {
        if(n == 1) return arr[0];

        return Math.min(arr[n - 1], minElement(arr, n - 1));
    }

    static int maxElement(int[] arr, int n) {
        if(n == 1) return arr[0];

        return Math.max(arr[n - 1], maxElement(arr, n - 1));
    }

}
