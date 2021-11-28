package by.overone.lesson27homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add ("aa nb kj ji");
        list.add("dy vz pa fn");
        list.add("aa cz eh px");
        list.add("ha kn lw qo");
        list.add("pb aa yd lu");
        list.stream();

        Stream<String> strWithAa = list.stream().filter(a -> a.substring(0,1)=="aa");
        List<String> result = strWithAa.collect(Collectors.toList());
        System.out.println(result);
    }
}
