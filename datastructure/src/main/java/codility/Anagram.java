package codility;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        boolean anagram = isAnagram("asd","ard");
        System.out.println(anagram);
    }

    public static boolean isAnagram(String a,  String b){
        if (a.length()!= b.length()){
            return false;
        }

        char[] charArray = a.toCharArray();
        char[] charArray1 = b.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray1);

        Arrays.equals(charArray1,charArray);

        return true;

    }
}
