package StackAndQueue;

public class CustomStack {
    //Creating array that stores element
    protected int[] data;   //Internally the stack stores item in form of an array

    //Fixing the Default size for an array
    private static final int DEFAULT_SIZE = 10;
    /* private -> Doesn't want anyone to access the fixed size variable
       static  -> Size should be updated throughout the program
       final   -> Even I too don't want to change the size
     */

    //We can set the size to the stack, but it should be within 10(Default size)
    CustomStack(){
        this(DEFAULT_SIZE);   //If user doesn't define size it will create array of default size
    }
    CustomStack(int size){
        this.data = new int[size]; // getting size from the user and passing via constructor
    }

    //Inserting function
    int ptr = -1;
    public boolean push(int item){
        //checking if the stack is already full
        if(isFull()){
            System.out.println("Stack is full!");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    //creating isFull method to check stack is full or not
    public boolean isFull(){
        return ptr == data.length - 1;
    }

    //Deleting function
    public int pop(){
        //Checking if stack is empty or not, because if stack is empty we can't poop
        if(isEmpty()){
            System.out.println("Stack is Empty, We can't pop from empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    //creating isEmpty method to check stack is empty or not
    public boolean isEmpty(){
        return ptr == -1;
    }

    //Getting ele at top function - peek
    public int peek(){
        //check for empty
        if(isEmpty()){
            System.out.println("Can't peek from empty stack");
        }
        return data[ptr];
    }
}
