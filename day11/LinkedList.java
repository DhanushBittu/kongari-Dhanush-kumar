package day11;
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    public void add(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }
    public void p1() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedList ob = new LinkedList();
        ob.add(10);
        ob.add(20);
        ob.add(30);
        ob.add(40);
        ob.add(50);
        ob.p1();
    }
}