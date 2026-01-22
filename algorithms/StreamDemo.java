package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> collect = list.stream().map(n -> n + 1).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

}
