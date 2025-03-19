import java.util.Arrays;

public class d_ReverseAString {
    public static void main(String[] args) {
        String str = "Jaiveer";

        char[] s = str.toCharArray();

        reverse(s, 0, str.length() - 1);

        System.out.println(Arrays.toString(s));
    }

    static void reverse(char[] s, int start, int end) {
        if(start >= end) return;

        swap(s, start, end);

        reverse(s, start + 1, end - 1);
    }

    static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
