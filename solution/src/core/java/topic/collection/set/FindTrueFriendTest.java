package core.java.topic.collection.set;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
class FindTrueFriendTest {

    @Test
    public void testFindTrueFriend() {
        List<String> f1 = new ArrayList<>(
            Arrays.asList("Alice", "Tom", "Williams"));
        List<String> f2 = new ArrayList<>(
            Arrays.asList("Alex", "Zoe", "Williams"));
        assertEquals(FindTrueFriend.findTrueFriend(f1, f2).toString(), "[Williams]");
        assertEquals(FindTrueFriend.findTrueFriend(f1, f2).size(), 1);
    }

}