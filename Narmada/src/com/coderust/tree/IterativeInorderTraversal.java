package com.coderust.tree;

import java.util.Stack;

public class IterativeInorderTraversal {

    public static  void inorderTraverse(Node root){
        Stack<Node> stk = new Stack<Node>();
        while(root != null || !stk.isEmpty()){
            while (root != null ){
                stk.push(root);
                root = root.left;
            }
            System.out.println(stk.peek().data);
            root=stk.pop().right;

        }

    }

    public static void recursiveInorderTraverse(Node root){
        if (root == null){
            return;
        }
        recursiveInorderTraverse(root.left);
        System.out.println(root.data);
        recursiveInorderTraverse(root.right);

    }


    public static void main(String [] args){
        Node root= new Node(15);
        root.left= new Node(12);
        root.right = new Node(20);
        root.left.right = new Node(14);
        root.left.left = new Node(11);
        root.right.left= new Node(16);
        root.right.right=new Node(24);
        //inorderTraverse(root);
        recursiveInorderTraverse(root);
    }




}
