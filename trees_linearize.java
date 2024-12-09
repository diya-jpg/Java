import java.util.*;
import java.util.Stack;

public class trees_linearize{
    public static void linearize(Node node){
        for(Node child:node.children){
            linearize(child);
        }
        while(node.children.size()>1){
            Node lc=node.children.remove(node.children.size()-1);
            Node sl=node.children.get(node.children.size()-1);
            Node slt=getTail(sl);
            slt.children.add(lc);
        }
    }
    public static Node linearize2(Node node){
        if(node.children.size()==0){
            return node;
        }
        Node lkt=linearize2(node.children.get(node.children.size()-1));
        while(node.children.size()>1){
            Node last=node.children.remove(node.children.size()-1);
            Node sl=node.children.get(node.children.size()-1);
            Node slkt=linearize2(sl);
            slkt.children.add(last);
        }
        return lkt;
    }
    private static Node getTail(Node node){
        while(node.children.size()==1){
            node=node.children.get(0);
        }
        return node;
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

       
        display(root);
linearize2(root);
    
       display(root);
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
