class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class bitrees_size {
    public static int size(Node node){
        if (node == null) {return 0;}
     int size=0;
     size+=size(node.left);
     size+=size(node.right);
     size+=1;
     return size;
    }
    public static int size2(Node root){
        if (root == null) {return 0;}
return 1+size2(root.left)+size2(root.right);
    }
   public static void main(String[] args) {
    Node root=new Node(1);
    Node a=new Node(2);
    Node b=new Node(3);
    root.left=a;
    root.right=b;
    Node c=new Node(4);
    Node d=new Node(5);
    a.left=c;
    a.right=d;
    Node e=new Node(6);
    Node f=new Node(7);
    b.left=e;
    b.right=f;
System.out.println(size2(root));
  
   }

   

}
