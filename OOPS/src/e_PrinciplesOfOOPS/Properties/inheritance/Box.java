package e_PrinciplesOfOOPS.Properties.inheritance;

public class Box {
    double l;
    double b;
    double h;

    Box() {

    }

    // Cube
    Box(double side) {
        super();
        this.l = side;
        this.b = side;
        this.h = side;
    }

    // Rectangle
    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    // Copy Constructor
    Box(Box old) {
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public void showInfo() {
        System.out.println("This is a message for showing info.");
    }
}
