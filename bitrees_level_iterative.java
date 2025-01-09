class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class bitrees_level_iterative{
    public static void nthlevel(Node node,int k){
    if (node ==null){
        return;
    }
  if(k==1){
System.out.print(node.val+" ");
  }
  nthlevel(node.left,k-1);
  nthlevel(node.right,k-1);
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
nthlevel(root,3);
  
   }

   

}
