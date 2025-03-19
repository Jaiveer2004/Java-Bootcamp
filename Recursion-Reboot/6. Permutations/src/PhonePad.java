import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        ArrayList<String> ans = phonePad("", "23");
        System.out.println(ans);
    }

    static ArrayList<String> phonePad(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        int start = (digit - 2) * 3;
        int end = start + 3;

        if(digit == 7 || digit == 9) {
            end += 1;
        }

        if(digit > 7) {
            start += 1;
        }

        for(int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            list.addAll(phonePad(p + ch, up.substring(1)));
        }

        return list;
    }
}
