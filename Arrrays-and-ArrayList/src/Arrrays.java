import java.util.*;
public class  Arrrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // datatype[] name = new datatype[size]
        int[] arr = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5};

        int[] newArr; // declaration of the array. This array is getting defined in the stack
        newArr = new int[5]; // initialization of the array. This array is getting defined in the heap.
        // At initialization, all the elements of the array are initialized to null values (0 in case of int).
        // new int[5] -> [0, 0, 0, 0, 0]
        // Null can only be assigned to the reference type variables.

        /*
        Left side of the assignment operator run during compile time, -> Memory is allocated in the stack.
        Right side of the assignment operator run during runtime. -> Actual object is created in the heap.
        This is known as dynamic memory allocation.

        In Java, Arrays are not contiguous memory allocation. They are not stored in the contiguous memory location.
        Because, Arrays are objects in Java and objects are stored in the heap memory.
        "new" keyword is used to create an object in the heap memory.
         */

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // For each loop
        // for(int i : arr) {
        //     System.out.print(i + " ");
        // }

        // toString(): This method is used to print the array in the string format.
        System.out.println(Arrays.toString(arr)); // Will return the array in the string format. -> [1, 2, 3, 4, 5]

        sc.close();
    }

}
