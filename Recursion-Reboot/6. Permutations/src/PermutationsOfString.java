import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsOfString {
    public static void main(String[] args) {
        // permutations("", "123");
        ArrayList<String> ans = permutation("", "abc");
        System.out.println(ans);
    }

    static void permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i); // 'i' is exclusive here
            String second = p.substring(i); // this will take a substring from i till end of the string 'p'
            permutations(first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String> permutation(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);

            list.addAll(permutation(first + ch + second, up.substring(1)));
        }

        return list;
    }
}
