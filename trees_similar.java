import java.util.*;

public class trees_similar{

    public static boolean areSimilar(Node root1, Node root2) {
        if (root1.children.size() != root2.children.size()) {
            return false;
        }
        for (int i = 0; i < root1.children.size(); i++) {
            Node c1 = root1.children.get(i);
            Node c2 = root2.children.get(i);
            if (!areSimilar(c1, c2)) {
                return false;
            }
        }
        return true;
    }
public static boolean Issymmetric(Node node){
    return mirror(node,node);
}
   public static boolean mirror(Node n1,Node n2){
    if(n1.children.size()!=n2.children.size()){
        return false;
    }
    for(int i=0;i<n1.children.size();i++){
        int j=n1.children.size()-1-i;
        Node c1=n1.children.get(i);
        Node c2=n2.children.get(j);
        if(mirror(c1,c2)==false){
            return false;
   }
}
return true;
   }

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1};
        //int arr2[] = {1,2,3, -1, 4, -1, -1, 5, 6, -1, 7, 8, -1, 9, -1, -1, 10, -1, -1, 11, 12, -1, -1};
        int arr2[] = {10, 40, 100, -1, -1, 30, 90, -1, 80, 120, -1, 110, -1, -1, 70, -1, -1, 20, 60, -1, 50, -1, -1};

        Node root1 = buildTree(arr);
        Node root2 = buildTree(arr2);

        System.out.println(areSimilar(root1, root2));
        System.out.println(mirror(root1,root2));
        System.err.println(Issymmetric(root1));
    }

    private static Node buildTree(int[] arr) {
        Node root = null;
        Stack<Node> stack = new Stack<>();
        for (int value : arr) {
            if (value == -1) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                Node node = new Node();
                node.data = value;

                if (!stack.isEmpty()) {
                    Node parent = stack.peek();
                    parent.children.add(node);
                } else {
                    root = node;
                }
                stack.push(node);
            }
        }
        return root;
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }
}
