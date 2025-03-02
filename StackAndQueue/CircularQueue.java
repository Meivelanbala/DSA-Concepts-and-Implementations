package StackAndQueue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    CircularQueue(){
        this(DEFAULT_SIZE);
    }
    CircularQueue(int size){
        this.data = new int[size];
    }

    //Insert Function
    int end = 0;
    int front = 0;
    int size = 0;

    public boolean add(int item){
        if(isFull()){
            System.out.println("Queue is Already Full!");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    //isFull function
    public boolean isFull(){
        return size == data.length;
    }

    //Remove Function
    public int remove(){
        if(isEmpty()){
            System.out.println("The queue is empty!");
        }
        int removed = data[front++];  //Remove the Element that is first entered into queue
        front = front % data.length;
        size--;
        return removed;
    }

    //isEmpty function
    public boolean isEmpty(){
        return size == 0;
    }

    //Display function
    public void display(){
        int i = front;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i = i % data.length;
        }while (i != end);
        System.out.println("END");
    }

    //peek function
    public int peek(){
        if(isEmpty()){
            System.out.println("can't peek as The queue is empty!");
        }
        return data[front];
    }
}
