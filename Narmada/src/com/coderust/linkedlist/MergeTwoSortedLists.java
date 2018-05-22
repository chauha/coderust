package com.coderust.linkedlist;

public class MergeTwoSortedLists {

    public static Node  reverseList(Node head){
        Node temp=head;
        Node prev=null;
        while (temp != null){
            Node tm=temp.next;
            temp.next=prev;
            prev=temp;
            temp=tm;
        }
        return prev;
    }
    public static Node mergeSortedLists(Node list1, Node list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        Node list1Tmp = list1;
        Node list2Tmp = list2;
        Node resultHead = null;
        Node runner = null;
        while (list1 != null && list2 != null) {

            if (list1.data < list2.data) {
                if (resultHead == null) {
                    resultHead = list1;
                    runner = resultHead;
                    list1 = list1.next;
                    continue;
                }
                runner.next = list1;
                runner = runner.next;
                list1 = list1.next;
            } else {
                if (resultHead == null) {
                    resultHead = list2;
                    runner = resultHead;
                    list2 = list2.next;
                    continue;
                }
                runner.next = list2;
                runner = runner.next;
                list2 = list2.next;
            }

        }
        if (list1 != null) {
            runner.next = list1;
        }
        if (list2 != null) {
            runner.next = list2;
        }
        //return resultHead;
            return reverseList(resultHead);
    }


    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(5);
        list1.next.next = new Node(7);
        Node list2 = new Node(2);
        list2.next = new Node(4);
        Node result = mergeSortedLists(list1, list2);
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}
