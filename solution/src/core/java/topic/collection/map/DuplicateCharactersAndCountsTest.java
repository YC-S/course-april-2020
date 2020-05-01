package core.java.topic.collection.map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
class DuplicateCharactersAndCountsTest {

    @Test
    public void test() {
        assertEquals(
            DuplicateCharactersAndCounts.findDuplicateCharacters("abccdeee")
                .size(), 2);

        assertEquals(
            DuplicateCharactersAndCounts.findDuplicateCharacters("abccdeee")
                .get("c"), 2);

        assertEquals(
            DuplicateCharactersAndCounts.findDuplicateCharacters("abccdeee")
                .get("e"), 3);
    }
}