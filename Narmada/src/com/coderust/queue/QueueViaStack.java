package com.coderust.queue;

import java.util.Stack;

public class QueueViaStack {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    void enqueue(int number){
        stack1.push(number);

    }

    boolean isEmpty(){
        if ((stack1.size() + stack2.size()) == 0){
            return true;
        }
        return false;
    }



    int  dequeue() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        if (stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }


    public static void main ( String [] args) throws  Exception{
        QueueViaStack queueViaStack = new QueueViaStack();
        queueViaStack.enqueue(10);
        queueViaStack.enqueue(20);
        queueViaStack.enqueue(30);
        queueViaStack.enqueue(40);
        System.out.println(queueViaStack.dequeue());
        System.out.println(queueViaStack.dequeue());
        queueViaStack.enqueue(50);
        System.out.println("====");
        System.out.println(queueViaStack.dequeue());
        System.out.println(queueViaStack.dequeue());
        System.out.println(queueViaStack.dequeue());





    }


}
