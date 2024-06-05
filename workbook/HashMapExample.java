import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
