import java.util.*;

public class tress_display{
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

        // Display the tree
        System.out.println("Tree Structure:");
        display(root);

        // Display the size of the tree
        System.out.println("\nSize of the tree: " + size(root));
        System.out.println("\nMax of the tree: " + max(root));
        System.out.println("\nHeight of the tree: " + height(root));
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

    public static int size(Node root) {
        if (root == null) return 0;

        int count = 1; // Count the current node
        for (Node child : root.children) {
            count += size(child); // Add the size of all child nodes
        }

        return count;
    }
    public static int max(Node node){
        int max=Integer.MIN_VALUE;
        for(Node child:node.children
        ) {
            max=Math.max(max, max(child));
    }
    max=Math.max(node.data,max);
    return max;
}
public static int height(Node node){
   
    int ht=-1;
    for(Node child:node.children){
         ht=Math.max(height(child),ht);
    }
    ht+=1;
return ht;
}
}
