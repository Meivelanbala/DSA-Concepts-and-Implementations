package LinkedList;

public class Linkedlist {
    private Node Head;
    private Node Tail;
    private int size;
    public Linkedlist(){
        this.size = 0;
    }

    //Inserting @ First Index
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = Head;
        Head = node;

        if(Tail == null){
            Tail = Head;
        }
        size++;
    }

    //Inserting @ Last Index
    public void insertLast(int val){
        //What if tail == null
        if(Tail == null){
            insertFirst(val);
        }
        Node node = new Node(val);
        Tail.next = node;
        Tail = node;
        size++;
    }

    //Insert @ particular index
    public void insetIndex(int val, int index){
        if(index == 0){insertFirst(val);}
        if(index == size){insertLast(val);}

        Node temp = Head;
        for(int i =1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val , temp.next);
        temp.next = node;
    }

    //Deleting a node at first position
    public int deleteFirst(){
        int value = Head.value;
        Head = Head.next;
        //if list has only 1 element
        if(Head == null){
            Tail = null;
        }
        return value;
    }

    //Delete a node at last index
    public int deleteLast(){
        if(size <= 1){deleteFirst();}  //if only one ele present call delete first func
        Node SecondLastnode = getnode(size - 2);
        int value = Tail.value;
        Tail = SecondLastnode;
        Tail.next = null;
        return value;
    }

    //Deleting at particular index
    public int deleteParticularIndex(int index){
        if(index == 0){deleteFirst();}
        if(index == size - 1){deleteLast();}

        Node prevnode = getnode(index - 1);
        int val = prevnode.next.value;
        prevnode.next = prevnode.next.next;
        return val;
    }

    //Finding a node that contains a value we are searching for
    public Node findnode(int value){
        Node node = Head;
        while(node != null){
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //Function for returning node
    public Node getnode(int ind){
        Node node = Head;
        for(int i=0; i<ind; i++){
            node = node.next;
        }
        return node;
    }

    //Display Function
    public void display(){
        Node temp = Head;
        while(temp != null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
        Node(int val ,Node next){
            this.value = val;
            this.next = next;
        }
    }
}
