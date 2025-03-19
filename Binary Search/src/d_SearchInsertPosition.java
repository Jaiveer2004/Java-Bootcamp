import java.util.*;

public class d_SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(size);

        for(int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            arr.add(temp);
        }

        int x = sc.nextInt();

        int start = 0, end = size - 1;
        int ans = size;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr.get(mid) >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
