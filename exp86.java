import java.util.Scanner;

public class exp86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i;
        double sum = 0, avg;

       
        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

       
        for (i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            sum = sum + num;
        }

        
        avg = sum / n;

       
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
} 
    


