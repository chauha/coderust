package com.coderust.linkedlist;

import java.util.HashSet;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }

}

public class FindDupliactesLinkedList {

public static Node removeDuplicates(Node start){
    Node temp=start;
    HashSet<Integer> nodeHashSet = new HashSet<Integer>();
    Node prev=temp;
    while (temp != null){
        if (nodeHashSet.contains(temp.data)){
           prev.next=temp.next;
           temp=temp.next;
           continue;
        }
        nodeHashSet.add(temp.data);
        prev=temp;
        temp=temp.next;
    }
    return start;

}

public static void main(String [] args){
    Node head = new Node(20);
    head.next= new Node(20);
    head.next.next= new Node(20);
    Node result = removeDuplicates(head);
    while(result != null){
        System.out.println(result.data);
        result=result.next;
    }
}



}
