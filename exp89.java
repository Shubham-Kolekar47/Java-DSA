import java.util.*;
public class exp89{
    public static void main(String[] args) {
        {
            int s = 45;
           // System.out.println(s); -> this will not give any error but
        }
        System.out.println(s); // this will give an error cause here we use block scope in which we only 
        // can use the variables or print the variables which are from same block means the same curly
        //  brackets, this is also applicable in for loop 
    }
}
