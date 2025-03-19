package b_PackageInfo;

public class PackagesIntro {
    public static void main(String[] args) {

    }
}

/*
Packages: Package is just like a folder. To organize files in proper manner.
A package is a mechanism to organize and group related classes, interfaces, and other types into a single namespace (namespace means under a single name or under a single folder name).
It helps in avoiding naming conflicts, improving code readability, and providing a modular structure to large projects
Key Features of Packages:
* Namespace Management: Prevents naming collisions by providing a unique namespace for classes (e.g., two classes with the same name can exist in different packages).
* Access Control: Works with access modifiers (public, protected, default, private) to control the visibility of class members.
* Modularity: Organizes code into logical units, making it easier to maintain and scale.
* Reusability: Allows classes in one package to be imported and reused in other parts of the program.

Types of Packages:

1. Built-in Packages:
* Provided by the Java Development Kit (JDK).
Examples:
- java.lang: Contains fundamental classes (e.g., String, Math, System). Automatically imported.
- java.util: Contains utility classes (e.g., ArrayList, HashMap).
- java.io: Contains classes for input/output operations (e.g., File, BufferedReader).

2. User-Defined Packages:
Created by developers to organize their own classes.
Defined using the package keyword.

Example:
package mypackage; // Package declaration

public class MyClass {
    public void display() {
        System.out.println("This is a class in mypackage.");
    }
}
Convention: Package names are typically in lowercase and follow a reverse domain naming convention (e.g., com.example.myapp).

Importing Packages:
To use classes from a package in another file, you need to import them using the import keyword.

How Packages Work with Directory Structure :
Packages correspond to the directory structure in the file system.
For example, if a class is in the package com.example, it must reside in the folder com/example/ relative to the source root.
src/
  com/
    example/
      MyClass.java

* Access Modifiers with Packages
- public: The class or member is accessible from everywhere.
- protected: Accessible within the same package and also in subclasses (even if in different packages).
- Default (package-private): If no modifier is specified, the class or member is accessible only within the same package.
- private: Accessible only within the same class.
 */
