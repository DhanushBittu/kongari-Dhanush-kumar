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
public class AddAtLast {
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
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public void co() {
        Node temp = head;
        int c = 0;
        while (temp != null) {
            temp = temp.next;
            c++;
        }
        System.out.println("Count of LinkedList -> " + c);
    }
    public void addAtl(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
    }
    public void delf()
    {
        if(head==null)
        {
            return;
        }
        head=head.next;
    }
    
    public static void main(String[] args) {

        AddAtLast ob = new AddAtLast();

        ob.add(10);
        ob.add(20);
        ob.add(30);
        ob.add(40);
        ob.add(50);
        ob.delf();
        ob.p1();

        ob.co();

        ob.addAtl(60);

        ob.p1();
    }
}
