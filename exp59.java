import java.util.*;//printing numbers until the multiple of 10 arrives or given by user
public class exp59{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("enter the value : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
        

    }
}
