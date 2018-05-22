package com.coderust.queue;

import java.util.ArrayDeque;

public class StackViaQueue
{
   ArrayDeque<Integer> queue1 = new ArrayDeque();
   ArrayDeque<Integer> queue2 = new ArrayDeque();


   boolean isEmpty(){
       if ( (queue1.size() + queue2.size()) == 0){
           return  true;
       }
       return false;
   }


   void push(int item){
       queue1.add(item);

   }

   int pop(){

       if (isEmpty()){
           return  -1;
       }
       while (queue1.size() >1){
           queue2.add(queue1.getFirst());
           queue1.removeFirst();
       }
       int result = queue1.getFirst();
       queue1.removeFirst();
       swapQueues();
       return  result;

   }

   void  swapQueues(){
       ArrayDeque<Integer> queue3;
       queue3=queue1;
       queue1=queue2;
       queue2=queue3;

   }

   public static void main (String [] args){

       StackViaQueue stack = new StackViaQueue();
       stack.push(10);
       stack.push(12);
       System.out.println(stack.pop());
       stack.push(23);
       stack.push(25);
       stack.push(28);
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
//       while(stack.pop() != -1){
//           System.out.println(stack.pop());
//       }
   }



}
