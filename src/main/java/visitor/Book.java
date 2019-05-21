package visitor;

//concrete element
public class Book implements Visitable{
    public double price;
    public double weight;
    //accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
}
