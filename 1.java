class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

/*  VARIABLES IN JAVA

1) Local Variables
- Declared inside a method, constructor, or block
- Scope: Exists only inside that method/block
- Lifetime: Destroyed when method finishes
- Memory: Stack
- Default value: No (must be initialized before use)
- Access: Inside the same method only

Example:
*/
class Test {
    void show() {
        int x = 20; // local variable
        System.out.println("Local Variable: " + x);
    }

    void display() {
        // System.out.println(x); // error (x not accessible)
    }
}

/*
2) Instance Variables (Non-Static)
- Declared inside class but outside methods
- Scope: Accessible throughout the class using object
- Lifetime: Exists as long as object exists
- Memory: Heap
- Default values: Yes (0, null, false)
- Each object has its own copy
*/

class Student {
    String name;   // instance variable

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";

        Student s2 = new Student();
        s2.name = "Bob";

        System.out.println(s1.name); // Alice
        System.out.println(s2.name); // Bob
    }
}

/*
3) Static Variables (Class Variables)
- Declared using static keyword
- Scope: Shared across all objects
- Lifetime: Exists until program ends
- Memory: Method Area
- Default values: Yes (0, null, false)
- Accessed using class name
*/

class College {
    static String collegeName = "ABC College";

    public static void main(String[] args) {
        System.out.println(College.collegeName);
    }
}
