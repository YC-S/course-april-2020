package core.java.topic.java8.p2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shiyuanchen
 * @created 2020/05/02
 * @project course-april-2020
 */

public class MyStream implements MyInterface {


    @Override
    public List<Integer> myMap(List<Integer> list) {
        return list.stream().map(e -> e * 3).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> res = new MyStream().myMap(list);
        System.out.println(res);
    }
}
