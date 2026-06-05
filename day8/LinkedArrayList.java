package day8;
import java.util.*;

public class LinkedArrayList {
    public static void main(String[] args) {
        ArrayList<String> emd = new ArrayList<>();
        emd.add("Bittu");
        emd.add("Seshu");
        emd.add("Ravi");
        LinkedHashSet<String> lhs = new LinkedHashSet<>(emd);
        System.out.println(lhs);

    }
}
