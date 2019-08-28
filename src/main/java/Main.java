

import javax.swing.event.ChangeListener;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Design Patterns");
        BookVisitor bookVisitor = new BookVisitor();
        book.visit(bookVisitor);
        System.out.println(bookVisitor.getUpper());
    }

}interface Visitor<T>{
    void operation(T book);
}
interface Visitable<T>{
    void visit(Visitor<T> v);
}class Book implements Visitable<Book>{
    private String titleName;

    public String getTitleName() {
        return titleName;
    }

    public Book(String titleName) {
        this.titleName = titleName;
    }

    @Override
    public void visit(Visitor<Book> v) {
        v.operation(this);
    }
}class BookVisitor implements Visitor<Book>{
    private String upper;
    @Override
    public void operation(Book book) {
        upper = book.getTitleName().toUpperCase();
    }

    public String getUpper() {
        return upper;
    }
}
