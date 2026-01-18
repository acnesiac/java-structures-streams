package codility;

import java.util.*;

public class ConsecutiveRepeater {
    public static void main(String[] args) {
        String chars = "a";
        char[] charArray = chars.toCharArray();
        consecutive(charArray);
    }

    public static void consecutive(char[] charArray){

        List l = new ArrayList<>();
        HashMap hm = new HashMap<Character,Integer>();
        for (int i = 0; i < charArray.length; i++) {
            if ( !hm.containsKey(charArray[i]) ){
                hm.put(charArray[i],1);

                System.out.println(charArray);

            }else{
                Integer o = (Integer) hm.get(charArray[i]);
                hm.put(charArray[i], ++o);


            }


        }


        Set set = hm.entrySet();
        System.out.println(set);

        for (Object entry : set){

            Map.Entry entry1 = (Map.Entry) entry;
            if( (Integer) entry1.getValue()!= 1 )
                System.out.println(entry1.getValue().toString() + entry1.getKey());
        }


    }
}
