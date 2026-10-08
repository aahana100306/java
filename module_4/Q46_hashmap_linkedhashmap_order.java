import java.util.HashMap;
import java.util.LinkedHashMap;

public class Q46_hashmap_linkedhashmap_order {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(4, "D");
        hashMap.put(2, "B");

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(3, "C");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(4, "D");
        linkedHashMap.put(2, "B");

        System.out.println("HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }

        System.out.println();

        System.out.println("LinkedHashMap:");
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + " = " + linkedHashMap.get(key));
        }
    }
}