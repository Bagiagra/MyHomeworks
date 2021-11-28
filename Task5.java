package by.overone.lesson27homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 0, -5, 7, -2, 9);
        UnaryOperator<Integer> squareValue = x -> x * x;
       System.out.println(squareValue.apply(List<Integer> numbers));

    }

}
