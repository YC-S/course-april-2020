package core.java.topic.statict;

import java.io.Serializable;
import java.util.Date;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String isbn;
    private String name;
    private String author;
    private Date publishDate;

    public Book() {
    }

    public Book(long id, String isbn, String name, String author,
        Date publishDate) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
            "id=" + id +
            ", isbn='" + isbn + '\'' +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", publishDate=" + publishDate +
            '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book(1, "978-0135166307",
            "Core Java Volume I--Fundamentals", "Cay S. Horstmann",
            new Date(118, 5, 25));
        System.out.println(book1.toString());
    }
}
