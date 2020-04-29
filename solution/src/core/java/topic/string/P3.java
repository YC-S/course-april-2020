package core.java.topic.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
public class P3 {

    public static void main(String[] args) {
        String url = "https://www.amazon.com/demo?test=abc";
        StringTokenizer stringTokenizer = new StringTokenizer(url, "://.?=");
        List<String> list = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            list.add(stringTokenizer.nextToken());
        }
        System.out.println(list);
    }

}
