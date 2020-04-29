package core.java.topic.oop;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
public class SqlServerConnection implements DatabaseConnectionInterface{

    @Override
    public DatabaseConnection getConnection() {
        return new DatabaseConnection("SqlServer");
    }
}
