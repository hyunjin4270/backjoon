
import java.util.HashMap;
import java.util.Map;

    public class HashMapExample {
        public static void main(String[] args) {
            // HashMap 생성
            HashMap<String, Integer> map = new HashMap<>();

            // 요소 추가
            map.put("apple", 1);
            map.put("banana", 2);
            map.put("cherry", 3);
            // 요소 조회
            System.out.println("Value for key 'apple': " + map.get("apple")); // 출력: 1
            System.out.println("Value for key 'banana': " + map.get("banana")); // 출력: 2

            // 요소 삭제
            map.remove("banana");

            // 요소 존재 확인
            System.out.println("Contains key 'banana': " + map.containsKey("banana")); // 출력: false
            System.out.println("Contains value 2: " + map.containsValue(2)); // 출력: false

            // 모든 키와 값 출력
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // 모든 키 출력
            for (String key : map.keySet()) {
                System.out.println("Key: " + key);
            }

            // 모든 값 출력
            for (Integer value : map.values()) {
                System.out.println("Value: " + value);
            }

            // 크기 확인
            System.out.println("Size of map: " + map.size()); // 출력: 2
        }
    }
