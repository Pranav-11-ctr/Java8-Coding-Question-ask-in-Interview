package interviewCodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8CodingQuestion {
    public static void main(String[] args) {

//        Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list1= Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> resList1=listofEvenNumbers(list1);
        resList1.forEach(System.out::println);
    }

    private static List<Integer> listofEvenNumbers(List<Integer> list1) {
        return list1.stream().filter(num-> num%2==0).collect(Collectors.toList());
    }
}
