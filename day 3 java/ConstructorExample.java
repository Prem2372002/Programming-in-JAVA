
public class ConstructorExample {

    // No arguments constructor
    public ConstructorExample() {
        System.out.println("No arguments constructor");
    }

    // Default constructor
    public ConstructorExample(String message) {
        System.out.println("Default constructor with message: " + message);
    }

    // Parameterized constructor with different types of parameters
    public ConstructorExample(int number) {
        System.out.println("Parameterized constructor with integer parameter: " + number);
    }

    public ConstructorExample(String message, int number) {
        System.out.println("Parameterized constructor with message and integer parameters: " + message + ", " + number);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorExample obj1 = new ConstructorExample(); // No arguments constructor
        ConstructorExample obj2 = new ConstructorExample("Hello!"); // Default constructor
        ConstructorExample obj3 = new ConstructorExample(42); // Parameterized constructor with integer parameter
        ConstructorExample obj4 = new ConstructorExample("Java", 2023); // Parameterized constructor with message and integer parameters
    }
}

