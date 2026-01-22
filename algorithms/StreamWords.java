package algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class StreamWords {
	public static void main(String[] args) {
		String str = "Hello World! a ";
		String[] s = str.split(" ");
		Arrays.stream(s)
				.sorted(Comparator.comparing(String::length).reversed())
				.forEach(System.out::println);
	}
}
