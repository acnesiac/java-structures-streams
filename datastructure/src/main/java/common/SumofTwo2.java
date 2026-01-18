package common;

import java.util.HashMap;

public class SumofTwo2 {
    public static void main(String[] args) {
        int target = 7;
        int []arrint= new int[]{1,2,3,4};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arrint.length; i++) {
            int complement = target - arrint[i] ;
            if (hm.containsKey(complement)){
                System.out.println( i  + " , " +  hm.get(complement) );
            }else{
                hm.put(arrint[i],i);
            }
        }
    }
}
