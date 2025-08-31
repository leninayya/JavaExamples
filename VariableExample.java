/**
 * This class demonstrates the three main types of variables in Java:
 * static, instance, and local.
 */
public class VariableExample {

    // 1. Static Variable (Class Variable)
    // A static variable belongs to the class itself, not to any single instance (object) of the class.
    // There is only one copy of this variable, shared among all objects.
    public static int counter = 0;

    // 2. Instance Variable (Object Variable)
    // An instance variable belongs to a specific instance (object) of the class.
    // Each object has its own unique copy of this variable.
    public String name;

    /**
     * The constructor is a special method used to initialize instance variables
     * when a new object is created.
     */
    public VariableExample(String name) {
        // This 'this.name' refers to the instance variable.
        // The 'name' without 'this.' refers to the local parameter.
        this.name = name;
        
        // When we create a new object, we increment the static counter.
        // Notice how we can access the static variable directly using the class name.
        VariableExample.counter++;
    }

    /**
     * This method demonstrates a local variable.
     * @param multiplier This is a local variable because it's a method parameter.
     */
    public void demonstrateLocalVariable(int multiplier) {
        
        // 3. Local Variable (Method Variable)
        // A local variable is declared inside a method, constructor, or block.
        // Its scope is limited to that specific method or block.
        int result = this.name.length() * multiplier;

        // The 'result' variable exists only within this method.
        System.out.println("Object: " + this.name + " | Result: " + result);
    }

    /**
     * The main method to run our example and see the variables in action.
     */
    public static void main(String[] args) {
        
        // Before creating any objects, the static variable 'counter' exists and has a value of 0.
        System.out.println("Current value of the static counter: " + VariableExample.counter);

        System.out.println("\n--- Creating the first object: obj1 ---");
        VariableExample obj1 = new VariableExample("FirstObject");
        System.out.println("The instance name for obj1 is: " + obj1.name);
        System.out.println("The static counter is now: " + VariableExample.counter);

        System.out.println("\n--- Creating the second object: obj2 ---");
        VariableExample obj2 = new VariableExample("SecondObject");
        System.out.println("The instance name for obj2 is: " + obj2.name);
        System.out.println("The static counter is now: " + VariableExample.counter);

        System.out.println("\n--- Demonstrating Local Variables ---");
        // We call the method on the first object.
        // We pass the local variable `3`.
        obj1.demonstrateLocalVariable(3);

        // We call the same method on the second object.
        // We pass a different local variable `5`.
        obj2.demonstrateLocalVariable(5);

        System.out.println("\n--- Final status ---");
        System.out.println("Final value of the static counter: " + VariableExample.counter);
        System.out.println("The instance variable for obj1 is still: " + obj1.name);
        System.out.println("The instance variable for obj2 is still: " + obj2.name);
        // Note: You cannot access the local variable 'result' here.
        // The following line would cause a compile-time error:
        // System.out.println(result);
    }
}
