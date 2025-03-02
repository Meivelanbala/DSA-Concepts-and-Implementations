package StackAndQueue;

public class MainStack {
    public static void main(String[] args) {
//        CustomStack stack = new CustomStack(4);
//        stack.push(12);
//        stack.push(45);
//        stack.push(10);
//        stack.push(11);
//        //stack.push(11);  //Throws error as size is set to 4 we are trying to insert 5th ele.
//
//        System.out.println("peeked  : " + stack.peek());
//
//        System.out.println("Removed");
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        //System.out.println(stack.pop());  // Display error as stack is empty\

//        DynamicStack dstack = new DynamicStack(5);
//        dstack.push(2);
//        dstack.push(1);
//        dstack.push(3);  //size is defined 2 , but we are inserting 3 elements . this is possible because after stack is full the stack size will be doubled and copy the elements
//
//        System.out.println(dstack.pop());
//        System.out.println(dstack.pop());
//        System.out.println(dstack.peek());

        //Stack using Queue
        StackUsingQueue stack = new StackUsingQueue();

        stack.add(1);
        stack.add(2);
        System.out.println(stack.peek()); // return 2
        System.out.println(stack.poll()); // return 2
        System.out.println(stack.isEmpty()); // return False
    }
}
