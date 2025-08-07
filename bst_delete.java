 class Node{
    int key;
    Node left,right;
   public  Node(int item){
key=item;
left=right=null;
    }
}
class bst{
    Node root;
    bst(){
        root=null;
    }
    void insert(int key){
root=insertintorec(root,key);
    }
    Node insertintorec(Node root,int key){
        if(root==null){
           return  root=new Node(key);
        }
        if(key<root.key){
            root.left=insertintorec(root.left,key);

        }
        else{
            root.right=insertintorec(root.right,key);
        }
        return root;
    }
      void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    void delete(int target){
     root= deleteRec(root,target); 
        System.out.println();
    }
    Node deleteRec(Node root,int target){
         if (root == null) return root;

   if (target < root.key) {
    root.left = deleteRec(root.left, target);
} else if (target > root.key) {
    root.right = deleteRec(root.right, target);
}
 else {
        // Node with only one child or no child
        if (root.left == null)
            return root.right;
        else if (root.right == null)
            return root.left;

        // Node with two children: Get the inorder predecessor (max in left subtree)
        root.key = maxValue(root.left);

        // Delete the inorder predecessor
        root.left = deleteRec(root.left, root.key);
    }

    return root;
}

int maxValue(Node node) {
    int max = node.key;
    while (node.right != null) {
        max = node.right.key;
        node = node.right;
    }
    return max;
}
}
public class bst_delete {

    public static void main(String[] args) {
        bst tree = new bst();

        /* Let us create the following BST
                  50
               /     \
              30      70
             /  \    /  \
           20   40  60   80 */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
    System.out.println("Inorder traversal:");
        tree.inorder();
       tree.delete(80);
         tree.inorder();
    }
}

