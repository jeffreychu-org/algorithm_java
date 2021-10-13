public class BST_Left {
    /** preorder traversal (DFS): root -> left -> right **/
    public void traverse_dfs_left_preorder(BST_Node node){
        if(node == null) return;

        System.out.print(node.val + " ");
        traverse_dfs_left_preorder(node.left);
        traverse_dfs_left_preorder(node.right);
    }

    public void traverse_dfs_left_inorder(BST_Node node){
        if(node == null) return;

        traverse_dfs_left_inorder(node.left);
        System.out.print(node.val + " ");
        traverse_dfs_left_inorder(node.right);
    }

    public void traverse_dfs_left_postorder(BST_Node node){
        if(node == null) return;

        traverse_dfs_left_postorder(node.left);
        traverse_dfs_left_postorder(node.right);
        System.out.print(node.val + " ");
    }
}
