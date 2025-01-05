import java.util.*;

public class trees_multisolver{
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
public static  Node construct(int arr[]){
    
    Node root = null;
    Stack<Node> st = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == -1) {
            st.pop();
        } else {
            Node t = new Node();
            t.data = arr[i];

            if (st.size() > 0) {
                Node parent = st.peek();
                parent.children.add(t);
            } else {
                root = t; // Set root only when stack is empty
            }
            st.push(t);
        }
    }
    return root;
}
    public static void main(String[] args) {
        int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1};
Node root=construct(arr);
        size=0;
min=Integer.MAX_VALUE;
max=Integer.MIN_VALUE;
height=0;
multisolver(root,0);
System.out.println("size"+size);
System.out.println("Min"+min);
System.out.println("Max"+max);
System.out.println("Height"+height);
      
    }
    static int size;
    static int min;
    static int max;
    static int height;
public static void multisolver(Node node,int depth){
size++;
min=Math.min(min,node.data);
max=Math.max(max,node.data);
height=Math.max(height,depth);
for(Node child:node.children){
    multisolver(child,depth+1);
}
}
   
}
