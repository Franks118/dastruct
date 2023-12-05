/*
Author: Jeilo R Sapanta
Written On: December 5, 2023
*/


class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    // Determine whether the binary search tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Search the binary search tree for a particular item
    public boolean search(int key) {
        return search(root, key);
    }

    private boolean search(TreeNode root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }

        return key < root.key ? search(root.left, key) : search(root.right, key);
    }

    // Insert an item in the binary search tree
    public void insert(int key) {
        root = insert(root, key);
    }

    private TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Delete an item from the binary search tree
    public void delete(int key) {
        root = delete(root, key);
    }

    private TreeNode delete(TreeNode root, int key) {
        // Implementation of deletion logic
        // ...

        return root;
    }

    // Find the height of the binary search tree
    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(TreeNode root) {
        return root == null ? 0 : Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    // Find the number of nodes in the binary search tree
    public int getNodeCount() {
        return getNodeCount(root);
    }

    private int getNodeCount(TreeNode root) {
        return root == null ? 0 : getNodeCount(root.left) + getNodeCount(root.right) + 1;
    }

    // Find the number of leaves in the binary search tree
    public int getLeafCount() {
        return getLeafCount(root);
    }

    private int getLeafCount(TreeNode root) {
        return root == null ? 0 : (root.left == null && root.right == null) ? 1
                : getLeafCount(root.left) + getLeafCount(root.right);
    }

    // Traverse the binary search tree
    public void traverse() {
        traverseInOrder(root);
    }

    private void traverseInOrder(TreeNode root) {
        if (root != null) {
            traverseInOrder(root.left);
            System.out.print(root.key + " ");
            traverseInOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] keys = { 50, 30, 70, 20, 40, 60, 80 };

        for (int key : keys) {
            bst.insert(key);
        }

        System.out.println("In-order traversal:");
        bst.traverse();

        System.out.println("\nIs BST empty? " + bst.isEmpty());
        System.out.println("Search for 40: " + bst.search(40));
        System.out.println("Height of BST: " + bst.getHeight());
        System.out.println("Number of nodes: " + bst.getNodeCount());
        System.out.println("Number of leaves: " + bst.getLeafCount());
    }
}