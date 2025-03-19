import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(size);

        for(int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            arr.add(temp);
        }

        // Linear Search
        int x = sc.nextInt();

        for(int i = 0; i < size; i++) {
            if(arr.get(i) == x) {
                System.out.print(i);
                break;
            }
        }

        /*
        Time Complexity : O(size), where "size" is the size of the array
        Space Complexity : O(1)
         */

    }
}
