package com.java.examples;

public class LinkedListDemo {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node head = null;
        Node tail = null;
        public void addNodes(int data) {
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                tail.next = new_node;
                tail = tail.next;
            }
        }

        public void printNodes() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static void main(String args[]){
       LinkedListDemo demo=new LinkedListDemo();
       demo.addNodes(1);
       demo.addNodes(2);
       demo.addNodes(3);
       demo.addNodes(4);
       demo.printNodes();

    }

}
