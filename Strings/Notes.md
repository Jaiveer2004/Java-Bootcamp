
---

# Strings in Java

## What Are Strings?
A **string** in Java is a sequence of characters (e.g., letters, numbers, symbols). Strings are widely used for text manipulation and are represented by the `String` class, which is part of the `java.lang` package (automatically imported).

- **Example**: `"Hello"`, `"123"`, `"Java123!"`

### Key Characteristics
1. **Immutable**: Once a `String` object is created, its value cannot be changed. Any modification creates a new `String` object.
2. **Class-Based**: `String` is a built-in class in Java, not a primitive data type.
3. **Object Creation**: Strings can be created using literals or the `new` keyword.

---

## How Are Strings Stored in Memory?

### Memory Segments in Java
- **Stack Memory**: Stores local variables and reference variables.
- **Heap Memory**: Stores objects (including `String` objects).

### String Pooling (String Interning)
Java optimizes memory usage for strings through a mechanism called **String Pooling**, a special area in the heap memory.

- When you create a string literal (e.g., `String a = "Hi";`), Java checks the **String Pool**:
  - If `"Hi"` already exists, the reference variable `a` points to the existing object.
  - If not, a new object is created in the pool.
- **Key Point**: Multiple reference variables with the same string literal point to the **same object** in the pool.

#### Example
```java
String a = "Hi";
String b = "Hi";
```
- Only **one object** (`"Hi"`) is created in the String Pool.
- Both `a` and `b` reference the same object in the heap.

#### Visualization
```
Stack Memory        Heap Memory (String Pool)
a ----> "Hi" <---- b
```

### Using the `new` Keyword
When you use `new` to create a string (e.g., `String a = new String("Hi");`), Java:
- Creates a new object **outside the String Pool** in the heap, even if `"Hi"` exists in the pool.
- Does not use pooling, leading to separate objects.

#### Example
```java
String a = new String("Hi");
String b = new String("Hi");
```
- **Two separate objects** are created in the heap (not pooled).
- `a` and `b` point to different objects with the same value.

#### Visualization
```
Stack Memory        Heap Memory
a         ---->     "Hi" (Object 1)
b         ---->     "Hi" (Object 2)
```

### Reassignment of Strings
When a string reference is reassigned, the original object may become unreferenced:
```java
String a = "Hi";    // "Hi" in String Pool
a = "Hello";        // "Hello" in String Pool, "Hi" remains if referenced elsewhere
```
- A new object (`"Hello"`) is created (or reused from the pool).
- If no references point to `"Hi"`, it becomes eligible for **garbage collection**.

#### Garbage Collection
- The **Garbage Collector (GC)** is a part of the Java Virtual Machine (JVM) that automatically frees memory by removing objects with no active references.
- Example: After `a = "Hello";`, `"Hi"` is collected if no other variables reference it.

---

## Why Are Strings Immutable?

### Reasons for Immutability
1. **String Pool Efficiency**:
   - Immutability ensures that pooled strings remain consistent. If one reference changes a string, it won’t affect others pointing to the same object.
2. **Security**:
   - Prevents accidental or malicious changes to strings used in critical operations (e.g., file paths, database queries).
3. **Memory Optimization**:
   - Reusing string objects from the pool saves memory instead of creating duplicates.
4. **Thread Safety**:
   - Immutable objects are inherently safe in multi-threaded environments, as they cannot be modified after creation.

#### Example of Immutability
```java
String a = "Hi";
a = a + " there"; // Creates a new object "Hi there", "Hi" remains unchanged
System.out.println(a); // Output: "Hi there"
```

---

## Comparing Strings

### Using `==` Operator
- Compares **references**, not values.
- Checks if two variables point to the same object in memory.

#### Example
```java
String a = "Hi";
String b = "Hi";
System.out.println(a == b); // true (same object in String Pool)

String x = new String("Hi");
String y = new String("Hi");
System.out.println(x == y); // false (different objects in heap)
```

### Using `equals()` Method
- Compares **values**, not references.
- Checks if the content of two strings is identical.

#### Example
```java
String a = "Hi";
String b = new String("Hi");
System.out.println(a.equals(b)); // true (same value)
```

### Additional Comparison Methods
- **`equalsIgnoreCase()`**: Ignores case while comparing.
  ```java
  String a = "HELLO";
  String b = "hello";
  System.out.println(a.equalsIgnoreCase(b)); // true
  ```
- **`compareTo()`**: Compares lexicographically (dictionary order).
  - Returns `0` if equal, negative if less, positive if greater.
  ```java
  String a = "apple";
  String b = "banana";
  System.out.println(a.compareTo(b)); // negative (apple < banana)
  ```

---

## Accessing String Elements

### No Direct Index Access
Unlike arrays (`arr[index]`), strings don’t support direct indexing in Java.

### Using `charAt()`
- Access individual characters by index (0-based).
```java
String a = "Hello";
char ch = a.charAt(0); // 'H'
System.out.println(ch);
```

