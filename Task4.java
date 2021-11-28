package by.overone.lesson27homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Task4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 0, -5, 7, -2, 9);
        Predicate<Integer> compare = x -> x < 0;
        numbers.removeIf(compare);

        System.out.println(numbers);
    }

}



