package algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class WordsOcurrence {
	public static void main(String[] args) {
		String s = "1 22 33 44 5555 6666 7777  88 99 ";
		String[] words = s.split(" ");
		Arrays.stream(words)
				.sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
	}
}
