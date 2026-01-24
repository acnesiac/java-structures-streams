
public class CompressStrings {
    public static void main(String[] args) {
        String arr = "aabcdeefghijklmmmmm";
        char[] charArray = arr.toCharArray();
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            char element = charArray[i];
            ++counter;
            if (i + 1 >= charArray.length  ||  element != charArray[i +1]){
                sb.append(element);
                sb.append(counter);
                counter=0;
            }



        }
        System.out.println(sb);
    }
}
