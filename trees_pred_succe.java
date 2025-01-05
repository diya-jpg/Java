import java.util.*;

public class trees_pred_succe{
  
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
        predecessor = null;
        successor = null;
        state = 0;
        int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1};
Node root=construct(arr);
predecessor_successsor(root,90);
if(predecessor==null){
    System.out.println("No Predecessor");
}
else{
    System.out.println("Predecessor"+predecessor.data);
      
    }
    if(successor==null){
        System.out.println("No Successor");
    }
    else{
        System.out.println("Successor"+successor.data);
          
        }
}
    static Node predecessor;
    static Node successor;
   static int state;
   public static void predecessor_successsor(Node node,int data){
if(state==0){
    if(node.data==data){
        state=1;
    }
    else{
        predecessor=node;
    }
}
else if(state==1){
    successor=node;
    state=2;
    return;
}
for(Node child:node.children){
    predecessor_successsor(child,data);
   
}
   }
   
}
