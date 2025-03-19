public class i_RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("", "aabbbccc"));
    }

    static String removeDuplicates(String p, String up) {

        if(up.isEmpty()) {
            return p;
        }

        if(p.isEmpty()) {
            return removeDuplicates(p + up.charAt(0), up.substring(1));
        }

        char endP = p.charAt(p.length() - 1);
        char endUP = up.charAt(0);

        if(endP == endUP) {
            return removeDuplicates(p, up.substring(1));
        } else {
            return removeDuplicates(p + endUP, up.substring(1));
        }
    }

    // Iterative Approach
    static String removeDuplicates(String str) {

        if(str.isEmpty()) {
            return str;
        }

        StringBuilder ans = new StringBuilder();
        char lastChar = '\0';

        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if(currChar != lastChar) {
                ans.append(currChar);
                lastChar = currChar;
            }
        }

        return ans.toString();

    }
}
