class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class bitrees_minelement{
    public static int minelement(Node node){
        int min=Integer.MAX_VALUE;
      if(node==null){
        return min;
      }
      int a=node.val;
      int b=minelement(node.left);
      int c=minelement(node.right);
min=Math.min(a,b);
min=Math.min(min,c);
return min;
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
System.out.println(minelement(root));
  
   }

   

}
