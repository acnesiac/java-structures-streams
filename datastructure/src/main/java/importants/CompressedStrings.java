package importants;

public class CompressedStrings {
    public static void main(String[] args) {
        String str= "aabbccddeefff";
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(" -- " + (i+1)  );
            if ( str.length() <= i+1  || str.charAt(i) == str.charAt( i + 1)){
                System.out.println( "entra " + str.charAt(i));
                counter++;
                sb.append(str.charAt(i));
                sb.append(counter);
            }else{
                counter =0;
            }
        }
        System.out.println(sb);
    }
}
