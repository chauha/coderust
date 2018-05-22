package com.coderust.linkedlist;

public class InsertionSortLinkedList {

    public static Node insertionSort(Node head) {
        Node temp = head.next;
        Node sortedList = new Node(head.data);
        while (temp != null) {
            Node ptrSorted = sortedList;
            if (temp.data < ptrSorted.data) {
                Node tmp = new Node(temp.data);
                tmp.next = ptrSorted;
                sortedList = tmp;
                temp = temp.next;
                continue;
            }
            while (ptrSorted.next != null && ptrSorted.next.data < temp.data) {
                ptrSorted = ptrSorted.next;
            }
            Node nTmp = new Node(temp.data);
            nTmp.next = ptrSorted.next;
            ptrSorted.next = nTmp;
            temp = temp.next;
        }
        return sortedList;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(222);

        Node result = insertionSort(head);
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }


    }

}
