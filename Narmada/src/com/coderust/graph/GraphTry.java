package com.coderust.graph;

import java.util.*;

class Node {

    public int data;
    public List<Node> neighbours = new ArrayList<Node>();

    public Node(int data) {
        this.data = data;
    }
}

public class GraphTry {
    public static HashSet<Node> traversedNodes = new HashSet<>();

    public static void tarverseGraph(Node root) {
        if (!(traversedNodes.contains(root))) {
            traversedNodes.add(root);
            System.out.println(root.data);
            for (Node n : root.neighbours) {
                tarverseGraph(n);
            }

        } else {
            return;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node child1 = new Node(20);
        child1.neighbours.add(new Node(32));
        root.neighbours.add(child1);
        tarverseGraph(root);
    }


}
