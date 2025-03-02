package StackAndQueue;

import java.util.Stack;
//Stack ----------->  First In Last Out / Last In First Out FIFI/ LIFO
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Inserting Elements into stack --> push
        stack.push(10);
        stack.push(12);
        stack.push(45);
        stack.push(18);

        //Removing Elements from stack  --> pop
        System.out.println(stack.pop());  //Last ele inserted will be the first ele popped --> 18
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
