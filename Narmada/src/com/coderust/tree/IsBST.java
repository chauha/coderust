package com.coderust.tree;

public class IsBST {

    public static boolean validateBST(Node root, int min_value, int max_value) {
        if (root == null) {
            return true;
        }
        if (root.data > max_value || root.data < min_value) {
            return false;
        }
        return (validateBST(root.left, min_value, root.data) && validateBST(root.right, root.data, max_value));

    }


    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(12);
        root.right = new Node(20);
        root.left.right = new Node(14);
        root.left.left = new Node(11);
        root.right.left = new Node(11);
        root.right.right = new Node(24);
        System.out.println(validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
