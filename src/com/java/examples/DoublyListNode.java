package com.java.examples;

public class DoublyListNode {
    int val;
    DoublyListNode next, prev;

    DoublyListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }

    public static class DoublyLinkedList{
        private DoublyListNode head;
        public void add(int i) {
            DoublyListNode newNode = new DoublyListNode(i);
            if(head==null){
                head=newNode;
                return;
            }
            DoublyListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }

        public void printLinkedList() {
            DoublyListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");

        }

        public void reverseLinkedList() {
            DoublyListNode temp=null;
            DoublyListNode current=head;
            while(current!=null){
                temp=current.prev;
                current.prev=current.next;
                current.next=temp;
                head=current;
                current=current.prev;

            }

        }
    }

    public static void main(String args[]){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);
        dll.printLinkedList();
        dll.reverseLinkedList();
        System.out.println("Reversed Doubly Linked List:");
        dll.printLinkedList();

    }
}