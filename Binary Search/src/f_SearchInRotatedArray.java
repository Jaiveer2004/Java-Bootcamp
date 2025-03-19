import java.util.*;

public class f_SearchInRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(size);

        for(int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            arr.add(temp);
        }

        int k = sc.nextInt();

        System.out.print(searchElement(arr, k));

    }

    public static int searchElement(ArrayList<Integer> arr, int k) {
        int size = arr.size();
        int ans = -1;

        

        return ans;
    }
}
