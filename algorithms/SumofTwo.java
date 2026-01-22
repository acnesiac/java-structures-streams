package common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumofTwo {
    public static void main(String[] args) {
        int target = 7;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i <list.size(); i++) {
            int complement = target - list.get(i);
            if ( hm.containsKey( complement )){
                int[] ints = new int[]{hm.get(complement), i};
                System.out.println(ints[0]  + " , "  + ints [1]);
            }
            else{
                // keep placing elements from the same list and their index
                hm.put( list.get(i), i );
            }
        }
    }
}
