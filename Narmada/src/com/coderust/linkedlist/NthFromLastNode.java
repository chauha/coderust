package com.coderust.linkedlist;

public class NthFromLastNode {

    public static int findNthFromLast(Node head, int n){

        Node temp=head;
        for (int i =1 ; i <=n ; i++){
            temp=temp.next;
        }
        Node runner=head;
        while (temp.next != null ){
            temp=temp.next;
            runner=runner.next;
        }
        return runner.data;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        int i = 0;
        Node temp = head;
        while (i < 10) {
            temp.next = new Node(i);
            i++;
            temp = temp.next;
        }
        System.out.println(findNthFromLast(head,1));

    }

}
