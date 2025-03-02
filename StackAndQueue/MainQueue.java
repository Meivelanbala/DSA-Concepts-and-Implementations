package StackAndQueue;

public class MainQueue {
    public static void main(String[] args) {
//        CustomQueue queue = new CustomQueue(3);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//       // queue.add(4); //Queue is full
//
//        queue.display();
//
//        System.out.println("Peek : "+ queue.peek());
//
//        System.out.println(queue.remove());
//
//        queue.display();
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

//    CircularQueue queue = new CircularQueue(3);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//    // queue.add(4); //Queue is full
//
//        queue.display();
//
//        System.out.println("Peek : "+ queue.peek());
//
//        System.out.println(queue.remove());
//
//        queue.display();
//        queue.add(12);
//        queue.display();


        //Implement Queue using Stack
        QueueUsingStack stack = new QueueUsingStack();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());  // 3,2,1 Queue - FIFO o/p --> 3

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
