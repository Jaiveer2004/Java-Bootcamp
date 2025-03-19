public class DiceTargetSum {
    public static void main(String[] args) {
        dice("", 4, 6);
    }

    static void dice(String p, int target, int k) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= k && i <= target; i++) {
            dice(p + i, target - i, k);
        }
    }
}
