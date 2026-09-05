import java.util.*;// break statement
public class exp60{
    public static void main(String[] arg){
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            
            System.out.println(i);
        }
        System.out.println("i am out of the loop");
    }
}

