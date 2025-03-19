import java.util.*;

// Create all the subsequence of a given string
// Create all the subsets of a given array
public class b_SubSequence {
    public static void main(String[] args) {
        // For Strings
        StringsMain();
    }

    static void StringsMain() {
        String str = "abc";

        // Method 1:
        // printSubsequence(str, "");

        // Type 2:
        // System.out.println(printSubsequenceII(str, ""));

        // Type 3:
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = printSubsets(arr);
        for(List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    // Method 1:
    static void printSubsequence(String str, String ans) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        // Take it
        printSubsequence(str.substring(1), ans + ch);

        // Leave it
        printSubsequence(str.substring(1), ans);
    }

    // Type 2:
    static ArrayList<String> printSubsequenceII(String str, String ans) {
        if(str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        // Take it
        ArrayList<String> left = printSubsequenceII(str.substring(1), ans + ch);

        // Leave it
        ArrayList<String> right = printSubsequenceII(str.substring(1), ans);

        left.addAll(right);

        return left;
    }


    // Type 3: Using Arrays (Iterative Method)
    static List<List<Integer>> printSubsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        // Add an empty list to outer:
        outer.add(new ArrayList<>());

        for(int num : arr) {
            int size = outer.size();
            for(int i = 0; i < size; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
