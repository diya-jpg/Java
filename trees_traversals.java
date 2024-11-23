import java.util.ArrayList;
import java.util.Stack;

public class trees_traversals {
     private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    public static void traversal(Node root){
        if(root == null) return;
        System.out.println("Node pre"+root.data + " ");
        for(Node child : root.children){
            System.out.println("edge pre "+root.data+"--"+child.data);
            traversal(child);
            System.out.println("edge post "+root.data+"--"+child.data);
        }
        System.out.println("Node post"+root.data);
    }
    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", "; // Access child.data instead of child directly
        }
        str += ".";
        System.out.println(str);

       
        for (Node child : node.children) {
            display(child);
        }
    }
    public static void main(String[] args) {
          //  int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1};
        int arr[]={10,20,-1,30,50,-1,60,-1,-1,40,-1};
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
                    root = t; 
                }
                st.push(t);
            }
        }
display(root);
    traversal(root);
    }
    }

