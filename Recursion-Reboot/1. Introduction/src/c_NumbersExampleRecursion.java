public class c_NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    static void print(int n) {
        // Base Condition : The condition at which we want the recursion to stop
        if(n > 5) {
            return;
        }

        System.out.println(n);
        print(n + 1);
    }
}

/*
* Each function call will take seperate memory resources.
* Recursion function has three main parts:
* 1. The base condition (A condition after it is met, you don't want your function to make more copies of itself and the recursion stops)
* 2. The Body : A recursion function has a body in which all the logic is to be written to be implemented.
* 3. The recursion call : Call the function again inside the same function with additional conditions added to it.
*
* Without a base condition : It can cause to run the loop of recursion infinite times which can lead to "Stack Overflow" Error.
*
* Why use Recursion?
* 1.  It helps in solving bigger and complex problems by breaking it into simpler and smaller parts.
* 2. You can convert recursion solution into iterative solution and vice versa. Firstly we will solve it recursively and then using iterative methods.
* 3. Space complexity is not constant because of recursive calls.
*
* To visualize recursion : We can use the Recursive Tree to visualize the recursion
*/
