import java.util.*; // sum of first n numbers
public class exp50 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("sum is : " +sum);
    }
}
