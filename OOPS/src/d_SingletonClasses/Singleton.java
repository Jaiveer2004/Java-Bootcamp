package d_SingletonClasses;

public class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Public static method to provide access to the instance
    public static Singleton getInstance() {
        // Create the instance if it doesn't exist (lazy initialization)
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

/*

Singleton Classes :
* A Singleton Class is a design pattern that ensures a class has only one instance throughout the lifetime of an application
* Only one object can be made of singleton class.

* Key Characteristics of a Singleton Class
- Single Instance: Only one object of the class exists in the program.
- Global Access: Provides a single, globally accessible method to retrieve the instance.
- Private Constructor: Prevents direct instantiation of the class from outside.

* How to Implement a Singleton Class in Java
- To create a Singleton class, you typically:
- Make the constructor private to prevent instantiation from outside the class.
- Use a static variable to hold the single instance.
- Provide a static method (e.g., getInstance()) to access the instance.

Example:
public class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Public static method to provide access to the instance
    public static Singleton getInstance() {
        // Create the instance if it doesn't exist (lazy initialization)
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

* Key Components
- Private Constructor: Ensures no other class can create an instance.
- Static Instance Variable: Holds the single instance of the class.
- Static getInstance() Method: Controls access and ensures only one instance is created.

 */


