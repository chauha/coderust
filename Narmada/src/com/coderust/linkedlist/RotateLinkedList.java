package com.coderust.linkedlist;


public class RotateLinkedList {

    public static int findLength(Node head){
        int count=0;
        while (head != null ){
            count++;
            head=head.next;
        }
        return count;
    }

    public static Node rotateLinked(Node head,int n){
        int len=findLength(head);
        if (n<0){
            n=n+len;
        }
        if (n > len){
            n= n % len;
        }

        Node temp=head;
        int count=1;
        while (count< len - n){
            temp=temp.next;
            count++;
        }
        Node newHead=temp.next;
        Node runner=newHead;
        temp.next=null;
        while (runner.next != null){
            runner=runner.next;
        }
        runner.next=head;

        return newHead;

    }



public static void main(String [] args){
    Node head = new Node(10);
    head.next=new Node(20);
    head.next.next=new Node(30);
    head.next.next.next=new Node(40);
    head.next.next.next.next=new Node(50);
    Node result = rotateLinked(head,4);
    while (result!=null){
        System.out.println(result.data);
        result=result.next;
    }

}

}
