package com.coderust.linkedlist;

public class DetectCycle {

    public static boolean detectCycle(Node head){
        if (head.next == null){
            return false;
        }
        Node runner1= head;
        Node runner2 = head.next;
        while ( runner2.next != null ){
            if (runner1 == runner2){
                return true;
            }
            runner1=runner1.next;
            if (runner2.next.next != null) {
                runner2 = runner2.next.next;
            }
            else {
                runner2=runner2.next;
            }
        }
        return false;
    }

    public static void main( String [] args){
        Node head= new Node(10);
        head.next =new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println(detectCycle(head));

    }


}
