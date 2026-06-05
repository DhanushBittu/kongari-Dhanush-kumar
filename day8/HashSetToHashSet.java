package day8;
import java.util.*;
public class HashSetToHashSet {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(5);
        HashSet<Integer> s2 = new HashSet<>();
        s2.add(5);
        s2.add(9);
        s2.add(4);
       // s1.addAll(s1);
      //  s1.retainAll(s2);
        System.out.println(s1.containsAll(s2));
    }
}
