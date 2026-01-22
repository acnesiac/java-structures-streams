package codility;

import java.util.*;

public class WordsFrecuency {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,1,1,1, 2, 3, 4, 5, 5,5,5,5,5,5);
        HashMap <Integer,Integer> hm = new HashMap<>();
        for ( int i : list) {
            if (!hm.containsKey(i)){
               hm.put(i,1);

            }
            else {
                Integer o = hm.get(i);
                hm.put(i,++o);
            }
        }


        LinkedHashMap sortedMap = new LinkedHashMap();
        Set<Map.Entry<Integer, Integer>> set = hm.entrySet();
        for (Map.Entry entry : set) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }



        System.out.println(sortedMap);

    }
}
