import java.util.*;

public class queue_implement2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer>q2=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(q.size()>0){
            System.out.println(q.peek());
        q2.add(q.remove());
        }
       while(q2.size()>0){
        q.add(q2.remove());
       }
      System.out.println(q2);
      System.out.println(q);
    }
}
