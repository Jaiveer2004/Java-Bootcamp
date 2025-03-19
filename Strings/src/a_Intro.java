public class a_Intro {
    public static void main(String[] args) {
        // How to initialize a string:
        String str = "Jaiveer";
        // This would create a new reference variable "str" in the stack memory and a new object in the string pool which is located in the heap memory.

        // If we reinitialize the string, we are creating a new object in the heap memory and then pointing the str variable to the new object.
        str = "Singh";

        // Comparison of two strings:
        // How can we check if two reference variables point to the same object?
        // By using the == operator.
        String a = "Jaiveer";
        String b = "Jaiveer";

        // System.out.println(a == b); // This would return true if they point to the same object. Else False

        // How to check if value of two strings are equal?
        // By using the equals() method.
        // System.out.println(a.equals(b));

        // Let's test both methods again:
        String c = new String("Jaiveer");
        // System.out.println(c == a); // This would return false. Because when we create a String using a new keyword, it creates a new object in the heap memory.
        // System.out.println(c.equals(a));

        // How to access the elements char by char in a String
        // By using the charAt() method.
        String str1 = "Jaiveer";
        // System.out.println(str1.charAt(0)); // This would return the character at 0th index of the string.

        // **********************************************************************

        // Pretty Printing in Java

        // 1. How to print till two or mentioned digits after decimal?
        float k = 123.456789f;
        // System.out.printf("Formatted String: %.2f", k);
        // System.out.printf("The value of PI is: %.3f", Math.PI);

        // 2. Can also be used to print a string.
        // System.out.printf("Name 1 is: %s and Name 2 is: %s", "Jaiveer", "Kaka");

        // ************************************************************************

        // Concatenation of Strings
        // System.out.println('a' + 'b'); // 195
        // System.out.println("a" + "b"); // ab
        // System.out.println((char) ('a' + 3)); // d

        // System.out.println("a" + 3); // a3 -> 3 will be converted to string and then added to "a"


        // ************************************************************************

        // Performance of Concatenation in Strings
        String s1 = "";

        for(int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            s1 += ch;
        }

        // This will create 26 new objects, which would result in inefficient use of memory.
        // So, to avoid this we use "StringBuilder" class.

        // String Builder:
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        // This will add char to the same object in each iteration

        System.out.println(sb);

    }
}
