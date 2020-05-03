package core.java.topic.java8.p2;

import java.util.List;

/**
 * @author shiyuanchen
 * @created 2020/05/02
 * @project course-april-2020
 */
@FunctionalInterface
public interface MyInterface {

    /**
     * This method triples all elements inside the list.
     *
     * @return A list of Integers
     */
    List<Integer> myMap(List<Integer> list);
}
