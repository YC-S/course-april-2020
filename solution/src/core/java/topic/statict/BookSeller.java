package core.java.topic.statict;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
public class BookSeller {

    public static class Book {

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
    }

    public static void sellBooks(List<BookSeller.Book> booksList) {
        for (BookSeller.Book book : booksList) {
            System.out.println(book.toString());
        }
    }

    public static void main(String[] args) {
        List<BookSeller.Book> booksList = new ArrayList<>();
        BookSeller.Book book1 = new BookSeller.Book(1, "978-0135166307",
            "Core Java Volume I--Fundamentals", "Cay S. Horstmann",
            new Date(118, 5, 25));
        BookSeller.Book book2 = new BookSeller.Book(2, "978-1338299144",
            "Harry Potter and the Sorcerer's Stone", "J.K. Rowling",
            new Date(118, 6, 26));
        booksList.add(book1);
        booksList.add(book2);
        sellBooks(booksList);
    }
}
