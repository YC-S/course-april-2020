package core.java.topic.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class DuplicateCharactersAndCounts {

    public static Map<Character, Integer> findDuplicateCharacters(
        String input) {
        Map<Character, Integer> map = new HashMap<>();
        char[] array = input.toCharArray();
        for (char c : array) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                map.remove(entry.getKey());
            }
        }
        return map;
    }
}
