import java.util.*;

public class queue_reverse {
    public static Queue<Integer> k_elements(Queue<Integer> q, int k) {
        Queue<Integer> queue2 = new LinkedList<Integer>();
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        while (st.size() != 0) {
            queue2.add(st.pop());
        }
        while (!q.isEmpty()) {
            queue2.add(q.remove());
        }
        return queue2;
    }

    public static void main(String[] args) {
        int k = 2;
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        Queue q = k_elements(queue, k);
        System.out.println(q);
    }
}
