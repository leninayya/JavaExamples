Understanding Variables in Java
This guide will walk you through the three fundamental types of variables in Java using the provided VariableExample.java file. Variables are containers for storing data, and understanding their different types is crucial for writing correct and efficient code.

1. Static Variables
Imagine a single whiteboard in a classroom that everyone in the class can see and use. Any changes made to that whiteboard are visible to every student. A static variable is just like that whiteboard.

Definition: A static variable belongs to the class itself, not to any specific object created from that class.

Storage: There is only one copy of a static variable, no matter how many objects you create. All objects share the same copy.

Lifetime: They exist as long as the class is loaded into memory.

Declaration: Use the static keyword.

In the VariableExample.java file:
The public static int counter = 0; line declares a static variable. The main method demonstrates how it's shared: every time a new VariableExample object is created, the counter is incremented, and this change is reflected for all objects.

2. Instance Variables
Now, imagine each student in the classroom also has their own personal notebook. The notes written in one student's notebook are private to them and do not affect anyone else's notebook. An instance variable is like that personal notebook.

Definition: An instance variable belongs to a specific instance (object) of the class.

Storage: Each object gets its own unique copy of the instance variable.

Lifetime: They exist as long as the object they belong to exists.

Declaration: Declared inside the class, but without the static keyword.

In the VariableExample.java file:
The public String name; line declares an instance variable. In the main method, obj1 has a name of "FirstObject" and obj2 has a name of "SecondObject." These are completely independent of each other.

3. Local Variables
Finally, think of a small sticky note you use to remember a quick task. Once the task is done, you throw the sticky note away. A local variable is like that sticky note. It's temporary and only relevant for a very specific task.

Definition: A local variable is declared inside a method, constructor, or block of code.

Storage: It's created when the method is called and destroyed when the method finishes.

Lifetime: Its life is very short, limited to the block it's in.

Declaration: Declared within a method, and you do not use any special keywords like static.

In the VariableExample.java file:
The int result variable inside the demonstrateLocalVariable method is a local variable. It is created and a value is assigned when the method is called, and it ceases to exist once the method is finished. The multiplier parameter is also a type of local variable.

Running the Code
Save the code as VariableExample.java.

Open your terminal or command prompt.

Compile the code with the Java compiler:

javac VariableExample.java

Run the compiled code:

java VariableExample

Observe the output to see how each type of variable behaves.

This example is a great foundation for your Java journey! Feel free to ask if you would like to explore these concepts in more detail or learn about a new topic.
