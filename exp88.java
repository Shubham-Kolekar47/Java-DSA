class Calculator {

    int a, b;

    
    Calculator(int a, int b) {
        this.a = a;  
        this.b = b;
    }

    
    int add() {
        return a + b;
    }

    int add(int x, int y) {
        return x + y;
    }

    double add(double x, double y) {
        return x + y;
    }

    void display() {
        System.out.println("Addition using instance variables: " + this.add());
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator(10, 20);

        obj.display();

        // Calling overloaded methods
        System.out.println("Addition of two integers: " + obj.add(5, 6));
        System.out.println("Addition of two doubles: " + obj.add(2.5, 3.5));
    }
}