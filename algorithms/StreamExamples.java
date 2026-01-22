package algorithms;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {
	
	public static void main(String[] args) {		
		List<Integer> list = Arrays.asList(1, 2, 4, 5, 5);

		list.stream().distinct().forEach(System.out::println);

		List<Integer> collect =
				list.stream()
				.filter(value -> value % 2 == 0)
				.collect(Collectors.toList());
		list.stream().map(value -> value * value).forEach(System.out::println);

	}

}
