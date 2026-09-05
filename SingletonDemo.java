// Singleton Class
class Singleton {

    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Private constructor (prevents object creation)
    private Singleton() {
        System.out.println("Singleton Instance Created!");
    }

    // Step 3: Public method to provide access
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // create only once
        }
        return instance;
    }

    // Sample method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Main Class
public class SingletonDemo {
    public static void main(String[] args) {

        // Trying to create multiple objects
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Checking if both references are same
        if (obj1 == obj2) {
            System.out.println("Both objects are same (Single Instance)");
        } else {
            System.out.println("Different objects created!");
        }
    }
}
