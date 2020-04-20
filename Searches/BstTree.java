package Searches;

public class BstTree {

    BstNode root;

    public BstNode search(BstNode root, int valueToSearch) {

        if (root == null || root.data == valueToSearch) {
            return root;
        }

        if (valueToSearch < root.data) {
            return search(root.left, valueToSearch);
        } else {
            return search(root.right, valueToSearch);
        }
    }

    public void insertValue(int value) {
        root = insertNode(root, value);
    }

    public BstNode insertNode(BstNode root, int valueToInsert) {

        if (root == null) {
            root = new BstNode(valueToInsert);
            return root;
        }

        if (valueToInsert < root.data) {
            root.left = insertNode(root.left, valueToInsert);

        } else {
            root.right = insertNode(root.right, valueToInsert);
        }

        return root;
    }

    /*
     * 10 / \ 4 15 / \ / \ 2 7 12 17
     */
    public static void main(String[] args) {
        // BstNode root = new BstNode(10);
        // BstTree tree = new BstTree(root);
        // tree.root.left = new BstNode(4);
        // tree.root.left.left = new BstNode(2);
        // tree.root.left.right = new BstNode(7);
        // tree.root.right = new BstNode(15);
        // tree.root.right.left = new BstNode(12);
        // tree.root.right.right = new BstNode(17);

        // System.out.println("Search: " + tree.search(root, 2));
        // System.out.println("Search: " + tree.search(root, 15));
        // System.out.println("Search: " + tree.search(root, 23));
        // tree.insertValue(23);
        // System.out.println("Search: " + tree.search(root, 23));
        // System.out.println("Search: " + tree.search(root, 24));
        // tree.insertValue(24);
        // System.out.println("Search: " + tree.search(root, 24));

        BstTree tree2 = new BstTree();
        System.out.println("Search: " + tree2.search(tree2.root, 50));
        tree2.insertValue(50);
        System.out.println("Search: " + tree2.search(tree2.root, 50));

        System.out.println("Search: " + tree2.search(tree2.root, 25));
        System.out.println("Search: " + tree2.search(tree2.root, 0));
        tree2.insertValue(25);
        System.out.println("Search: " + tree2.search(tree2.root, 25));
       
    }
}