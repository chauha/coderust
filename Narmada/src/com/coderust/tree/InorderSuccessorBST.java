package com.coderust.tree;

public class InorderSuccessorBST {

    public static Node findMin(Node root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node findSuccessor(Node root, int d) {
        Node successor = null;
        while (root != null) {
            if (root.data < d) {
                root = root.right;
            } else if (root.data > d) {
                successor = root;
                root = root.left;

            } else {
                    if (root.right != null ) {
                        successor = findMin(root.right);

                    }
                break;
            }

        }
        return successor;


    }


    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(12);
        root.right = new Node(20);
        root.left.right = new Node(14);
        root.left.left = new Node(11);
        root.right.left = new Node(16);
        root.right.right = new Node(24);
        Node answer = findSuccessor(root, 16);
        System.out.println(answer.data);
    }
}
