import java.util.*;
public class exp141 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);//if we had did the += and took string in the place of the append then the time complexity will be O(26* n^2)
            //but now we have the time complexity as O(26)
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
