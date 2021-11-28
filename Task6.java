package by.overone.lesson27homework;

import java.util.function.Function;
import java.lang.String;

public class Task6 {

    public static void main(String[] args) {
        Function<String, Double> function = s -> {
            String[] words = s.split(" ");
            String d = "dollars";
            String e = "euros";
            String r = "rubles";
            double d1 = Double.parseDouble(s[0]);

            if (s[1].equals.d) {
                d1 = d1;
            } else {
                if (s[1].equals.e) {
                    d1 = d1 * 1.13;
                } else {
                    d1 = d1 * 0.0132;
                }
            }
            return d1;
            System.out.println(d1);
        };

        String function1 = "5 euros";
    }
}


