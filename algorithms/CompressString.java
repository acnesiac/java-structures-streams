public class CompressString {
    public static void main(String[] args) {
        String str = "aaabbbcccddddd";
        int counter = 0;
        StringBuilder compressed = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {
            counter++;
            if ( i + 1 >= str.length() || str.charAt( i ) != str.charAt( i+1 ) ){
                compressed.append(str.charAt(i));
                compressed.append(counter);
                counter = 0;
            }
        }
        System.out.println(compressed);
    }
}
