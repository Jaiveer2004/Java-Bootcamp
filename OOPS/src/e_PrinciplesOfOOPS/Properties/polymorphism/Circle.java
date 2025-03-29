package e_PrinciplesOfOOPS.Properties.polymorphism;

public class Circle extends Shapes{

    @Override // This is
    void area() {
        System.out.println("The area of Circle is: pie * r * r");
    }
}
