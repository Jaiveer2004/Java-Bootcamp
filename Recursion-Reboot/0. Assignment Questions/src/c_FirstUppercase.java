public class c_FirstUppercase {
    public static void main(String[] args) {
        String str = "JAIVEER";

        System.out.println(firstUppercaseChar(str, 0));
    }

    static int firstUppercaseChar(String str, int index) {
        if(index == str.length()) return -1;

        char c = str.charAt(index);
        if(c >= 'a' && c <= 'z') {
            return index;
        } else {
            return firstUppercaseChar(str, index + 1);
        }
    }
}
