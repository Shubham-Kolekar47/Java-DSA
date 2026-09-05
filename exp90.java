import java.util.*;//hollow pattern printing
public class exp90{
    public static void hollow(int n , int x) {
        for (int i=1;i<=n;i++){
            for(int j=1;j<=x;j++){
                if(i == 1 || i == n || j == 1 || j == x){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        int n = sc.nextInt();
        System.out.println("enter the number of column : ");
        int x = sc.nextInt();

        hollow(n,x);
        
    }
}
