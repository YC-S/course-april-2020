package core.java.topic.oop;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
public interface DatabaseConnectionInterface {

    /**
     * initialize data source
     * @return database connection
     */
    DatabaseConnection getConnection();
}
