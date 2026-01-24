
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AbsDistinct {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, -4};
		//System.out.println( AbsDistinct.solution(a)
		//);

		List<Integer> list = Arrays.asList(1, 8,1, 2, 3, 4, 5, -4, -4);
		list.stream().distinct().forEach(System.out::println);

	}
	static int solution(int [] A){
		Set set =  new HashSet();
		for (int  i  = 0 ; i < A.length ; i ++){
			set.add(Math.abs(i));
		}
		return set.size();	
	}
}
