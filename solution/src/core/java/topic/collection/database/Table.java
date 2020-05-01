package core.java.topic.collection.database;

import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class Table {

    private int id;
    private String value;

    TreeMap<Integer, String> map = new TreeMap<>();

    /**
     * Create a table
     */
    public Table() {
        this.map = map;
    }

    /**
     * Add records
     */
    public boolean add(String value) {
        if (value != null) {
            if (map.size() == 0) {
                map.put(1, value);
            } else {
                map.put(map.lastKey() + 1, value);
            }
            return true;
        }
        return false;
    }

    /**
     * Delete record
     */
    public boolean delete(String value) {
        if (map.containsValue(value)) {
            map.entrySet().removeIf(entry -> entry.getKey().equals(value));
            return true;
        }
        return false;
    }

    /**
     * Edit record
     */
    public boolean edit(String value, String newValue) {
        if (map.containsValue(value)) {
            for (Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(value)) {
                    entry.setValue(newValue);
                    break;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Search record
     */
    public boolean search(String value) {
        return map.containsValue(value);
    }
}
