

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        occurrencesInArray(new int[]{1,1,3,9,9});
    }

    public static void occurrencesInArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int counter = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    ++counter;
                }
            }
            if (counter % 2 != 0 ) {
                System.out.println(A[i]);
            }
        }
    }
}
