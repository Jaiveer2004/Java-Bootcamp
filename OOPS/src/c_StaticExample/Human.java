package c_StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // Static Variable initialization
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        // Increasing the static variable population on every object made
        Human.population += 1;
    }

}

/*
Static Keyword:
* In Java, the static keyword is a modifier that indicates that a member (variable, method, or nested class) belongs to the class itself rather than to instances (objects) of the class.
* This means you can access a static member without creating an object of the class.

1. Static Variable (Class Variable)
When a variable is declared as static, it is shared among all instances of the class. There is only one copy of the variable in memory, regardless of how many objects are created.
Example:
class Student {
    static int studentCount = 0; // Static variable

    Student() {
        studentCount++; // Increments for each new object
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Total students: " + Student.studentCount); // Output: 2
    }
}

Whenever a new student object would be created, the studentCount would increase by 1.
Use Case: Tracking the number of objects created, like a counter.

2. Static Method: A static method belongs to the class rather than an instance. It can be called without creating an object of the class.
* Cannot access non-static (instance) variables or methods directly because they require an object.
* Can only directly access other static members.
* Often used for utility or helper methods.
Example:
class MathUtils {
    static int add(int a, int b) { // Static method
        return a + b;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 3); // Called without an object
        System.out.println("Sum: " + sum); // Output: 8
    }
}

Here, "add" method of MathUtlis class is of static type.
So, we can call the "add" method of MathUtlis class without even making an object of it.

Example 2:

public class Human {
    public static void main(Strings[] args) {

    }
}
- To use main function here, we don't need to make any object of the Human Class.
Here, static means that main function is not dependent on the Human class, that it would first require the object of the Human class and then it would run.

3. Static Block:
A static block is a block of code that runs only once when the class is loaded into memory by the JVM. It’s used to initialize static variables or perform one-time setup.

* Executes before the main() method or any object creation.
* Can only access static members.

Example:
class StaticBlockExample {
    static int value;

    static { // Static block
        value = 100;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Value: " + value); // Output: 100
    }
}

4. Static class : When a class is made static, it means that we dont need to make an object of the class in which it is.

Example:

public class Human {
    static class Baby {
        // xyz
    }
}

Here static class Baby inside Human class means, that we don't need to make an object of the human class in order to use the Baby class. But the objects of the baby class can be made.


Static vs Non-Static:
----------------------------------------------------------------------------------|
Feature	      |      Static Member	               |     Non-Static Member        |
----------------------------------------------------------------------------------|
Belongs to	  |      Class itself	               |     Instance of the class    |
Memory	      |      One copy per class	           |     One copy per object      |
Access	      |      ClassName.member	           |     object.member            |
Can access	  |      Only static members directly  |    Both static and non-static|
----------------------------------------------------------------------------------|


Why is "main" function used as static?
Bcoz we don't need to make an object of the Main class to call the main function. So, static is used.

You can't use a non-static method inside a static method.


Outer classes can't be static

 */
