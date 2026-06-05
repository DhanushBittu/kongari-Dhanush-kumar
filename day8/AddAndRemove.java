package day8;

import java.util.LinkedList;

public class AddAndRemove {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(90);
        System.out.println(ll);

        ll.addFirst(89);
        System.out.println(ll);

        ll.addLast(890);
        System.out.println(ll);

        ll.offer(80);
        System.out.println(ll);

        ll.offerFirst(86);
        System.out.println(ll);

        ll.offerLast(20);
        System.out.println(ll);

        System.out.println(ll.get(1));

        System.out.println(ll.getFirst());

        System.out.println(ll.getLast());
    }
}