package com.coderust.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;


public class LRUCache {
    HashMap<Integer,Integer> cache = new HashMap<Integer, Integer>();
    Deque<Integer> queue = new ArrayDeque<>(5);

    Integer get(int number){
        if (cache.get(number) != null ){
            queue.remove(cache.get(number));
            queue.add(cache.get(number));
            return cache.get(number);
        }


        if (queue.size() == 5) {
            cache.remove(queue.getLast());
            queue.remove();
        }
            cache.put(number,number);
            queue.add(cache.get(number));
            return cache.get(number);
    }



   public static void main (String [] args){

        LRUCache lruCache = new LRUCache();
        for (int i =1 ; i <=5 ; i++){
            lruCache.cache.put(i,i);
            lruCache.queue.add(i);
        }

        lruCache.get(2);
        System.out.println(lruCache.get(8));

   }



}
