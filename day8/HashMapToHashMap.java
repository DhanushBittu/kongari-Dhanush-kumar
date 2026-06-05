package day8;
import java.util.*;
public class HashMapToHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmp = new HashMap<>();
        hmp.put(1, "Bittu");
        hmp.put(2, "Seshu");
        hmp.put(3, "Ravi");
        for(Integer c : hmp.keySet()) {
            if("Bittu".equals(hmp.get(c))) {
                System.out.println(c);
            }
        }
    }
}
