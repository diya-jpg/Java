import java.util.*;

public class trees_kth_element{
  
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
public static int kthlargest(Node node,int k){
    floor=Integer.MIN_VALUE;
    int factor=Integer.MAX_VALUE;
for(int i=0;i<k;i++){
    ceil_floor(node ,factor);
    factor=floor;
    floor=Integer.MIN_VALUE;
}
return factor;
}
    public static void main(String[] args) {
       
        int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1};
Node root=construct(arr);
ceil=Integer.MAX_VALUE;
floor=Integer.MIN_VALUE;
// ceil_floor(root,125);
// System.out.println("ceil"+ceil);
// System.out.println("floor"+floor);
System.out.println(kthlargest(root,3));
}
   static int ceil;
   static int floor;

   public static void ceil_floor(Node node,int data){
   if(node.data>data){
    if(node.data<ceil)
    {
        ceil=node.data;
    }
   }
   if(node.data<data){
    if(node.data>floor){
        floor=node.data;
    }
   }
   for(Node child:node.children){
    ceil_floor(child,data);
   }
}

}
