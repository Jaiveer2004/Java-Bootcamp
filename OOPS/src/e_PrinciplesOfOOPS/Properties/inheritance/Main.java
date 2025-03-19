package e_PrinciplesOfOOPS.Properties.inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(25.0, 25.0, 25.0, 25.0);
        b1.showInfo();

        Box b2 = new BoxWeight(25.0, 25.0, 25.0, 25.0);
        // System.out.println(b2.w); // This would result in error.
    }
}
