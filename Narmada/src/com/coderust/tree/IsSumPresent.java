package com.coderust.tree;

public class IsSumPresent {


    public static boolean findPath(Node root, int sum) {
        if (root == null) {
            if (sum == 0) {
                return true;
            } else {
                return false;
            }
        }
        return (findPath(root.left, sum - root.data) || findPath(root.right, sum - root.data));

    }


    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(12);
        root.right = new Node(20);
        root.left.right = new Node(14);
        root.left.left = new Node(11);
        root.right.left = new Node(11);
        root.right.right = new Node(24);
        System.out.println(findPath(root,35));
    }

}
