import java.util.*;
import java.util.Stack;
public class trees_lca{
 
    public static int lca(Node node,int d1,int d2){
        ArrayList<Integer>p1=nodeToRootPath(node, d1);
        ArrayList<Integer>p2=nodeToRootPath(node, d2);
        int i=p1.size()-1;
        int j=p2.size()-1;
        while(i>=0&&j>=0&&p1.get(i)==p2.get(j)){
            i--;
            j--;
        }

        return p1.get(i+1);
    }
    public static int lca2(Node node,int d1,int d2){
        ArrayList<Integer>p1=nodeToRootPath(node, d1);
        ArrayList<Integer>p2=nodeToRootPath(node, d2);
        int i=p1.size()-1;
        int j=p2.size()-1;
        while(i>=0&&j>=0&&p1.get(i)==p2.get(j)){
            i--;
            j--;
        }
        i++;
        j++;
        return i+j;
    }
      public static ArrayList<Integer>nodeToRootPath(Node node,int data){
        if(node.data==data){
            ArrayList<Integer>list=new ArrayList<>();
            list.add(node.data);
            return list;
        }
        for(Node child:node.children){
            ArrayList<Integer>list=nodeToRootPath(child, data);
            if(list.size()>0){
                list.add(node.data);
                return list;
            }
        }
        return new ArrayList<>();
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
    
           
          System.out.println(nodeToRootPath(root,110));
          System.out.println(lca(root,70,110));
          System.out.println(lca2(root,70,110));
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
    
