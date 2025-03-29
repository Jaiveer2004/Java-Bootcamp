package e_PrinciplesOfOOPS.Properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();

        Shapes circle = new Circle();
        circle.area();
    }
}
