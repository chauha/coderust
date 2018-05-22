package com.coderust.linkedlist;

public class RemoveNode {

    public static LinkedListNode removeNode(LinkedListNode head, int data) {
        LinkedListNode temp = head;
        LinkedListNode prev = head;
        while (temp != null) {
            if (temp.data == data) {
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return head;
        }
        if (temp == head) {
            return head.next;
        }
        prev.next = temp.next;
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);
        LinkedListNode result=removeNode(head,20);
        while (result != null ){
            System.out.println(result.data);
            result=result.next;
        }


    }


}
