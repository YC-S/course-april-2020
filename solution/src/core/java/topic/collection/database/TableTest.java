package core.java.topic.collection.database;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
class TableTest {

    Table table = new Table();

    @Test
    public void testAdd() {
        assertTrue(table.add("Java"));
        assertTrue(table.add("JavaScript"));
        assertTrue(table.add("TypeScript"));
        assertTrue(table.add("Java"));
    }

    @Test
    public void testDelete() {
        assertTrue(table.add("Java"));
        assertTrue(table.delete("Java"));
    }

    @Test
    public void testEdit() {
        assertTrue(table.add("Java"));
        assertTrue(table.edit("Java", "JavaScript"));
    }

    @Test
    public void testSearch() {
        assertTrue(table.add("Java"));
        assertTrue(table.add("C"));
        assertTrue(table.add("C++"));
        assertTrue(table.add("Python"));
        assertTrue(table.add("JavaScript"));
        assertTrue(table.add("TypeScript"));
        assertTrue(table.search("Java"));
        assertTrue(table.search("C"));
        assertTrue(table.search("C++"));
        assertTrue(table.search("Python"));
        assertTrue(table.search("JavaScript"));
        assertTrue(table.search("TypeScript"));
    }
}