### Using `toCharArray()`
- Converts a string to a character array for indexed access.
```java
String a = "Hello";
char[] chars = a.toCharArray();
System.out.println(chars[1]); // 'e'
```

---

## String Concatenation

### Using `+` Operator
- Combines two strings into a new string.
- Internally creates a new `String` object in the heap.

#### Example
```java
String a = "Hello";
String b = "World";
String c = a + " " + b; // "Hello World"
System.out.println(c);
```

#### Concatenating Different Data Types
- Non-string types are converted to strings using their `toString()` method.
```java
String a = "Number: ";
int num = 10;
System.out.println(a + num); // "Number: 10"
```

### Performance Issue with `+`
- Each `+` operation creates a new `String` object, leading to inefficiency in loops.
#### Example
```java
String s = "";
for (int i = 0; i < 5; i++) {
    s += i; // New object created each iteration
}
System.out.println(s); // "01234"
```
- **Time Complexity**: O(n²) due to repeated object creation and copying.
- **Memory**: Excessive temporary objects burden the garbage collector.

---

## StringBuilder: Efficient Concatenation

### What is `StringBuilder`?
- A mutable alternative to `String`, found in `java.lang`.
- Allows modification of the string content without creating new objects.

### How It Works
- Uses a resizable buffer in the heap.
- Appends data to the same object, resizing the buffer as needed.

#### Example
```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 5; i++) {
    sb.append(i); // Modifies the same object
}
System.out.println(sb.toString()); // "01234"
```
- **Time Complexity**: O(n), much more efficient than `+`.

### Common Methods
- **`append()`**: Adds data (string, int, etc.) to the end.
- **`insert(int offset, String str)`**: Inserts data at a specific position.
- **`delete(int start, int end)`**: Removes a substring.
- **`toString()`**: Converts to a `String`.

#### Example
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // "Hello World"
sb.insert(5, ",");   // "Hello, World"
System.out.println(sb.toString());
```

### `StringBuilder` vs `StringBuffer`
- **`StringBuilder`**: Not thread-safe, faster.
- **`StringBuffer`**: Thread-safe, slower (use in multi-threaded applications).

---

## Common String Methods

1. **`length()`**: Returns the number of characters.
   ```java
   String s = "Hello";
   System.out.println(s.length()); // 5
   ```
2. **`substring(int begin, int end)`**: Extracts a portion (end exclusive).
   ```java
   String s = "Hello World";
   System.out.println(s.substring(6, 11)); // "World"
   ```
3. **`toLowerCase()` / `toUpperCase()`**: Changes case.
   ```java
   String s = "Hello";
   System.out.println(s.toUpperCase()); // "HELLO"
   ```
4. **`strip()`**: Removes leading/trailing whitespace (Java 11+).
   ```java
   String s = "  Hi  ";
   System.out.println(s.strip()); // "Hi"
   ```
5. **`split(String regex)`**: Splits into an array based on a delimiter.
   ```java
   String s = "apple,banana,orange";
   String[] fruits = s.split(",");
   System.out.println(fruits[1]); // "banana"
   ```
6. **`replace(char old, char new)`**: Replaces all occurrences.
   ```java
   String s = "cat";
   System.out.println(s.replace('c', 'r')); // "rat"
   ```

---

## Pretty Printing with `printf()`

- Formats output using placeholders.
- Common placeholders:
  - `%s`: String
  - `%d`: Integer
  - `%f`: Float (e.g., `%.2f` for 2 decimal places)

#### Example
```java
String name = "Alice";
int age = 25;
float height = 5.678f;
System.out.printf("Name: %s, Age: %d, Height: %.2f%n", name, age, height);
// Output: Name: Alice, Age: 25, Height: 5.68
```

---

## Handling Exceptions

### `NullPointerException`
- Occurs when you try to call a method on a `null` string.
#### Example
```java
String s = null;
System.out.println(s.length()); // Throws NullPointerException
```

### Prevention
- Check for `null` before operations:
```java
String s = null;
if (s != null) {
    System.out.println(s.length());
} else {
    System.out.println("String is null");
}
```

---

## Additional Notes

### Operator Overloading
- Java does **not** support user-defined operator overloading.
- The `+` operator is an exception, predefined for string concatenation.

### Wrapper Classes
- Primitive types (e.g., `int`) are converted to their wrapper classes (e.g., `Integer`) during concatenation, calling `toString()`.

---

## Summary Table

| Feature               | `String`                          | `StringBuilder`                  |
|-----------------------|------------------------------------|-----------------------------------|
| Mutability            | Immutable                        | Mutable                          |
| Memory Efficiency     | Uses String Pool                | Single object, no pooling        |
| Performance (Loops)   | Poor (O(n²) with `+`)           | Excellent (O(n))                 |
| Thread Safety         | Yes                              | No (Use `StringBuffer` for safety) |

---
