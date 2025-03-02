package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        Queue<Integer> que = new LinkedList<>();  // Refer note why using LinkedList. Queue is an Interface
//
//        //Adding elements in queue
//        que.add(78);
//        que.add(67);
//        que.add(70);
//
//        //To get an ele at First
//        System.out.println(que.peek());  // Peek always points to first ele in queue
//        System.out.println(que.peek());
//
//
//        //Removing elements in queue
//        System.out.println(que.remove());   //FIFO

//There is another class called Deque
        //Creating Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(90);
        deque.addFirst(45); //add 1st
        deque.addLast(56);  // add last

        //Removing
        deque.remove();
        deque.removeLast();
        deque.removeLast();
        //ect..

    }
}
