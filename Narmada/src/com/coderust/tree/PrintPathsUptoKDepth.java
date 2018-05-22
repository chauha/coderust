package com.coderust.tree;

public class PrintPathsUptoKDepth {
    public static int[] paths = new int[10];

    public static void printPathsUptoKDepth(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        paths[level] = root.data;
        if (level == k) {
            for (int i = 0; i <= k; i++) {
                System.out.print(paths[i] + "\t");
            }
            System.out.println();
            return;
        }

        printPathsUptoKDepth(root.left, level + 1, k);
        printPathsUptoKDepth(root.right, level + 1, k);

    }

    public static void printLeafNodes(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println(root.data);
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);

    }


    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(12);
        root.right = new Node(20);
        root.left.right = new Node(14);
        root.left.left = new Node(11);
        root.right.left = new Node(16);
        root.right.right = new Node(24);
        root.right.right.left = new Node(17);
    //    printPathsUptoKDepth(root, 0, 3);
        printLeafNodes(root);
    }

}
