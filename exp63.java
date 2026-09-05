import java.util.*;//printing star pattern but same in all lines
public class exp63 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");// we have uesd only print here becauese if we use println 
                // here then every star will get printed in the next line
            }
            System.out.println();

        }

    }
}
