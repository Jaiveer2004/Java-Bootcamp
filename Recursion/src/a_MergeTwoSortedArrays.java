import java.util.ArrayList;
import java.util.Scanner;

public class a_MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        for(int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = merge(arr1, arr2);

        for (Integer i : ans) {
            System.out.print(i + " ");
        }


    }

    public static ArrayList<Integer> merge(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;

        ArrayList<Integer> ans = new ArrayList<Integer>();
        int index = 0;

        int first = 0, second = 0;

        while(first < size1 && second < size2) {
            if(arr1[first] <= arr2[second]) {
                ans.add(index, arr1[first]);
                first++;
            } else {
                ans.add(index, arr2[second]);
                second++;
            }
            index++;
        }

        while(first < size1) {
            ans.add(index, arr1[first]);
            first++;
            index++;
        }

        while(second < size2) {
            ans.add(index, arr2[second]);
            second++;
            index++;
        }

        return ans;
    }
}
