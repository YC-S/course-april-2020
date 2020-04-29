package core.java.topic.string;

import java.util.Arrays;
import java.util.List;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
public class P4 {

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};
        List<String> list = Arrays.asList(array);
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        System.out.println(sb.toString());
    }
}
