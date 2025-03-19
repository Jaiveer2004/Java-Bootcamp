import java.util.Arrays;

public class a_SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Method 1:
        // printSumTriangle(arr);

        // Method 2:
        printSumTriangle2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Method 1:
    static void printSumTriangle(int[] arr) {
        if(arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        int[] temp = new int[arr.length - 1];

        for(int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }

        printSumTriangle(temp);
        System.out.println(Arrays.toString(arr));

    }


    // Method 2: Using a helper function
    static void printSumTriangle2(int[] arr) {
        if(arr.length == 1) {
            return;
        }

        int[] temp = new int[arr.length - 1];

        helper(arr, temp, 0);
        printSumTriangle2(temp);

        System.out.println(Arrays.toString(temp));
    }

    static int[] helper(int[] arr, int[] temp, int index) {
        if(index == arr.length - 1) {
            return temp;
        }

        temp[index] = arr[index] + arr[index + 1];

        return helper(arr, temp, index + 1);
    }

}
