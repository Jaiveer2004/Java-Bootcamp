import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearchAlgo();

    }


    public static void BinarySearchAlgo() {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(size);


        for(int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            arr.add(temp);
        }

        // Binary Search
        int x = sc.nextInt();

        Collections.sort(arr);

        int start = 0, end = arr.size() - 1;
        int index = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr.get(mid) == x) {
                index = mid;
                break;
            } else if(arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.print(index);
    }

    public static void AgnosticBinarySearch() {
        /*
        This means if we don't know if the array given to us is in the ascending order or in the descending order?
        In this case, just compare the terminal elements (first element and last element) and if:
        first < last : Ascending Order
        first > last : Descending Order
        And then Apply the method according to the order.
         */
    }
}
