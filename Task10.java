package by.overone.lesson27homework;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import com.sun.xml.internal.stream.Entity;

import java.util.List;
import java.util.stream.Stream;

public class Task10 {

    public static void main(String[] args) {

        Stream<Equipment> equip = Stream.of(new Equipment("bb2", 3), new Equipment("cc1", 5), new Equipment("bb5", 7), new Equipment("aa6", 2), new Equipment("bb0", 1));

        equip.filter(a -> a.getName().substring(0, 1) == "bb" && a.getId() > 3);
        equip.forEach(a -> System.out.println(equip));

    }

}
