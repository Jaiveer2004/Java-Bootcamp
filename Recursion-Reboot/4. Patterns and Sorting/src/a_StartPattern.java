import java.util.Arrays;
import java.util.Scanner;

public class a_StartPattern {

    public static void main(String[] args) {
        int n = 5;

        // Pattern 1

        // (Method 1):
        // printPattern1(n);

        // (Method 2):
        // printPattern1(n, 0);

        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

        // Pattern 2

        // Method 1:
        // printPattern2(n);

        // Method 2:
        // printPattern2(n, 0);

        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

    }

    // Pattern 1:
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    // Method 1:
    static void printPattern1(int n) {

        // Base Case
        if(n == 0) return;

        for(int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        printPattern1(n - 1);
    }

    // Method 2:
    static void printPattern1(int row, int col) {

        // Base Condition
        if(row == 0) return;

        if(col < row) {
            System.out.print("* ");
            printPattern1(row, col + 1); // Till col != row
        } else {
            System.out.println();
            printPattern1(row - 1, 0); // reset col to zero in each iteration of row
        }
    }

    // Pattern 2:
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    // Method 1:
    static void printPattern2(int n) {

        // Base Case
        if(n == 0) return;

        printPattern2(n - 1);

        for(int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

    // Method 2:
    static void printPattern2(int row, int col) {

        // Base Condition
        if(row == 0) return;

        if(col < row) {
            printPattern2(row, col + 1); // Till col != row
            System.out.print("* ");
        } else {
            printPattern2(row - 1, 0); // reset col to zero in each iteration of row
            System.out.println();
        }
    }



}
