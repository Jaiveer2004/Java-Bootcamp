import java.util.ArrayList;

public class b_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 8};
        int x = 2;

        // System.out.println(findElement(arr, x, 0));
        ArrayList<Integer> ans = new ArrayList<>();

        // findAll(arr, x, 0, ans);
        // System.out.println(ans);

        // ans = addToList(arr, x, 0, new ArrayList<>());
        // System.out.println(ans);

        ans = addToList2(arr, x, 0);
        System.out.println(ans);

    }

    // Finding the first appearance of the given target "x"
    static int findElement(int[] arr, int x, int index) {
        if(index == arr.length) return -1;

        if(arr[index] == x) return index;

        return findElement(arr, x, index + 1);
    }

    // Using List defined in Main function
    static void findAll(int[] arr, int x, int index, ArrayList<Integer> ans) {
        if(index == arr.length) return;

        if(arr[index] == x) ans.add(index);

        findAll(arr, x, index + 1, ans);
    }

    // Using List as Parameter in the function
    static ArrayList<Integer> addToList(int[] arr, int x, int index, ArrayList<Integer> ans) {
        if(index == arr.length) return ans;

        if(arr[index] == x) ans.add(index);

        return addToList(arr, x, index + 1, ans);
    }

    // Without the use of List as Parameter
    static ArrayList<Integer> addToList2(int[] arr, int x, int index) {
        ArrayList<Integer> ans = new ArrayList<>();

        if(index == arr.length) return ans;

        if(arr[index] == x) ans.add(index);

        ArrayList<Integer> ansFromBelow =  addToList2(arr, x, index + 1);
        ans.addAll(ansFromBelow);

        return ans;
    }
}
