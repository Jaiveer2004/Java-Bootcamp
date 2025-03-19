import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr.add(temp);
        }

        System.out.println("Before: " + arr.toString());

        reverseTheArrayList(arr);

        System.out.println("After: " + arr.toString());

    }

    public static void reverseTheArrayList(ArrayList<Integer> arr) {
        int start = 0, end = arr.size() - 1;

        while(start < end) {
            swap(arr, start, end);

            start++;
            end--;
        }
    }

    public static void swap(ArrayList<Integer> arr, int num1, int num2) {
        int temp = arr.get(num1);
        arr.set(num1, arr.get(num2));
        arr.set(num2, temp);
    }

}
