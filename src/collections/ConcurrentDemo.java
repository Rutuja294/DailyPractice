//package collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class ConcurrentDemo9 {
//
//    public static void main(String[] args) {
//
//        HashMap<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Java");
//        map.put(2, "Python");
//        map.put(3, "Spring");
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//
//            if (entry.getKey() == 2) {
//                map.remove(2);          // Throws Exception
//            }
//        }
//    }
//}
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Spring");

        Iterator<Map.Entry<Integer, String>> itr =
                map.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<Integer, String> entry = itr.next();

            if (entry.getKey() == 2) {
                itr.remove();
            }
        }

        System.out.println(map);
    }
}