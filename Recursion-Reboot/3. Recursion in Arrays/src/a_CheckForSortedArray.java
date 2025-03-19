public class a_CheckForSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5};

        System.out.println(checkSorted(arr));
    }

    static boolean checkSorted(int[] arr) {
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int index) {
        if(index == arr.length - 1) return true;

        return arr[index] < arr[index + 1] && helper(arr, index + 1);
    }
}

/*
* Reccurence Relation :
* F(n) = arr[index] < arr[index + 1] && next indices
 */