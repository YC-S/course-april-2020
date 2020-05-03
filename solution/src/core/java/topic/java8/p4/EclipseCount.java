package core.java.topic.java8.p4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author shiyuanchen
 * @created 2020/05/02
 * @project course-april-2020
 */
public class EclipseCount {

    public static void main(String[] args) {
        String str = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";
        Map<String, Integer> res = Arrays.asList(str.split(" ")).stream().collect(
            Collectors.groupingBy(o -> o.toLowerCase(), Collectors.summingInt(o -> 1)));
        for (Entry<String, Integer> entry : res.entrySet()) {
            System.out.println(entry);
        }
    }
}
