import java.util.Scanner;
public class ExceptionDemo  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter numerator: ");
            int num1 = sc.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = sc.nextInt();

            // Performing division          
            int result = num1 / num2;

            System.out.println("Result: " + result);
        }

        // Handling division by zero
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        // Handling invalid input
        catch (Exception e) {
            System.out.println("Error: Invalid input! Please enter integers only.");
        }

        // Always executes
        finally {
            System.out.println("Program execution completed.");
        }

        sc.close();
    }
}
