package com.coderust.tree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public void addNode(Node root, int nodeData) {
        if (nodeData > root.data) {
            addNode(root.right, data);
        }

    }

}


public class CheckIdenticalBinaryTree {
    public static boolean checkIdenticalTrees(Node tree1, Node tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if (tree1 != null && tree2 != null) {
            return (tree1.data == tree2.data && checkIdenticalTrees(tree1.left, tree2.left) && checkIdenticalTrees(tree1.right, tree2.right));
        }
        return false;
    }


    public static void main(String[] args) {
        Node tree1 = new Node(10);
        tree1.right = new Node(20);
        tree1.left = new Node(5);

        Node tree2 = new Node(10);
        tree2.right = new Node(20);
        tree2.left = new Node(4);
        System.out.println(checkIdenticalTrees(tree1, tree2));

    }


}
