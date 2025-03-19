public class e_LengthOfString {
    public static void main(String[] args) {
        String str = "Jaiveer";

        System.out.println(findLength(str));
    }

    static int findLength(String str) {
        if(str.isEmpty()) return 0;
        else return 1 + findLength(str.substring(1));
    }
}
