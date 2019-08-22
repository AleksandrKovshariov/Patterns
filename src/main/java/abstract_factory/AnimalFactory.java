package abstract_factory;

//Usually singleton
public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create() {

        return new Duck();
    }
}
