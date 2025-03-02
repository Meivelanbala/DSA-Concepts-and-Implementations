package StackAndQueue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    CustomQueue(){
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size){
        this.data = new int[size];
    }

    //Insert Function
    int end = 0;
    public boolean add(int item){
        if(isFull()){
            System.out.println("Queue is Already Full!");
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }
    //isFull function
    public boolean isFull(){
        return end == data.length;
    }

    //Remove Function
    public int remove(){
        if(isEmpty()){
            System.out.println("The queue is empty!");
        }
        int removed = data[0];  //Remove the Element that is first entered into queue

        //To Removing 1st ele 1 tym shift the elements to left side
        for(int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    //isEmpty function
    public boolean isEmpty(){
        return end == 0;
    }

    //Display function
    public void display(){
        for(int i=0; i<end;i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("End");
    }

    //peek function
    public int peek(){
        if(isEmpty()){
            System.out.println("can't peek as The queue is empty!");
        }
        return data[0];
    }
}
