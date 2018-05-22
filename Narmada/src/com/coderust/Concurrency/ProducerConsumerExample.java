package com.coderust.Concurrency;

import java.util.LinkedList;

public class ProducerConsumerExample {

    public static void main(String[] args) {
        EndClient ec = new EndClient();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ec.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ec.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(Runtime.getRuntime().availableProcessors());
        t1.start();
        t2.start();
    }

}


class EndClient {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 3;
    static int num = 0;

    public void produce() throws InterruptedException {
        synchronized (this) {
            while (true) {
                while (list.size() == capacity) {
                    wait();
                }
                System.out.println("Produces" + num);
                list.add(num++);
                notifyAll();
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (true) {
                while (list.size() == 0) {
                    wait();
                }
                System.out.print("Consumes: ");
                System.out.println(list.getLast());
                list.removeLast();
                notifyAll();
            }
        }
    }


}