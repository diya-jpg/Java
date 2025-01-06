import java.util.*;

public class trees_diameter{
  
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

System.out.println(calculateDiareturnHeight(root));
}
  static int dia=0;
  static int calculateDiareturnHeight(Node node){
    int dhc=-1;
    int sdhc=-1;
    for(Node child:node.children){
        int rhc=calculateDiareturnHeight(child);
        if(rhc>dhc){
            sdhc=dhc;
            dhc=rhc;
        }
        else if(rhc>sdhc){
            sdhc=rhc;
    }
  }
  if(dhc+sdhc+2>dia){
    dia=dhc+sdhc+2;
  }
dhc+=1;

return dhc;
  }
}
