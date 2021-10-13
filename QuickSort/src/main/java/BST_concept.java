public abstract class BST_concept {
    public static void traverse(BST_Node node){
        if (node == null) return;

        /** pre-order traversal  - QuickSort **/
        traverse(node.left);
        /** in-order traversal  - print value in ascending/ descending order **/
        traverse(node.right);
        /** post-order traversal  - MergeSort **/
    }
}
