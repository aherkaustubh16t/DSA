package DSA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMaping {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

//        Adding elemnt in HashMap
        map.put("Kaustubh",1);
        map.put("Ramesh",2);
        map.put("Aher",3);
        map.put("Aher",4);

//        dispalying Hashmap
        System.out.println(map);

//        Search
        System.out.println(map.containsKey("Kaustubh"));
        System.out.println(map.containsValue(3));

        System.out.println(map.get("Kaustubh"));

//        Iteratre
        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

//        Remove
        map.remove("Ramesh");
        System.out.println(map);
    }
}
