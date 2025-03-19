import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        * What is ArrayList?
        * ArrayList is a part of Collection Framework and is present in java.util package.
        * It provides us dynamic arrays in Java.
        * It is similar to vectors in C++.
        * It can grow and shrink in size.
        * It is used when we don't know how much size we want of the array.
         */

        // Syntax: ArrayList<datatype> name = new ArrayList<datatype>();
        ArrayList<Integer> list = new ArrayList<>();

        /*
         * Here, Integer is a wrapper class. It is used to convert primitive data types into objects.
         * How is Integer different from int?
         * Integer is a class while int is a primitive data type.

         * Integer belongs to java.lang package while int is a part of java primitive data types.

         * Integer is used to convert primitive data types into objects.
         * int is used to declare variables.

         * Integer can be used to store null values.
         * int cannot store null values.

         * Integer can be used to declare objects.
         * int cannot be used to declare objects.
         */

        /*
        * Internal working of ArrayList:
        * ArrayList is implemented using an array.
        * When we create an ArrayList, it creates an array of size 10 by default.
        * When we add the 11th element, the size of the array is doubled.
        * The elements of the old array are copied to the new array (of double size).
        * The old array is deleted.
        * This process is known as re-sizing.
        * This process is time-consuming.
        * To avoid this, we can specify the size of the ArrayList.
         */

        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Printing the ArrayList
        System.out.println(list); // [10, 20, 30, 40, 50]

        // Updating the element at index 2
        list.set(2, 100);

        /*
        * set() method is used to update the element at a particular index.
        * Syntax: list.set(index, element);
        * get() method is used to get the element at a particular index.
        * Syntax: list.get(index);
        * remove() method is used to remove the element at a particular index.
        * Syntax: list.remove(index);
        * add() method is used to add the element at the end of the ArrayList.
        * Syntax: list.add(element);
        * size() method is used to get the size of the ArrayList.
        * Syntax: list.size();
        * clear() method is used to remove all the elements from the ArrayList.
        * Syntax: list.clear();
        * isEmpty() method is used to check if the ArrayList is empty or not.
        * Syntax: list.isEmpty();
        * contains() method is used to check if the element is present in the ArrayList or not.
        * Syntax: list.contains(element);
        * indexOf() method is used to get the index of the element.
        * Syntax: list.indexOf(element);
        * lastIndexOf() method is used to get the last index of the element.
        * Syntax: list.lastIndexOf(element);
        * toArray() method is used to convert the ArrayList into an array.
        * Syntax: list.toArray();
        * And More...
         */

    }
}
