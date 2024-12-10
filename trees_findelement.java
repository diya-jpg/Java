import java.util.*;
import java.util.Stack;

public class trees_findelement{
   public static boolean find(Node node,int data){
    if(node.data==data){
        return true;
    }
    for(Node child:node.children){
        boolean fic=find(child,data);
        if(fic){
            return true;
        }
    }
    return false;
   }
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1};
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

       
      System.out.println(find(root,110));
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", "; // Access child.data instead of child directly
        }
        str += ".";
        System.out.println(str);

        // Recursive call to display children
        for (Node child : node.children) {
            display(child);
        }
    }

   
    
}
