package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q;

    StackUsingQueue(){
        q = new LinkedList<>();
    }

    public void add(int item){
        q.add(item);
        for(int i=0; i<q.size()-1; i++){
            q.add(q.poll());
        }
    }

    public int poll(){
        if(q.isEmpty()){
            throw new RuntimeException("Stack is empty, cannot get top!");
        }
        return q.poll();
    }

    public int peek(){
        if(q.isEmpty()){
            throw new RuntimeException("Stack is empty, cannot get top!");
        }
        return q.peek();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }
}
