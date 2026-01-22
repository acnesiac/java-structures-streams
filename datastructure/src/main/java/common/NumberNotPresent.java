package common;

import java.util.*;

public class NumberNotPresent {

    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6,9};
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        HashSet<Integer> hm = new HashSet<>(Arrays.asList(arr));
        for (int i = 0; i < max+1; i++) {
            if  ( !hm.contains(i)){
                System.out.println(i);
            }
        }
    }


}
