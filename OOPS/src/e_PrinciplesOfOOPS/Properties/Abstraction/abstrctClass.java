package e_PrinciplesOfOOPS.Properties.Abstraction;

abstract class Shape {
    double area;

    void display() {
        System.out.println("Area: " + area);
    }

    abstract void calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

