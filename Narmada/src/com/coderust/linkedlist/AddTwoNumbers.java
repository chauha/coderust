package com.coderust.linkedlist;

public class AddTwoNumbers {

    public static Node addNumbers(Node list1, Node list2) {
        Node resultHead = null;
        Node temp1 = list1;
        Node temp2 = list2;
        int carry = 0;
        Node resultRunner = null;
        while (temp1 != null && temp2 != null) {
            int num = temp1.data + temp2.data;
            int res = (num + carry) % 10;
            carry = (num + carry) / 10;
            if (resultHead == null) {
                resultHead = new Node(res);
                resultRunner = resultHead;
                temp1 = temp1.next;
                temp2 = temp2.next;
                continue;
            }
            resultRunner.next = new Node(res);
            resultRunner = resultRunner.next;
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        if (temp1 != null) {
            while (temp1 != null) {
                int res = (temp1.data + carry) % 10;
                carry = (temp1.data + carry) / 10;
                resultRunner.next = new Node(res);
                resultRunner = resultRunner.next;
                temp1 = temp1.next;
            }
        }

        if (temp2 != null) {
            while (temp2 != null) {
                int res = (temp2.data + carry) % 10;
                carry = (temp2.data + carry) / 10;
                resultRunner.next = new Node(res);
                resultRunner = resultRunner.next;
                temp2 = temp2.next;
            }
        }

        if (carry > 0) {
            resultRunner.next = new Node(carry);
        }
        return resultHead;
    }


    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(0);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(9);
        Node head2 = new Node(7);
        head2.next = new Node(3);
        head2.next.next = new Node(2);
        Node result = addNumbers(head1, head2);
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}
