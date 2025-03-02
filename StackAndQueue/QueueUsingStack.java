package StackAndQueue;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    QueueUsingStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int item){
        stack1.push(item);
    }

    public int pop(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int pop = stack2.pop();

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return pop;
    }

    public int peek(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int peek = stack2.peek();

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return peek;
    }
    public boolean isEmpty(){
        return stack1.isEmpty();
    }

    
}
