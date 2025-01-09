class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class bitrees_height{
    public static int height(Node node){
       
      if(node==null){
        return 0;
      }
     if(node.left==null&&node.right==null){
        return 0;
     }
return 1+Math.max(height(node.left),height(node.right));
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
System.out.println(height(root));
  
   }

   

}
