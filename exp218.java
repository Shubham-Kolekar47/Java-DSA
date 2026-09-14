public class exp218 {
    public static boolean isCycle(){//loop linked list or cycle linked list(floyds cycle finding algorithm)
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;//cycle exist
            }
        }
        return false;//cycle doesnt exist
    }

public static void main(String args[]){
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = head;
    //1->2->3->1
    System.out.println(isCycle());
}
}
