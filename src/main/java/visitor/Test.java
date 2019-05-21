package visitor;

public class Test {

    public static void main(String[] args) {
        Book book = new Book();
        book.price = 1;
        book.weight = 50;

        PostageVisitor visitor = new PostageVisitor();
        book.accept(visitor);
        System.out.println(visitor.getTotalPostage());
    }
}
