import java.util.*;

public class e_FirstAndLastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(size);

        for(int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            arr.add(temp);
        }

        int k = sc.nextInt();

        int first = FirstOcc(arr, k);
        int last = LastOcc(arr, k);

        System.out.println("First: " + first + ", Last: " + last);
        System.out.print("No. of occ: " + (last - first + 1));

        sc.close();
    }

    // Function to find the First Occ:
    public static int FirstOcc(ArrayList<Integer> arr, int k) {
        int ans = -1;
        int start = 0, end = arr.size() - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if(midVal == k) {
                ans = mid;
                end = mid - 1;
            }

            else if(midVal > k) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    // Function to find the Last Occ:
    public static int LastOcc(ArrayList<Integer> arr, int k) {
        int ans = -1;
        int start = 0, end = arr.size() - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if(midVal == k) {
                ans = mid;
                start = mid + 1;
            }

            else if(midVal > k) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }


        return ans;
    }
}
