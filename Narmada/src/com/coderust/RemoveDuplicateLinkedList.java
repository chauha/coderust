package com.coderust;

import java.util.HashSet;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;

    }


}


public class RemoveDuplicateLinkedList {

    public Node removeDuplicates(Node start) {
        Node temp = start;
        HashSet<Node> node = new HashSet();
        Node prev= start;
        while (temp != null) {
            if (!node.contains(temp)) {
                node.add(temp);
                prev=temp;
                temp=temp.next;
            }
            else{
                prev.next=temp.next;
                temp=temp.next;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        Node start = new Node(10);
        start.next = new Node(20);
        start.next.next = new Node(10);
        Node result=new RemoveDuplicateLinkedList().removeDuplicates(start);
        while(result.next != null){
            System.out.println(result.data);
            result=result.next;
        }
    }


}
