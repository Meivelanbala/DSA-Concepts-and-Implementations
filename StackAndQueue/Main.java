package StackAndQueue;

import LinkedList.CircularLL;

public class Main {
    public static void main(String[] args) {

        //Singly Linked List Operation
//        Linkedlist list = new Linkedlist();
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.insertLast(7);
//        list.insetIndex(54,1);
//
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.deleteParticularIndex(2));
//        list.display();
//
//        System.out.println(list.findnode(2));

        //Doubly linked List Operation
//        DoublyLinkedlist list1 = new DoublyLinkedlist();
//        list1.InsertFirst(4);
//        list1.InsertFirst(3);
//        list1.InsertFirst(2);
//        list1.InsertFirst(1);
//
//        list1.InsertLast(5);
//        list1.InsertAfterValue(5,6);
//
//        list1.display();
//        list1.displayReverse();

        CircularLL list2 = new CircularLL();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);
        list2.insert(4);

        list2.display();
        list2.delete(3);
        list2.display();
    }
}