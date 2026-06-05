package day8;
import java.util.*;
public class SetAdd {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(2);
        set.add(9);
        set.add(10);
        set.add(1);
        System.out.println(set);
        LinkedList<Integer> s = new LinkedList<>(set);
        System.out.println(s);
    }
}
