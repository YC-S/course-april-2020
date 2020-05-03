package core.java.topic.java8.p3;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author shiyuanchen
 * @created 2020/05/02
 * @project course-april-2020
 */
public class WalReplace {

    public static void main(String[] args) {
        String str = "walabcwalexywalxzsfwalmx";
        String res = Arrays.asList(str.split("(?i)wal")).stream().collect(
            Collectors.joining("Sams"));
        System.out.println(res);
    }

}
