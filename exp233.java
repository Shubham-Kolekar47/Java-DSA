import java.util.*;

public class exp233 {
    public static void main(String[] args) {
        // Queue q = new Queue();
        Queue<Integer> q = new LinkedList<>();// arrayDeque and linked list are only two through which queue can be implemented
        q.add(1);
        q.add(2);
        q.add(3);
        
        //1-2-3
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
