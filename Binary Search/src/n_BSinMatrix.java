/*
Binary Search in a 2D Array:
Array is internally sorted : Sorted Column Wise

For Example:
1 2 3
4 5 6
7 8 9

The matrix can be m x n too.
*/

 /* This is the answer i came across before watching the solution.
    Find the row in which the target can be : By checking the last element of that row and then checking the first element of that row
    For Example: We are given the following problem
    mat = 1     2       3       4
          56    89      100     120
          7     12      37      43
          5     88      96      455
    target = 37
    Expected Output = [2, 2]

    Check the range of each last element of the row
    We want to find out 37.
    In the first row, largest element (last column) is 4, which is less than what we need. So, we need to move to the next row : row++
    In the second row, largest element (last col) is 120, which exceeds the target, Means it is a possible answer. Now check and compare the target with the first element of the row : which is 56 exceeds the target : Move to the next row
    In third row, last col is 43 : Which can be the possible answer. Check for the 1st element of the row : 7, which is less than the target and target lies between first element and last element : Apply binary search on this row : If answer not found, proceed to the next row. We will get the answer here. But for hypothetical observation, lets proceed to the next row.
    In the fourth row, last col is 455: which can be a possible answer.  Check for the 1st element of the row : 5, which is less than the target and target lies between first element and last element : Apply binary search on this row : If answer not found, as this is the last row, return -1.
 */

import java.util.Arrays;
import java.util.Scanner;

public class n_BSinMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();


        int[][] mat = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchElement(mat, target)));
    }



   static int[] searchElement(int[][] mat, int target) {

        int row = 0;
        int col = mat[0].length - 1;

        while(row < mat.length && col >= 0) {

            if(mat[row][col] == target) {
                return new int[] {row, col};
            }

            if(mat[row][col] > target) {
                col--;
            } else {
                row++;
            }

        }

        return new int[] {-1, -1};
   }


}