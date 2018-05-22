package com.coderust.tree;
import java.util.Stack;

public class InorderTreeIterator {
    Stack<Node> stk = new Stack<>();

    public InorderTreeIterator(Node root) {
        while (root != null) {
            stk.push(root);
            root = root.left;
        }
    }

    public boolean hasNext(){
        return !stk.isEmpty();
    }

    public Node getNext(){
        Node ret= stk.pop();
        Node temp =ret.right;
        if (temp != null){
            while (temp != null ){
                stk.push(temp);
                temp=temp.left;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right = new Node(12);
        InorderTreeIterator itr = new InorderTreeIterator(root);
        while (itr.hasNext()){
            System.out.println(itr.getNext().data);
        }

    }


}
