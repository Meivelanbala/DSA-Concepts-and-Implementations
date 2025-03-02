package LinkedList;

public class DoublyLinkedlist {
    private Node Head;
    private Node Tail;

    private class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }

        Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }

    }

    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = Head;
        node.prev = null;
        //if list is already empty then Head.prev = node will give error/ so check condition
        if(Head != null) {
            Head.prev = node;
        }
        Head = node;
    }

    public void InsertLast(int val){
        Node node = new Node(val);
        Node last = Head;
        node.next = null;
        //if list is empty
        if(Head == null){
            //InsertFirst(val);
            Head = node;
            node.prev = null;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    //Displaying
    public void display(){
        Node temp = Head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
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

    //Insert after a particular value
    public void InsertAfterValue(int after, int value){
        Node p = findnode(after);
        Node node = new Node(value);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if(node.next != null) {
            node.next.prev = node;
        }
    }


    //Displaying in Reverse Order
    public void displayReverse() {
        Node temp = Head;
        Node last = null;
        while (temp != null){
            last = temp;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Display in Reverse order");
        while (last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("Null");
    }



}
