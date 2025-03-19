public class o_SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        start = maximumEle(nums);
        end = sumOfArray(nums);

        while(start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums) {
                if (sum + num > mid) {
                   sum = num;
                   pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }

    static int maximumEle(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > maxi) {
                maxi = num;
            }
        }

        return maxi;
    }

    static int sumOfArray(int[] arr) {
        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        return sum;
    }
}
