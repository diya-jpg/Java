class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class bitrees_maxelement{
    public static int maxelement(Node node){
        int max=Integer.MIN_VALUE;
      if(node==null){
        return 0;
      }
      int a=node.val;
      int b=maxelement(node.left);
      int c=maxelement(node.right);
max=Math.max(a,b);
max=Math.max(max,c);
return max;
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
System.out.println(maxelement(root));
  
   }

   

}
