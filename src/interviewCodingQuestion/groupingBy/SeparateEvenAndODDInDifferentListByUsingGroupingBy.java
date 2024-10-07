package interviewCodingQuestion.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SeparateEvenAndODDInDifferentListByUsingGroupingBy {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> listMap = list.stream().collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(listMap);
    }
}
