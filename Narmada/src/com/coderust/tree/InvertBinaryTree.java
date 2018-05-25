package com.coderust.tree;

public class InvertBinaryTree {


    public static Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
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
        System.out.println(invertTree(root).data);

    }


}
