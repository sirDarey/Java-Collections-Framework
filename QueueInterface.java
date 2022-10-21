/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCollections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @Sir Darey
 */

public class QueueInterface {
    
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedBlockingQueue<>(); //Size is not fixed
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(5);
        queue.add(4);
        
        queue.forEach(x -> {
            System.out.println(x);
        });
        
        Queue <Integer> queue2 = new ArrayBlockingQueue<>(3);  //Size is fixed
        
        //The ".add" function fails when an ArrayBlockingQueue is full
        //Hence, ".offer" is the safest to use
        queue2.offer(1);
        queue2.offer(3);
        queue2.offer(2);
        queue2.offer(5);
        queue2.offer(4);
        
        queue2.forEach(x -> {
            System.out.println(x);
        });
    }
}
