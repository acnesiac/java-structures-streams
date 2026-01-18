package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solve {


//    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//            Example 1:
//    Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//    Explanation:
//    There is no string in strs that can be rearranged to form "bat".
//    The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//    The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
//            Example 2:
//    Input: strs = [""]
//    Output: [[""]]
//    Example 3:
//    Input: strs = ["a"]
//    Output: [["a"]]
//
//    Constraints:
//            1 <= strs.length <= 104
//            0 <= strs[i].length <= 100
//    strs[i] consists of lowercase English letters.
//

    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List hm = new ArrayList();
        HashMap hm2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            boolean anagram = isAnagram(list.get(i), list);
            if (!anagram) {
                List l = new ArrayList();
                l.add(list.get(i));
                hm.add(l);
            }
        }
        System.out.println(hm);
    }


    public  static  boolean isAnagram(String string1, List<String> list){
        boolean equals = false;
        for (int i = 0; i < list.size(); i++) {
            if (string1.length() != list.get(i).length()) {
                return false;
            }
            char[] a1 = string1.toCharArray();
            char[] a2 = list.get(i).toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            equals = Arrays.equals(a1, a2);
        }

        return equals;

    }

}

