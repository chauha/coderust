package com.coderust.tree;

import java.util.ArrayList;
import java.util.HashMap;

public class VerticalOrderTraversal {

    private static HashMap<Integer, ArrayList<Node>> verticalList = new HashMap<>();

    public static void doVerticalTraverse(Node root, int distance) {
        if (root == null) {
            return;
        }
        if (verticalList.get(distance) == null) {
            ArrayList<Node> list = new ArrayList<>();
            list.add(root);
            verticalList.put(distance, list);
        } else {
            ArrayList<Node> list = verticalList.get(distance);
            list.add(root);
            verticalList.put(distance, list);
        }
        doVerticalTraverse(root.left, distance - 1);
        doVerticalTraverse(root.right, distance + 1);

    }

    public static void printNodesVertically(Node root) {
        doVerticalTraverse(root, 0);
        for (Integer ele : verticalList.keySet()) {
          //  System.out.print(ele + " Level\t");
            ArrayList<Node> nodes = verticalList.get(ele);
            for (Node node : nodes) {
                System.out.print(node.data + "\t");
            }
            System.out.println();
        }
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
        printNodesVertically(root);
    }
}
