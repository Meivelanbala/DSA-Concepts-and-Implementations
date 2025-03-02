package LinkedList;

public class CircularLL {
    private Node Head;
    private Node Tail;
    public CircularLL(){
        this.Head = null;
        this.Tail = null;
    }

    public class Node{
        int value;
        Node next;

        Node(int val){
            this.value = val;
        }
        Node(int val, Node next){
            this.value =val;
            this.next = next;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if(Head == null){
            Head = node;
            Tail = node;
        }
        node.next = Head;
        Tail.next = node;
        Tail = node;
    }

    public void delete(int val){
        Node node = Head;
        if(Head == null){return;}
        //Deleting first index
        if(node.value == val){
            Head = Head.next;
            Tail.next = Head;
        }
        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
            }
            node = node.next;
        }while (node != Head);
    }

    //Displaying
    public void display(){
        Node tnode = Head;
        if(Head != null){
            do{
                System.out.print(tnode.value+ " -> ");
                tnode = tnode.next;
            }while (tnode != Head);
        }
        System.out.println("Head");
    }

}
