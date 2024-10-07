package interviewCodingQuestion.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByStringLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi", "plum", "mango");

        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(string -> string.length()));
        System.out.println(collect);
    }
}
