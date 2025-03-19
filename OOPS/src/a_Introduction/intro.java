package a_Introduction;

public class intro {
    public static void main(String[] args) {
        Student student1 = new Student(13, "Jaiveer Singh", 96.89f);

        System.out.println(student1.rno);
        System.out.println(student1.Name);
        System.out.println(student1.marks);


    }
}

// How to create a class:
class Student {
    // Member variables of the class
    int rno;
    String Name;
    float marks;

    // Constructor : used to initialize the values of an object
    Student (int rno, String Name, float marks) {
        // this operator is used to refer to the current object after initializing
        this.rno = rno;
        this.Name = Name;
        this.marks = marks;
    }

    // Default Constructor
    Student() {
        // This would be called by default if we make a new object and don't pass any parameter
        // But we can call other Constructor to initialize default values.
        this (0, "No Name", 0.0F);
    }

    // Member Functions or Methods

}

/*
Wrapper Class :  A way by which we can use primitive data types as Objects is known as Wrapper Class.
For Example:
Integer : Wrapper class of int
This is particularly useful in situations where objects are required, such as when working with collections (e.g., ArrayList) that can only store objects, not primitives.

This usually starts with a capital letter.
We can use additional methods which are associated with the Wrapper classes for convenience.

For Example:
Integer a = 10;
sout(a.toString()); // converts Integer to String.
*/

/*
"Final" Keyword : It is a modifier that can be applied to variables, methods, and classes.
It is used to impose restrictions, ensuring that the entity it modifies cannot be changed or extended further.
Its meaning varies depending on what it is applied to.

1. Final Variable : When the final keyword is applied to a variable, it means the variable’s value cannot be changed once it is initialized. In other words, it becomes a constant.
* A final variable must be initialized either at the time of declaration or in a constructor (for instance variables).
* After initialization, any attempt to reassign a value will result in a compilation error.
Example:
final int MY_CONSTANT = 10;

2. Final Method : When the final keyword is applied to a method, it means the method cannot be overridden by a subclass. This is useful when you want to ensure that the method’s implementation remains unchanged in derived classes.
* The method’s logic is locked, preserving its behavior in inheritance.
* It does not prevent method overloading, only overriding.
Example:
class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void display() { // Compilation error: cannot override final method
    //     System.out.println("Trying to override.");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Output: This is a final method.
    }
}

3. Final Class : It means the class cannot be extended (i.e., no subclass can inherit from it). This makes the class immutable in terms of inheritance.
* Prevents inheritance entirely.
* All methods in a final class are implicitly final (since they can’t be overridden anyway).
Example:
final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

// class SubClass extends FinalClass { // Compilation error: cannot inherit from final class
// }

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show(); // Output: This is a final class.
    }
}

Summary of final Keyword :
-------------------------------------------------------
Entity	    |    Effect of final
------------------------------------------------------
Variable	:    Makes it a constant (unchangeable).
Method	    :    Prevents overriding in subclasses.
Class	    :    Prevents inheritance (no subclasses).
 */