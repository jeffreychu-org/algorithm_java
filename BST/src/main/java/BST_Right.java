public class BST_Right {
    public void traverse_dfs_right_preorder(BST_Node node){
        if(node == null) return;

        System.out.print(node.val + " ");
        traverse_dfs_right_preorder(node.right);
        traverse_dfs_right_preorder(node.left);
    }

    public void traverse_dfs_right_inorder(BST_Node node){
        if(node == null) return;

        traverse_dfs_right_inorder(node.right);
        System.out.print(node.val + " ");
        traverse_dfs_right_inorder(node.left);
    }

    public void traverse_dfs_right_postorder(BST_Node node){
        if(node == null) return;

        traverse_dfs_right_postorder(node.right);
        traverse_dfs_right_postorder(node.left);
        System.out.print(node.val + " ");
    }
}
