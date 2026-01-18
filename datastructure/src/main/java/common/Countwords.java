package common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Countwords {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("adolfo", "ruiz", "adolfo");
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i);
            if( !hm.containsKey(key)){
                hm.put(key, 1);
            }
            else{
                Integer value = hm.get(key);
                hm.put(key, ++value );
            }
        }
        hm.entrySet().forEach( n -> System.out.println(n));
    }
}
