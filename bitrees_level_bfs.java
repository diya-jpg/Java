class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class bitrees_level_bfs{
    public static int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
   graph_represe
    public static void levelorderTraversal(Node node){
        int levels = height(node)+1;
        for(int i=1;i<=levels;i++){
            nthlevel(node,i);
            System.out.println();
            
        }
        return;
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
levelorderTraversal(root);
  
   }

   

}
