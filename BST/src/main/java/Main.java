public class Main {
    public static BST_Node get_BST_traverse(){
        return new BST_Node(new BST_Node(new BST_Node(null, null, 1), new BST_Node(new BST_Node(null,null,3), null, 4), 2), new BST_Node(null, new BST_Node(null,null,7), 6), 5);
    }

    public static void main(String[] args) {
        BST_Node root = get_BST_traverse();

        // BST Left
        BST_Left bst_left = new BST_Left();
        System.out.print("bst left preorder: ");
        bst_left.traverse_dfs_left_preorder(root);
        System.out.print("\nbst left inorder: ");
        bst_left.traverse_dfs_left_inorder(root);
        System.out.print("\nbst left preorder: ");
        bst_left.traverse_dfs_left_postorder(root);

        // BST Right
        BST_Right bst_right = new BST_Right();
        System.out.print("\nbst right preorder: ");
        bst_right.traverse_dfs_right_preorder(root);
        System.out.print("\nbst right inorder: ");
        bst_right.traverse_dfs_right_inorder(root);
        System.out.print("\nbst right preorder: ");
        bst_right.traverse_dfs_right_postorder(root);
    }
}
