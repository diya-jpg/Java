class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class bitrees_preorder{
    public static void pre(Node node){
    if (node ==null){
        return;
    }
    System.out.println(node.val);
pre(node.left);
pre(node.right);
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
pre(root);
  
   }

   

}
