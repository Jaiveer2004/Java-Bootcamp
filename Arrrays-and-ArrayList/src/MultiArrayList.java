import java.util.ArrayList;
import java.util.*;
public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Adding elements to the 2D ArrayList
        for(int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Adding elements to the 2D ArrayList
        list.get(0).add(10);
        list.get(0).add(20);
        list.get(0).add(30);

        list.get(1).add(40);
        list.get(1).add(50);
        list.get(1).add(60);

        list.get(2).add(70);
        list.get(2).add(80);
        list.get(2).add(90);

        // Printing the 2D ArrayList
        System.out.println(list);

        // Accessing the elements of the 2D ArrayList
        System.out.println(list.get(0).get(0)); // 10
        System.out.println(list.get(1).get(1)); // 50
        System.out.println(list.get(2).get(2)); // 90

        sc.close();
    }
}
