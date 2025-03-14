public class binarySearchTree {
    public class TreeNode {
             int val;
           TreeNode left;
           TreeNode right;
             TreeNode() {}
           TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
        }
        public TreeNode insert(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            if (val < root.val) {
                root.left = insert(root.left, val);
            } else if (val > root.val) {
                root.right = insert(root.right, val);
            }
            return root;
        }  
        public static int[] inOrderTraversal(TreeNode root){
int []arr=new int[]
            if(root == null){
                return null;
                }
                inOrderTraversal(root.left);
                arr[i++]=root.val;
        }
          public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree();
        TreeNode root = null;
        int[] values = {10, 5, 15, 3, 7, 13, 18};
        for (int val : values) {
            root = bst.insert(root, val);
        }
        bst.inOrderTraversal(root);
    }
}
