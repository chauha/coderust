package com.coderust.linkedlist;

public class ReverseEvenNodes {

    public static Node  mergeLists(Node oddList,Node evenList){
        Node oddTemp;
        Node evenTemp;
        Node resultHead;
        resultHead=oddList;
        while (oddList != null && evenList != null){

            oddTemp=oddList.next;
            evenTemp=evenList.next;

            oddList.next=evenList;
            oddList.next.next=oddTemp;

            oddList=oddTemp;
            evenList=evenTemp;
        }
        return resultHead;
    }

    public static Node reverseEven(Node head){
        Node temp=head;
        Node evenList=null;
        while( temp != null && temp.next != null ){
            Node even=temp.next;
            temp.next=even.next;

            even.next=evenList;
            evenList=even;
            temp=temp.next;

        }

        return mergeLists(head,evenList);
    }


    public static void main(String [] args ){
        Node head=new Node(7);
        head.next= new Node(14);
        head.next.next= new Node(21);
        head.next.next.next= new Node(28);
        head.next.next.next.next = new Node(9);
        //        Node temp=head;
//        for (int i=2; i < 11 ; i++){
//            temp.next=new Node(i);
//            temp=temp.next;
//        }
        Node result=reverseEven(head);
        while (result != null){
            System.out.println(result.data);
            result=result.next;
        }
    }


}
