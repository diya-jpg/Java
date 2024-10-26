import java.util.ArrayDeque;
import java.util.Queue;

public class queue_implement {
    public static void main(String[] args) {
       Queue<Integer> q = new ArrayDeque<>();
q.add(1);
q.add(2);
q.add(3);
q.add(4);
System.out.println(q);
q.poll();
System.out.println(q);
q.remove();
System.out.println(q);
System.out.println(q.element());
System.out.println(q.peek());


    }
}
