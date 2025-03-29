package e_PrinciplesOfOOPS.Properties.Abstraction;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.calculateArea();
        circle.display();
    }
}

/*
- Shape is abstract and cannot be instantiated (new Shape() would fail).
- calculateArea() is abstract, so Circle must implement it.
- display() is a concrete method inherited and usable by Circle.
 */