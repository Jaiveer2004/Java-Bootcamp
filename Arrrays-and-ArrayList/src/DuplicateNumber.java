import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        sort(nums);

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    static void sort(int[] arr) {
        // 1 to n
        int n = arr.length;

        int ptr = 0;

        while(ptr < n) {
            int correctIndex = arr[ptr] - 1;

            if(arr[ptr] != arr[correctIndex]) {
                swap(arr, ptr, correctIndex);
            } else {
                ptr++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
