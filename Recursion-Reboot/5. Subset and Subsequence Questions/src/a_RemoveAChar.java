import java.util.Scanner;

public class a_RemoveAChar {
    public static void main(String[] args) {
        String s = "abacad";

        // Method 1:
        StringBuilder ans = new StringBuilder();
        // System.out.println(skipAChar(s, 0, ans));

        // Method 2:
        // System.out.println(skipAChar(s));

        // Question 2: Skip a string
        s = "bcdappleabc";
        System.out.println(skipAString(s));

    }

    // Method 1:
    static String skipAChar(String s, int index, StringBuilder ans) {
        if(index == s.length()) return ans.toString();

        char ch = s.charAt(index);

        if(ch != 'a') {
            ans.append(ch);
        }

        return skipAChar(s, index + 1, ans);

    }


    // Method 2:
    static String skipAChar(String s) {

        if(s.isEmpty()) return "";

        char ch = s.charAt(0);

        if(ch != 'a') {
            return ch + skipAChar(s.substring(1));
        } else {
            return skipAChar(s.substring(1));
        }
    }

    // Question 2: Skip a string
    static String skipAString(String s) {

        if(s.isEmpty()) return "";

        if(s.startsWith("apple")) {
            return skipAString(s.substring(5));
        } else {
            return s.charAt(0) + skipAString(s.substring(1));
        }
    }

}
